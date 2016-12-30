package com.harsh.starringharsh.EDGE;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainMenu extends AppCompatActivity {

    boolean doubleBackToExitPressedOnce = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        Button events = (Button) findViewById(R.id.bEvents);
        Button megaevents = (Button) findViewById(R.id.bMegaEvents);
        Button funevents = (Button) findViewById(R.id.bFunEvents);
        Button sponsors = (Button) findViewById(R.id.bSponsors);
        Button team = (Button) findViewById(R.id.bTeam);
        Button aboutus = (Button) findViewById(R.id.bAboutUs);
        Button schedule = (Button) findViewById(R.id.bSchedule);

        events.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainMenu.this, MainActivity.class);
                startActivity(intent);
            }
        });

        sponsors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainMenu.this, Sponsors.class);
                startActivity(intent);
            }
        });

        team.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainMenu.this, Team.class);
                startActivity(intent);
            }
        });

        schedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainMenu.this, PdfViewer.class);
                startActivity(intent);
            }
        });




        if(isNetworkAvailable(this)==false)
        {
            Toast.makeText(this, "Connect To Internet For Better Results.", Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
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

    public boolean isNetworkAvailable(final Context context) {
        final ConnectivityManager connectivityManager = ((ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE));
        return connectivityManager.getActiveNetworkInfo() != null && connectivityManager.getActiveNetworkInfo().isConnected();
    }

}
