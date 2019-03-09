package com.edge.starringharsh.EDGE.utils;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.support.v4.content.res.ResourcesCompat;
import android.text.Html;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.edge.starringharsh.EDGE.R;

public class ButtonUtils {
    public static final int MARGIN_TYPE_ALL = 0;
    public static final int MARGIN_TYPE_NO_BOTTOM = 1;
    public static final int MARGIN_TYPE_NO_TOP = 2;

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


    public static TextView getResultsTv(Context context, String text, boolean center) {
        return getResultsTv(context, text, center, 15, MARGIN_TYPE_ALL, false);
    }

    public static TextView getResultsTv(Context context, String text, boolean center,
                                        int size, int marginType, boolean isHtml) {
        LinearLayout.LayoutParams textParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        int margin = dpToPx(context, 5);
        TextView textV = new TextView(context);

        switch (marginType) {
            case MARGIN_TYPE_ALL:
                textParams.setMargins(margin, margin, margin, margin);
                textV.setBackgroundResource(R.drawable.textroundborder);
                break;
            case MARGIN_TYPE_NO_BOTTOM:
                textParams.setMargins(margin, margin, margin, 0);
                textV.setBackgroundResource(R.drawable.textroundborder_top);
                break;
            case MARGIN_TYPE_NO_TOP:
                textParams.setMargins(margin, 0, margin, margin);
                textV.setBackgroundResource(R.drawable.textroundborder_bottom);
                break;
        }

        textV.setLayoutParams(textParams);
        textV.setTextSize(size);
        textV.setTextColor(0xFF000000);
        int padding = dpToPx(context, 20);
        textV.setPadding(padding, padding, padding, padding);

        if (center)
            textV.setGravity(Gravity.CENTER_HORIZONTAL);

        if (isHtml) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                textV.setText(Html.fromHtml(text, Html.FROM_HTML_MODE_COMPACT));
            } else {
                textV.setText(Html.fromHtml(text));
            }
        } else {
            textV.setText(text);
        }

        return textV;
    }

    public static View getSeparator(Context context) {
        ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                dpToPx(context, 1));
        View view = new View(context);
        view.setBackgroundResource(R.color.colorBack);
        view.setLayoutParams(params);
        return view;
    }

    public static int dpToPx( Context context, int dp){
        DisplayMetrics dm = context.getResources().getDisplayMetrics();
        return dp * (dm.densityDpi / DisplayMetrics.DENSITY_DEFAULT);
    }
}
