package com.edge.starringharsh.EDGE;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.edge.starringharsh.EDGE.utils.ButtonUtils;

public class EventList extends BaseActivity {

    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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

            case 9:
                events = master.events9; break;

            case 10:
                events = master.events10; break;

            case 11:
                events = master.events11; break;

            default:
                events = null;
        }

        int l = events.length;


        TextView tvHead = (TextView) findViewById(R.id.tvHeader);
        tvHead.setTypeface(Typeface.createFromAsset(getAssets(),"TypoGraphica.otf"));
        tvHead.setText(master.categories[n]);

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
        int dp = ButtonUtils.dpToPx(this, 200);
            for (i = 0; i < l; i++) {
                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                        dp,dp);
                TextView text = ButtonUtils.getCaptionTv(this, events[i]);
                eventButton[i] = new ImageButton(this);
                eventButton[i].setId(i);
                eventButton[i].setBackgroundResource(master.eventsImg.get(events[i]));

                ll.addView(eventButton[i], params);
                ll.addView(text);
            }

            for (i = 0; i < l; i++) {
                eventButton[i].setOnClickListener(new View.OnClickListener() {
                    int j = i;
                    int l = events.length;
                    int k = l;
                    String name = events[i];

                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(EventList.this, EventDetails.class);
                        intent.putExtra(EventDetails.EVENT_NAME, name);
                        startActivity(intent);
                    }
                });
            }



    }

    }
