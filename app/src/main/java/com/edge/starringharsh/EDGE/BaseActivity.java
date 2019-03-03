package com.edge.starringharsh.EDGE;

import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import java.io.IOException;

import pl.droidsonroids.gif.GifDrawable;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onStart() {
        super.onStart();
        ImageView videoView = findViewById(R.id.video_view);
        try {
            if (videoView != null) {
                GifDrawable gifFromResource = new GifDrawable(getResources(), R.drawable.edgbgblack);
                videoView.setImageDrawable(gifFromResource);
            }
        } catch (IOException ignored) {
        }
    }
}
