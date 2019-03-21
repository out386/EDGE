package com.edge.starringharsh.EDGE.utils;

import android.support.design.widget.Snackbar;
import android.view.View;

public class SnackbarUtils {
    private static Snackbar snackbar;

    private static void showSnackbar(View view, int text, int actionText,
                                     View.OnClickListener listener, int duration) {
        snackbar = Snackbar.make(view, text, duration);

        if (listener != null)
            snackbar.setAction(actionText, listener);

        snackbar.show();
    }

    public static void showRefresh(View view, int text, int actionText,
                                   View.OnClickListener listener) {
        showSnackbar(view, text, actionText, listener, Snackbar.LENGTH_INDEFINITE);
    }

    public static void show(View view, int text) {
        showRefresh(view, text, -1, null);
    }

    public static void showNoDuplicate(View view, int text) {
        if (snackbar == null)
            showRefresh(view, text, -1, null);
    }

    public static void showTemporary(View view, int text) {
        showSnackbar(view, text, -1, null, Snackbar.LENGTH_SHORT);
    }

    public static void dismiss() {
        if (snackbar != null)
            snackbar.dismiss();
        snackbar = null;
    }
}
