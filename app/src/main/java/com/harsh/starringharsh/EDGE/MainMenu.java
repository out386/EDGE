package com.harsh.starringharsh.EDGE;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainMenu extends AppCompatActivity {

    boolean doubleBackToExitPressedOnce = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        ImageButton events = (ImageButton) findViewById(R.id.bEvents);
        ImageButton megaevents = (ImageButton)findViewById(R.id.bMegaEvents);
        ImageButton funevents = (ImageButton) findViewById(R.id.bFunEvents);
        ImageButton sponsors = (ImageButton) findViewById(R.id.bSponsors);
        ImageButton team = (ImageButton)findViewById(R.id.bTeam);
        ImageButton aboutus = (ImageButton)findViewById(R.id.bAboutUs);
        ImageButton schedule = (ImageButton) findViewById(R.id.bSchedule);
        ImageButton campusambassadors = (ImageButton) findViewById(R.id.bCampusAmbassadors);
        ImageButton facebook = (ImageButton) findViewById(R.id.linkFacebook);
        ImageButton youtube = (ImageButton) findViewById(R.id.linkYoutube);
        ImageButton geenonix = (ImageButton) findViewById(R.id.linkGeekonix);
        ImageButton techno = (ImageButton) findViewById(R.id.linkTechnoIndia);
        ImageButton edge = (ImageButton) findViewById(R.id.linkEdge);


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

        megaevents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainMenu.this, MegaEvents.class);
                startActivity(intent);
            }
        });
        funevents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainMenu.this, FunEvents.class);
                startActivity(intent);
            }
        });

        campusambassadors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainMenu.this, CampusAmbassadors.class);
                startActivity(intent);
            }
        });















        //481056431942181
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://page/481056431942181"));
                    startActivity(intent);
                } catch(Exception e) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com/Gx.Edg")));
                }
            }
        });

        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=null;
                try {
                    intent =new Intent(Intent.ACTION_VIEW);
                    intent.setPackage("com.google.android.youtube");
                    intent.setData(Uri.parse("https://www.youtube.com/channel/UCSwFemGqe1XRmVlg1jRNJYw"));
                    startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://www.youtube.com/channel/UCSwFemGqe1XRmVlg1jRNJYw"));
                    startActivity(intent);
                }
            }
        });

        geenonix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.geekonix.org")));
            }
        });


        techno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ticollege.ac.in/")));
            }
        });


        edge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.edg.co.in")));
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
