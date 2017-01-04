package com.harsh.starringharsh.EDGE;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

public class EventList extends AppCompatActivity {

    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(0,0);
        setContentView(R.layout.activity_event_list);

        SharedPreferences sharedPreferences = getSharedPreferences("EventsChoice", Context.MODE_PRIVATE);
        int n = sharedPreferences.getInt("PrimaryChoice", 99);

        //TextView tv = (TextView) findViewById(R.id.tvActEvevtList);
        // tv.setText(""+n);

        Master master = new Master();
        final String[] events;
        switch (n)
        {
            case 0:
                events = master.events0; break;

            case 1:
                events = master.events1; break;

            case 2:
                events = master.events2; break;

            case 3:
                events = master.events3; break;

            case 4:
                events = master.events4; break;

            case 5:
                events = master.events5; break;

            case 6:
                events = master.events6; break;

            case 7:
                events = master.events7; break;

            case 8:
                events = master.events8; break;

            default:
                events = null;
        }

        int l = events.length;

        LinearLayout ll = (LinearLayout) findViewById(R.id.linearlayout2);
        if(l==0)
        {
            Intent intent = new Intent(EventList.this, ComingSoon.class);
            startActivity(intent);
        }

            final SharedPreferences.Editor editor = sharedPreferences.edit();
            Typeface myfont1 = Typeface.createFromAsset(getAssets(), "ColabThi.otf");

        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        int height = metrics.heightPixels;
        int width = metrics.widthPixels;


        final ImageButton eventButton[] = new ImageButton[l];
            for (i = 0; i < l; i++) {
                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                        width,
                        width/2);
                eventButton[i] = new ImageButton(this);
                eventButton[i].setId(i);
                eventButton[i].setBackgroundResource(master.eventsImg.get(events[i]));

                final int id_ = eventButton[i].getId();
                ll.addView(eventButton[i], params);
            }

            for (i = 0; i < l; i++) {
                eventButton[i].setOnClickListener(new View.OnClickListener() {
                    int j = i;
                    int l = events.length;
                    int k = l;
                    String name = events[i];

                    @Override
                    public void onClick(View view) {
                        editor.putInt("SecondaryChoice", j);
                        editor.putInt("Number", k);
                        editor.putString("Name", name);
                        editor.commit();
                        Intent intent = new Intent(EventList.this, EventDetails.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }



    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        Intent intent = new Intent(EventList.this, MainActivity.class);
        startActivity(intent);
        android.os.Process.killProcess(android.os.Process.myPid());
        finish();
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(0,0);
    }
}
