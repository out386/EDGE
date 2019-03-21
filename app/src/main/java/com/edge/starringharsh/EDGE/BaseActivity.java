package com.edge.starringharsh.EDGE;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.edge.starringharsh.EDGE.utils.SnackbarUtils;

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

    @Override
    public void startActivity(Intent intent) {
        super.startActivity(intent);
        overridePendingTransition(R.anim.zoom_enter,R.anim.zoom_exit);
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.zoom_enter_reverse,R.anim.zoom_exit_reverse);
        SnackbarUtils.dismiss();
    }
}
