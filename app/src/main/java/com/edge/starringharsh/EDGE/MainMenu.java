package com.edge.starringharsh.EDGE;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.edge.starringharsh.EDGE.ui.SnakesGameActivity;
import com.edge.starringharsh.EDGE.utils.ButtonUtils;

public class MainMenu extends BaseActivity {

    boolean doubleBackToExitPressedOnce = false;
    long startTime;
    //Thread timer;
    //private Handler customHandler=new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main_menu);

        //startTime = SystemClock.uptimeMillis();
        //TextView trial = (TextView) findViewById(R.id.tvTRIAL);
        //trial.setText(""+(startTime/1000));
        //customHandler.postDelayed(updateTimerThread, 0);

        ImageButton facebook = (ImageButton) findViewById(R.id.linkFacebook);
        ImageButton youtube = (ImageButton) findViewById(R.id.linkYoutube);
        ImageButton techno = (ImageButton) findViewById(R.id.linkTechnoIndia);
        ImageButton edge = (ImageButton) findViewById(R.id.linkEdge);
        ImageButton insta = (ImageButton) findViewById(R.id.linkInstagram);
        ImageButton twitter = (ImageButton) findViewById(R.id.linkTwitter);

        setupMenu();




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

        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { 
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
            public void onClick(View view) { 
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
            public void onClick(View view) { 
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ticollege.ac.in/")));
            }
        });


        edge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { 
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://edg.co.in")));
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


    private void setupMenu() {
        // TODO: Just eff this all. Use a RecyclerView.
        final Master master = new Master();
        final String menu[] = master.mainMenu;
        int l = menu.length;

        final ImageButton menuButtons[] = new ImageButton[l];
        int px = ButtonUtils.dpToPx(this, 200);

        for(int i=0;i<l;i++)
        {
            LinearLayout ll = (LinearLayout) findViewById(R.id.menuLayout);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                    px, px);
            menuButtons[i] = new ImageButton(this);
            menuButtons[i].setBackgroundResource(master.mainMenuImg.get(menu[i]));

            TextView caption = ButtonUtils.getCaptionTv(this, menu[i]);
            ll.addView(menuButtons[i], params);
            ll.addView(caption);
        }

        for(int i=0; i<l; i++)
        {
            final int j = i;
            menuButtons[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = getIntent(menu, master, j);
                    if (intent != null) {
                        startActivity(intent);
                    }
                }
            });
        }
    }

    private Intent getIntent(String[] menu, Master master, int i) {
        // TODO: Use models for the menu, and move this there.
        Intent intent;
        switch(menu[i]) {
            case "Events":
                intent = new Intent(MainMenu.this, MainActivity.class);
                return intent;
            case "Intra":
                intent = new Intent(MainMenu.this, Intra.class);
                return intent;
            case "Mega Events":
                intent = new Intent(MainMenu.this, MegaEvents.class);
                intent.putExtra("actName", "Mega");
                intent.putExtra("actLink", master.megalink);
                return intent;
            case "Upcoming Events":
                intent = new Intent(MainMenu.this, MegaEvents.class);
                intent.putExtra("actName", "Upcoming");
                intent.putExtra("actLink", master.upcominglink);
                return intent;
            case "Results":
                intent = new Intent(MainMenu.this, Results.class);
                return intent;
            case "Edge Kube":
                intent = new Intent(MainMenu.this, KukuKube.class);
                return intent;
            case "Schedule":
                intent = new Intent(MainMenu.this, PdfViewer.class);
                return intent;
            case "Team EDGE":
                intent = new Intent(MainMenu.this, Team.class);
                intent.putExtra("year", 19);
                return intent;
            case "Our Sponsors":
                intent = new Intent(MainMenu.this, Sponsors.class);
                return intent;
            case "Accomodation":
                intent = new Intent(MainMenu.this, Accomodation.class);
                return intent;
            case "About Us":
                intent = new Intent(MainMenu.this, AboutUs.class);
                return intent;
            default:
                return null;
        }
    }
}
