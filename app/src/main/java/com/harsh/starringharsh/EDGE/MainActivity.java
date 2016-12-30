package com.harsh.starringharsh.EDGE;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout ll = (LinearLayout) findViewById(R.id.activity_main);
        SharedPreferences sharedPreferences = getSharedPreferences("EventsChoice", Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPreferences.edit();


        Master master = new Master();
        String categories[] = master.categories;
        int l = categories.length;

        final Button cat[] = new Button[l];
        for(i=0; i<l; i++)
        {
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT);
            cat[i] = new Button(this);
            cat[i].setId(i);
            final int id_ = cat[i].getId();
            cat[i].setText(categories[i]);
            ll.addView(cat[i], params);
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

                }
            });
        }

    }
}