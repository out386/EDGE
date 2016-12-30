package com.harsh.starringharsh.EDGE;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class EventList extends AppCompatActivity {

    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_list);

        SharedPreferences sharedPreferences = getSharedPreferences("EventsChoice", Context.MODE_PRIVATE);
        int n = sharedPreferences.getInt("PrimaryChoice", 99);

        TextView tv = (TextView) findViewById(R.id.tvActEvevtList);
        tv.setText(""+n);
        
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
            
            default:
                events = null;
        }
        
        int l = events.length;



        LinearLayout ll = (LinearLayout) findViewById(R.id.activity_event_list);
        final SharedPreferences.Editor editor = sharedPreferences.edit();

        final Button eventButton[] = new Button[l];
        for(i=0; i<l; i++)
        {
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT);
            eventButton[i] = new Button(this);
            eventButton[i].setId(i);
            final int id_ = eventButton[i].getId();
            eventButton[i].setText(events[i]);
            ll.addView(eventButton[i], params);
        }

        for(i=0; i<l; i++)
        {
            eventButton[i].setOnClickListener(new View.OnClickListener() {
                int j = i;
                String name = events[i];
                @Override
                public void onClick(View view) {
                    editor.putInt("SecondaryChoice", j);
                    editor.putString("Name", name);
                    editor.commit();
                    Intent intent = new Intent(EventList.this, EventDetails.class);
                    startActivity(intent);

                }
            });
        }
        
        
    }
}
