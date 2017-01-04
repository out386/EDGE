package com.harsh.starringharsh.EDGE;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ComingSoon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(0,0);
        setContentView(R.layout.activity_coming_soon);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

            Intent intent = new Intent(ComingSoon.this, MainMenu.class);
            startActivity(intent);
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(0,0);
    }
}
