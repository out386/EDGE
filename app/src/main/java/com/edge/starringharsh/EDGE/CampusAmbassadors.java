package com.edge.starringharsh.EDGE;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class CampusAmbassadors extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(0,0);
        setContentView(R.layout.activity_pdf_viewer);

        webView = (WebView) findViewById(R.id.webView1);
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);

        String link = getIntent().getStringExtra("weblink");

        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(link);
        webView.requestFocus();


    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(CampusAmbassadors.this, MainMenu.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(0,0);
    }
}
