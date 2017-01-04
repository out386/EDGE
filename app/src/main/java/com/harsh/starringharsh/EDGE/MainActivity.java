package com.harsh.starringharsh.EDGE;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(0,0);
        setContentView(R.layout.activity_main);

    LinearLayout ll = (LinearLayout)findViewById(R.id.linearlayout);
        SharedPreferences sharedPreferences = getSharedPreferences("EventsChoice", Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPreferences.edit();

        Typeface myfont1 = Typeface.createFromAsset(getAssets(), "ColabThi.otf");
        Master master = new Master();
        String categories[] = master.categories;
        int l = categories.length;

        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        int height = metrics.heightPixels;
        int width = metrics.widthPixels;

        final ImageButton cat[] = new ImageButton[l];
        //final TextView tex[]=new TextView[l];
         for(i=0;i<l;i++)

        {
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                    width,
                    width/2);
            RelativeLayout flTest = new RelativeLayout(this);
            cat[i] = new ImageButton(this);
            cat[i].setBackgroundResource(master.categoriesImg.get(categories[i]));
            //cat[i].getBackground().setAlpha(80);
           // cat[i].setBackgroundColor(Color.parseColor("#627275"));
            params.setMargins(0, 5, 0, 0);

            /*tex[i]=new TextView(this);
            tex[i].setTextColor(Color.BLACK);
            tex[i].setTypeface(myfont1);
            tex[i].setTypeface(Typeface.DEFAULT_BOLD);
            tex[i].setGravity(Gravity.CENTER);
            tex[i].setTextSize(TypedValue.COMPLEX_UNIT_PT,15);
            tex[i].setId(i);
            final int id_ = cat[i].getId();
            tex[i].setText(categories[i]);
            flTest.addView(cat[i],params);
            flTest.addView(tex[i],params);*/
            flTest.addView(cat[i],params);
            ll.addView(flTest, params);
           // ll.addView(tex[i],params);
        }

        for(i=0; i<l; i++)
        {
            cat[i].setOnClickListener(new View.OnClickListener() {
                int j = i;
                @Override
                public void onClick(View view) {
                    editor.putInt("PrimaryChoice", j);
                    editor.commit();
                    Intent intent = new Intent(MainActivity.this, EventList.class);
                    startActivity(intent);
                    finish();
                }
            });
        }

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        Intent intent = new Intent(MainActivity.this, MainMenu.class);
        startActivity(intent);
        finish();
    }
}

