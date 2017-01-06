package com.harsh.starringharsh.EDGE;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.icu.text.SimpleDateFormat;
import android.media.MediaPlayer;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.ParseException;
import android.net.Uri;
import android.os.Handler;
import android.os.Process;
import android.os.SystemClock;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

public class MainMenu extends AppCompatActivity {

    boolean doubleBackToExitPressedOnce = false;
    long startTime;
    //Thread timer;
    //private Handler customHandler=new Handler();
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(0,0);
        setContentView(R.layout.activity_main_menu);

        mp = MediaPlayer.create(this, R.raw.click);

        //startTime = SystemClock.uptimeMillis();
        //TextView trial = (TextView) findViewById(R.id.tvTRIAL);
        //trial.setText(""+(startTime/1000));
        //customHandler.postDelayed(updateTimerThread, 0);
        ImageButton events = (ImageButton) findViewById(R.id.bEvents);
        ImageButton megaevents = (ImageButton)findViewById(R.id.bMegaEvents);
        ImageButton funevents = (ImageButton) findViewById(R.id.bFunEvents);
        ImageButton sponsors = (ImageButton) findViewById(R.id.bSponsors);
        ImageButton team = (ImageButton)findViewById(R.id.bTeam);
        ImageButton aboutus = (ImageButton)findViewById(R.id.bAboutUs);
        ImageButton schedule = (ImageButton) findViewById(R.id.bSchedule);
        ImageButton campusambassadors = (ImageButton) findViewById(R.id.bCampusAmbassadors);
        ImageButton accommodation = (ImageButton) findViewById(R.id.bAccommodation);
        ImageButton facebook = (ImageButton) findViewById(R.id.linkFacebook);
        ImageButton youtube = (ImageButton) findViewById(R.id.linkYoutube);
        ImageButton techno = (ImageButton) findViewById(R.id.linkTechnoIndia);
        ImageButton edge = (ImageButton) findViewById(R.id.linkEdge);
        ImageButton insta = (ImageButton) findViewById(R.id.linkInstagram);
        ImageButton twitter = (ImageButton) findViewById(R.id.linkTwitter);

        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);

        int height = metrics.heightPixels;
        int width = metrics.widthPixels;

        events.setLayoutParams(new LinearLayout.LayoutParams(width, width/2));
        megaevents.setLayoutParams(new LinearLayout.LayoutParams(width, width/2));
        funevents.setLayoutParams(new LinearLayout.LayoutParams(width, width/2));
        sponsors.setLayoutParams(new LinearLayout.LayoutParams(width, width/2));
        team.setLayoutParams(new LinearLayout.LayoutParams(width, width/2));
        aboutus.setLayoutParams(new LinearLayout.LayoutParams(width, width/2));
        schedule.setLayoutParams(new LinearLayout.LayoutParams(width, width/2));
        campusambassadors.setLayoutParams(new LinearLayout.LayoutParams(width, width/2));
        accommodation.setLayoutParams(new LinearLayout.LayoutParams(width, width/2));


        accommodation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { mp.start();
                Intent intent = new Intent(MainMenu.this, Accomodation.class);
                startActivity(intent);
                finish();
            }
        });

        events.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { mp.start();
                Intent intent = new Intent(MainMenu.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        sponsors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { mp.start();
                Intent intent = new Intent(MainMenu.this, Sponsors.class);
                startActivity(intent);
                finish();
            }
        });

        team.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { mp.start();
                Intent intent = new Intent(MainMenu.this, Team.class);
                startActivity(intent);
                finish();
            }
        });

        schedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { mp.start();
                Intent intent = new Intent(MainMenu.this, PdfViewer.class);
                startActivity(intent);
                finish();
            }
        });

        megaevents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { mp.start();
                Intent intent = new Intent(MainMenu.this, MegaEvents.class);
                startActivity(intent);
                finish();
            }
        });
        funevents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { mp.start();
                Intent intent = new Intent(MainMenu.this, FunEvents.class);
                startActivity(intent);
                finish();
            }
        });

        campusambassadors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { mp.start();
                Intent intent = new Intent(MainMenu.this, CampusAmbassadors.class);
                intent.putExtra("weblink", "https://goo.gl/forms/rNo6TDXmkd9hYRjG2");
                startActivity(intent);
                finish();
            }
        });

        aboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { mp.start();
                Intent intent = new Intent(MainMenu.this, AboutUs.class);
                startActivity(intent);
                finish();
            }
        });















        //481056431942181
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { mp.start();
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
            public void onClick(View view) { mp.start();
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

        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { mp.start();
                try {
                    Intent intent =new Intent(Intent.ACTION_VIEW);
                    intent.setPackage("com.twitter.android");
                    intent.setData(Uri.parse("twitter://user?screen_name=geekonixedge"));
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://twitter.com/geekonixedge")));
                }
            }
        });

        insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { mp.start();
                try {
                    Uri uri = Uri.parse("http://instagram.com/_u/geekonix");
                    Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);
                    likeIng.setPackage("com.instagram.android");
                    startActivity(likeIng);
                } catch (ActivityNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("http://instagram.com/geekonix")));
                }
            }
        });


        techno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { mp.start();
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ticollege.ac.in/")));
            }
        });


        edge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { mp.start();
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.edg.co.in")));
            }
        });




        if(isNetworkAvailable(this)==false)
        {
            Toast.makeText(this, "Connect To Internet For Better Results.", Toast.LENGTH_SHORT).show();
        }

    }

    /*private Runnable updateTimerThread = new Runnable() {
        public void run() {
            long timeInMilliseconds = (startTime - SystemClock.uptimeMillis());

            //updatedTime = timeSwapBuff + timeInMilliseconds;
            long secs = (int) (timeInMilliseconds / 1000);
            long min = (int) secs/60;
            secs = secs % 60;
            long hrs = (int) min/60;
            min = min % 60;
            int days = (int) hrs/24;
            hrs = hrs%24;


            TextView tdays = (TextView) findViewById(R.id.tvDays);
            TextView thrs = (TextView) findViewById(R.id.tvHours);
            TextView tmins = (TextView) findViewById(R.id.tvMins);
            TextView tsecs = (TextView) findViewById(R.id.tvSecs);

            tdays.setText(String.format("%02d", days));
            thrs.setText(String.format("%02d", (int)hrs));
            tmins.setText(String.format("%02d", (int)min));
            tsecs.setText(String.format("%02d", (int)secs));

            customHandler.postDelayed(this, 0);
        }
    };*/



    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            // Clear your session, remove preferences, etc.
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

    public boolean isNetworkAvailable(final Context context) {
        final ConnectivityManager connectivityManager = ((ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE));
        return connectivityManager.getActiveNetworkInfo() != null && connectivityManager.getActiveNetworkInfo().isConnected();
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(0,0);
    }
}
