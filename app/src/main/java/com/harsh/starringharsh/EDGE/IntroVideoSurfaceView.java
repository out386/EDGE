package com.harsh.starringharsh.EDGE;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.os.Build;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import com.harsh.starringharsh.EDGE.R;

import java.io.IOException;
import java.util.prefs.Preferences;

public class IntroVideoSurfaceView extends SurfaceView implements SurfaceHolder.Callback {

    private static final String TAG = "INTRO_SF_VIDEO_CALLBACK";
    private MediaPlayer mp=null;
    private boolean has_started = false;
    int a=0, x=0;
    Preferences pref;

    @TargetApi(value = Build.VERSION_CODES.LOLLIPOP | Build.VERSION_CODES.M | Build.VERSION_CODES.LOLLIPOP_MR1 | Build.VERSION_CODES.N | Build.VERSION_CODES.N_MR1)
    public IntroVideoSurfaceView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }


    public IntroVideoSurfaceView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public IntroVideoSurfaceView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public IntroVideoSurfaceView(Context context) {
        super(context);
        init();
    }

    private void init() {
        mp = new MediaPlayer();
        getHolder().addCallback(this);
    }

    @Override public void surfaceCreated(SurfaceHolder holder) {
        AssetFileDescriptor afd = getResources().openRawResourceFd(R.raw.edgbgblack);
        try {
            if(a==0) {
                mp.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getDeclaredLength());
                mp.prepareAsync();
                a++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        pref = Preferences.userNodeForPackage(this.getClass());
        x = pref.getInt("seek", 0);

        android.view.ViewGroup.LayoutParams lp = getLayoutParams();
            lp.height = getHeight();
            lp.width = getWidth();

            setLayoutParams(lp);
            mp.setDisplay(getHolder());
            mp.setLooping(true);
            //mp.start();
            mp.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mediaPlayer) {
                    mediaPlayer.seekTo(x);
                    mediaPlayer.start();
                }
            });
    }

    @Override public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
        mp.start();
    }

    @Override public void surfaceDestroyed(SurfaceHolder holder) {
        x = mp.getCurrentPosition();
        mp.stop();
        pref.putInt("seek", x);
        try {
            finalize();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}