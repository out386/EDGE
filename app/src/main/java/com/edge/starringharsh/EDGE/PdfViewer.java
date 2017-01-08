package com.edge.starringharsh.EDGE;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class PdfViewer extends Activity {
    private WebView webView;

    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(0,0);
        setContentView(R.layout.activity_pdf_viewer);

        webView = (WebView) findViewById(R.id.webView1);
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);

        if(android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.JELLY_BEAN)
            settings.setAllowUniversalAccessFromFileURLs(true);

        settings.setBuiltInZoomControls(true);
        webView.setWebChromeClient(new WebChromeClient());
        webView.loadUrl("https://drive.google.com/file/d/0B9ir1SJLpxDEZWtXX3pQY29MeFU/view?usp=sharing");


    }

    @Override
    protected void onResume() {
        super.onResume();
        webView.loadUrl( "javascript:window.location.reload( true )" );

    }

    @Override
    protected void onPause() {
        super.onPause();
        webView.clearCache(true);

    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(PdfViewer.this, MainMenu.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(0,0);
    }
}
