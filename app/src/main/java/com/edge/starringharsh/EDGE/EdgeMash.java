package com.edge.starringharsh.EDGE;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EdgeMash extends AppCompatActivity {

    TextView details, st1, st2, st3;
    Button dubopen, sendmail, fbpage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edge_smash);

        details = (TextView) findViewById(R.id.tvEdgeSmash);
        st1 = (TextView) findViewById(R.id.tvStep1);
        st2 = (TextView) findViewById(R.id.tvStep2);
        st3 = (TextView) findViewById(R.id.tvStep3);
        dubopen = (Button) findViewById(R.id.bStep1);
        sendmail = (Button) findViewById(R.id.bStep2);
        fbpage = (Button) findViewById(R.id.bStep3);

        TextView tvHead = (TextView) findViewById(R.id.tvHeader);
        tvHead.setTypeface(Typeface.createFromAsset(getAssets(),"TypoGraphica.otf"));

        details.setText("EDGE17 brings to you its promotional event EDGEMASH: Stop thinking, Start lipsyncing.\n" +
                "Being the first ever dubsmash contest in the history of EDGE, it aims to set you on a path for a fun filled journey before the grandeur fest begins.\n" +
                "EASY STEPS FOR PARTICIPATION :");

        st1.setText("STEP 1:\nMake an awesome dubsmash on any sound track and save it. Make sure your dub is decent enough to be selected.");
        st2.setText("STEP 2:\nMail your dubsmash video along with your Name, Name of your College,your year in college, your stream and the url to your facebook profile at the following Email-id:\n" +
                "edgemash@gmail.com");
        st3.setText("STEP 3:\nYour video (if approved) will be uploaded soon in our facebook page. Feel free to share the posts with tags #EDGE17 #EDGEMASH #GEEKONIX.");

        dubopen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try
                {
                    ApplicationInfo info = getPackageManager().getApplicationInfo("com.mobilemotion.dubsmash", 0 );
                    Intent i = EdgeMash.this.getPackageManager().getLaunchIntentForPackage("com.mobilemotion.dubsmash");
                    startActivity(i);
                }
                catch (PackageManager.NameNotFoundException e)
                {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.mobilemotion.dubsmash")));
                }
            }
        });

        sendmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("plain/text");
                intent.putExtra(Intent.EXTRA_EMAIL, new String[] { "edgemash@gmail.com" });
                intent.putExtra(Intent.EXTRA_SUBJECT, "Edgemash Video");
                intent.putExtra(Intent.EXTRA_TEXT, "Name: \n College: \n Year in college: \n Facebook Link: \n *do not forget to attach the video file.");
                startActivity(Intent.createChooser(intent, ""));
            }
        });

        fbpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://page/176901382801783"));
                    startActivity(intent);
                } catch(Exception e) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com/edgemash2017")));
                }
            }
        });
    }


    @Override
    public void onBackPressed() {
        Intent intent = new Intent(EdgeMash.this, MainMenu.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(0,0);
    }
}
