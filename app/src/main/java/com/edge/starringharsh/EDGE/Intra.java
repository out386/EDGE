package com.edge.starringharsh.EDGE;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.edge.starringharsh.EDGE.utils.ButtonUtils;


public class Intra extends AppCompatActivity {
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(0,0);
        setContentView(R.layout.activity_intra);

        LinearLayout ll = (LinearLayout)findViewById(R.id.linearlayout);

        TextView tvHead = (TextView) findViewById(R.id.tvHeader);
        tvHead.setTypeface(Typeface.createFromAsset(getAssets(),"TypoGraphica.otf"));

        Master master = new Master();
        final String categories[] = master.intraCat;
        int l = categories.length;

        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        int height = metrics.heightPixels;
        int width = metrics.widthPixels;

        final ImageButton cat[] = new ImageButton[l];
        int px = ButtonUtils.dpToPx(this, 200);
        for(i=0;i<l;i++)

        {
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                    px, px);
            RelativeLayout flTest = new RelativeLayout(this);
            cat[i] = new ImageButton(this);
            cat[i].setBackgroundResource(master.categoriesImg.get(categories[i]));
            TextView caption = ButtonUtils.getCaptionTv(this, categories[i]);
            ll.addView(cat[i], params);
            ll.addView(caption);

            /*flTest.addView(cat[i],params);
            ll.addView(flTest, params);*/
        }

        for(i=0; i<l; i++)
        {
            cat[i].setOnClickListener(new View.OnClickListener() {
                int j = i;
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Intra.this, IntraEvents.class);
                    intent.putExtra("category", categories[j]);
                    startActivity(intent);
                }
            });
        }

    }
}

