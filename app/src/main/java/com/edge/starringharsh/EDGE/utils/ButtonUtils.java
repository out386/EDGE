package com.edge.starringharsh.EDGE.utils;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v4.content.res.ResourcesCompat;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.edge.starringharsh.EDGE.R;

public class ButtonUtils {
    public static TextView getCaptionTv(Context context, String text) {
        LinearLayout.LayoutParams textParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        TextView textV = new TextView(context);
        textV.setLayoutParams(textParams);
        textV.setText(text);
        textV.setTextSize(30);
        textV.setTextColor(0xFFFFFFFF);
        textV.setGravity(Gravity.CENTER_HORIZONTAL);
        int tbPadding = dpToPx(context, 30);
        int lrPadding = dpToPx(context, 10);
        textV.setPadding(lrPadding, tbPadding, lrPadding, tbPadding);
        Typeface typeface = ResourcesCompat.getFont(context, R.font.megrim);
        textV.setTypeface(typeface);
        return textV;
    }

    public static int dpToPx( Context context, int dp){
        DisplayMetrics dm = context.getResources().getDisplayMetrics();
        return dp * (dm.densityDpi / DisplayMetrics.DENSITY_DEFAULT);
    }
}
