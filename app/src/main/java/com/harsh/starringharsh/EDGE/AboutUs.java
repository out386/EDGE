package com.harsh.starringharsh.EDGE;

import android.animation.LayoutTransition;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.view.View;
import android.widget.ImageButton;

public class AboutUs extends AppCompatActivity {

    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(0,0);

        setContentView(R.layout.activity_about_us);

        mp = MediaPlayer.create(this, R.raw.click);

        ImageButton facebook = (ImageButton) findViewById(R.id.linkFacebook);
        ImageButton youtube = (ImageButton) findViewById(R.id.linkYoutube);
        ImageButton techno = (ImageButton) findViewById(R.id.linkTechnoIndia);
        ImageButton edge = (ImageButton) findViewById(R.id.linkEdge);
        ImageButton insta = (ImageButton) findViewById(R.id.linkInstagram);
        ImageButton location = (ImageButton) findViewById(R.id.linkLocation);
        ImageButton twitter = (ImageButton) findViewById(R.id.linkTwitter);


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

        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { mp.start();
                try {
                    double latitude = 22.5759859;
                    double longitude = 88.4276901;
                    String label = "Techno India Salt Lake (House Of Edge)";
                    String uriBegin = "geo:" + latitude + "," + longitude;
                    String query = latitude + "," + longitude + "(" + label + ")";
                    String encodedQuery = Uri.encode(query);
                    String uriString = uriBegin + "?q=" + encodedQuery + "&z=16";
                    Uri uri = Uri.parse(uriString);
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });









        ImageButton c1 = (ImageButton) findViewById(R.id.bAUCall1);
        ImageButton c2 = (ImageButton) findViewById(R.id.bAUCall2);
        ImageButton c3 = (ImageButton) findViewById(R.id.bAUCall3);
        ImageButton c4 = (ImageButton) findViewById(R.id.bAUCall4);
        ImageButton c5 = (ImageButton) findViewById(R.id.bAUCall5);
        ImageButton c6 = (ImageButton) findViewById(R.id.bAUCall6);
        ImageButton w1 = (ImageButton) findViewById(R.id.bAUWA1);
        ImageButton w2 = (ImageButton) findViewById(R.id.bAUWA2);
        ImageButton w3 = (ImageButton) findViewById(R.id.bAUWA3);
        ImageButton w4 = (ImageButton) findViewById(R.id.bAUWA4);
        ImageButton w5 = (ImageButton) findViewById(R.id.bAUWA5);
        ImageButton w6 = (ImageButton) findViewById(R.id.bAUWA6);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { mp.start();

                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "9681253545"));
                startActivity(intent);
            }
        });

        w1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { mp.start();

                Intent sendIntent = new Intent("android.intent.action.MAIN");
                sendIntent.setComponent(new ComponentName("com.whatsapp","com.whatsapp.Conversation"));
                sendIntent.putExtra("jid", PhoneNumberUtils.stripSeparators("91" + "9681253545")+"@s.whatsapp.net");//phone number without "+" prefix
                startActivity(sendIntent);
            }
        });



        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { mp.start();

                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "8961512844"));
                startActivity(intent);
            }
        });

        w2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { mp.start();

                Intent sendIntent = new Intent("android.intent.action.MAIN");
                sendIntent.setComponent(new ComponentName("com.whatsapp","com.whatsapp.Conversation"));
                sendIntent.putExtra("jid", PhoneNumberUtils.stripSeparators("91" + "8961512844")+"@s.whatsapp.net");//phone number without "+" prefix
                startActivity(sendIntent);
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { mp.start();

                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "9674842750"));
                startActivity(intent);
            }
        });

        w3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { mp.start();

                Intent sendIntent = new Intent("android.intent.action.MAIN");
                sendIntent.setComponent(new ComponentName("com.whatsapp","com.whatsapp.Conversation"));
                sendIntent.putExtra("jid", PhoneNumberUtils.stripSeparators("91" + "9038246967")+"@s.whatsapp.net");//phone number without "+" prefix
                startActivity(sendIntent);
            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { mp.start();

                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "8820022347"));
                startActivity(intent);
            }
        });

        w4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { mp.start();

                Intent sendIntent = new Intent("android.intent.action.MAIN");
                sendIntent.setComponent(new ComponentName("com.whatsapp","com.whatsapp.Conversation"));
                sendIntent.putExtra("jid", PhoneNumberUtils.stripSeparators("91" + "8820022347")+"@s.whatsapp.net");//phone number without "+" prefix
                startActivity(sendIntent);
            }
        });
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { mp.start();

                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "7278719725"));
                startActivity(intent);
            }
        });

        w5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { mp.start();

                Intent sendIntent = new Intent("android.intent.action.MAIN");
                sendIntent.setComponent(new ComponentName("com.whatsapp","com.whatsapp.Conversation"));
                sendIntent.putExtra("jid", PhoneNumberUtils.stripSeparators("91" + "7278719725")+"@s.whatsapp.net");//phone number without "+" prefix
                startActivity(sendIntent);
            }
        });
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { mp.start();

                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "9007215727"));
                startActivity(intent);
            }
        });

        w6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { mp.start();

                Intent sendIntent = new Intent("android.intent.action.MAIN");
                sendIntent.setComponent(new ComponentName("com.whatsapp","com.whatsapp.Conversation"));
                sendIntent.putExtra("jid", PhoneNumberUtils.stripSeparators("91" + "9007215727")+"@s.whatsapp.net");//phone number without "+" prefix
                startActivity(sendIntent);
            }
        });



    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(0,0);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        Intent intent = new Intent(AboutUs.this, MainMenu.class);
        startActivity(intent);
        finish();
    }
}
