package com.edge.starringharsh.EDGE;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class KukuKube extends AppCompatActivity {

    boolean doubleBackToExitPressedOnce = false;
    DisplayMetrics metrics;
    int width, w;
    int r, c, ansi, ansj, rgbr, rgbg, rgbb, i=0, j=0, n=8, sco=0, less=10, tg=5000, totTime=0;
    float dp;
    TextView timerValue, score;
    Thread timer;
    float sec;
    long startTime = 0L;
    private Handler customHandler = new Handler();
    long timeInMilliseconds = 0L;
    long timeSwapBuff = 0L;
    long updatedTime = 0L;
    Button odd, temp, scrs, replay, menu;
    Random sel = new Random();
    Bitmap myBitmap;
    ActionBar actionBar;
    LinearLayout container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuku_kube);

        metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        width = metrics.widthPixels;
        w= (int)(width*0.9);

        timerValue = (TextView) findViewById(R.id.tvTimer);
        startTime = SystemClock.uptimeMillis();
        customHandler.postDelayed(updateTimerThread, 0);
        odd = (Button) findViewById(R.id.b00);
        n=2;

        container = (LinearLayout) findViewById(R.id.llContainer);
        ViewGroup.LayoutParams paramsCont = container.getLayoutParams();
        paramsCont.height = (int) ((int)(width*0.9)+ 4*getResources().getDisplayMetrics().density);
        paramsCont.width = (int) ((int)(width*0.9)+ 4*getResources().getDisplayMetrics().density);
        container.setPadding(0,0,0,0);

        ansi = sel.nextInt(n-1);
        ansj = sel.nextInt(n-1);
        rgbr = sel.nextInt(245);
        rgbg = sel.nextInt(245);
        rgbb = sel.nextInt(245);
        for(i=0; i<n; i++)
        {
            for(j=0; j<n; j++)
            {
                int ids = this.getResources().getIdentifier("b"+i+j, "id", this.getPackageName());
                temp = (Button) findViewById(ids);
                ViewGroup.LayoutParams params = temp.getLayoutParams();
                params.height = (int)(w/2);
                params.width = (int)(w/2);
                temp.setLayoutParams(params);
                temp.setBackgroundColor(Color.rgb(rgbr, rgbg, rgbb));
            }
        }
        int ids = this.getResources().getIdentifier("b"+ansi+ansj, "id", this.getPackageName());
        odd = (Button) findViewById(ids);
        odd.setBackgroundColor(Color.rgb(rgbr+10, rgbg+10, rgbb+10));


    }

    private Runnable updateTimerThread = new Runnable() {
        public void run() {
            if(sco==15)
                tg = 3000;
            timeInMilliseconds =tg- (SystemClock.uptimeMillis() - startTime);
            updatedTime = timeSwapBuff + timeInMilliseconds;
            int secs = (int) (updatedTime / 1000);
            secs = secs % 60;
            int milliseconds = (int) (updatedTime % 1000)/100;
            timerValue.setText("" + String.format("%02d", secs) + ":"
                    + String.format("%01d", milliseconds));
            customHandler.postDelayed(this, 0);
            if(timeInMilliseconds<10)
            {
                customHandler.removeCallbacks(updateTimerThread);
                timerValue.setText("00:0");
                Intent intent = new Intent(KukuKube.this, SubmitScore.class);
                intent.putExtra("Score", ""+sco);
                intent.putExtra("Time", ""+totTime);
                startActivity(intent);
                finish();
            }
            odd.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub
                    startTime = SystemClock.uptimeMillis();
                    odd.setClickable(false);
                    sco++;
                    totTime+=(updatedTime/100);
                    if(sco==1)
                        n=3;
                    else if(sco==2)
                        n=4;
                    else if (sco==3)
                        n=5;
                    else if ((sco==4)||(sco==5))
                        n=6;
                    else
                        n=8;
                    score = (TextView) findViewById(R.id.tvScore);
                    score.setText("Score: "+sco);
                    ansi = sel.nextInt(n);
                    ansj = sel.nextInt(n);
                    rgbr = sel.nextInt(245);
                    rgbg = sel.nextInt(245);
                    rgbb = sel.nextInt(245);
                    ViewGroup.LayoutParams paramsCont = container.getLayoutParams();
                    paramsCont.height = (int) ((int)(width*0.9)+ 2*n*getResources().getDisplayMetrics().density);
                    paramsCont.width = (int) ((int)(width*0.9)+ 2*n*getResources().getDisplayMetrics().density);
                    for(i=0; i<n; i++)
                    {
                        for(j=0; j<n; j++)
                        {
                            int ids = KukuKube.this.getResources().getIdentifier("b"+i+j, "id", KukuKube.this.getPackageName());
                            temp = (Button) findViewById(ids);
                            ViewGroup.LayoutParams params = temp.getLayoutParams();
                            if(n==10)
                            {
                                less = 8;
                            }
                            else if(n==20)
                            {
                                less = 5;
                            }

                            params.height =  (int)(w/n);
                            params.width =  (int)(w/n);

                            temp.setLayoutParams(params);
                            temp.setBackgroundColor(Color.rgb(rgbr, rgbg, rgbb));
                        }
                    }
                    int ids = KukuKube.this.getResources().getIdentifier("b"+ansi+ansj, "id", KukuKube.this.getPackageName());
                    odd = (Button) findViewById(ids);
                    odd.setBackgroundColor(Color.rgb(rgbr+less, rgbg+less, rgbb+less));
                }
            });
        }
    };

    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            // Clear your session, remove preferences, etc.
            customHandler.removeCallbacks(updateTimerThread);
            Intent intent = new Intent(KukuKube.this, MainMenu.class);
            startActivity(intent);
            finish();
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce=false;
            }
        }, 2000);
    }


    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(0,0);
    }

}
