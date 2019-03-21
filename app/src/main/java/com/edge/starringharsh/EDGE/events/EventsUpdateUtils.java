package com.edge.starringharsh.EDGE.events;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.preference.PreferenceManager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class EventsUpdateUtils {
    private static final String DETAILS_VERSION_URL = "https://firebasestorage.googleapis.com/v0/b/edge-8fc5e.appspot.com/o/event_details%2Fdetails_version?alt=media";
    private static final String LAST_KNOWN_VERSION = "lastKnownVersion";
    private static final long VERSION_VALIDITY_MS = 5 * 60000;

    private static long lastCheckedTime = 0;

    /**
     * Checks if new data might be available on the server. If the version number in the file
     * referred to by {@link #DETAILS_VERSION_URL} does not match {@code lastKnownEventVersion}, it
     * is assumed that new data for this event might be available.
     *
     * @param context               Duh
     * @param lastKnownEventVersion The last details version this event knows
     * @param listener              A listener that is called with the results
     */
    public void isCacheValid(Context context, String lastKnownEventVersion, OnCacheCheckListener listener) {
        SharedPreferences defaultPrefs = PreferenceManager.getDefaultSharedPreferences(context);
        String lastKnownVersion = defaultPrefs.getString(LAST_KNOWN_VERSION, "0");

        /* If the version details file was fetched less than VERSION_VALIDITY_MS ago, assume that
         * the versions details is still valid. This reduces the number of times the server gets hit
         * (there's a limited number of requests available), at the risk of the user still seeing
         * old data for a while.
         */
        if (SystemClock.uptimeMillis() - lastCheckedTime < VERSION_VALIDITY_MS) {
            if (lastKnownEventVersion.equals(lastKnownVersion))
                listener.onComplete(true, lastKnownVersion);
            else
                listener.onComplete(false, lastKnownVersion);
            return;
        }

        new Thread(() -> {
            String currentVersion;
            try {
                URL url = new URL(DETAILS_VERSION_URL);
                BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
                currentVersion = br.readLine();
                br.close();
            } catch (IOException e) {
                listener.onComplete(false, lastKnownEventVersion);
                return;
            }

            setLastKnownVersion(defaultPrefs, currentVersion);
            if (lastKnownEventVersion.equals(currentVersion)) {
                listener.onComplete(true, currentVersion);
            } else {
                listener.onComplete(false, currentVersion);
            }

        }).start();

    }

    private void setLastCheckedTime() {
        lastCheckedTime = SystemClock.uptimeMillis();
    }

    private void setLastKnownVersion(SharedPreferences prefs, String version) {
        prefs.edit()
                .putString(LAST_KNOWN_VERSION, version)
                .apply();
        setLastCheckedTime();
    }

    public interface OnCacheCheckListener {
        void onComplete(boolean isCacheValid, String cacheVersion);
    }
}
