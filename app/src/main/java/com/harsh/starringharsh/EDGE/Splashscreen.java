package com.harsh.starringharsh.EDGE;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.VideoView;

public class Splashscreen extends AppCompatActivity {

    DisplayMetrics metrics;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        View decorView=getWindow().getDecorView();
        int uiOptions= View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);

        metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);

        int height = metrics.heightPixels;
        int width = metrics.widthPixels;

        VideoView videoHolder = (VideoView) findViewById(R.id.videoview);
        videoHolder.setLayoutParams(new LinearLayout.LayoutParams(width,height));
        try {
            Uri video = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.edgesplash);
            videoHolder.setVideoURI(video);
            videoHolder.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    jump();
                }
            });
            videoHolder.setZOrderOnTop(true);
            videoHolder.start();
        }
        catch(Exception e) {
            Log.e("abc", "Exception caught!", e);
            jump();
        }
    }

    private void jump()
    {
        //Jump to main activity
        if(isFinishing())
            return;
        Intent intent = new Intent(this, MainMenu.class);
        startActivity(intent);
        finish();
    }

    @Override
    protected void onResume() {
        super.onResume();

    }


    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
    }
}
