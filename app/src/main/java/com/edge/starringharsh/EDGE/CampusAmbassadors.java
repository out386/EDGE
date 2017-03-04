package com.edge.starringharsh.EDGE;

import android.content.Intent;
import android.net.http.SslError;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

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


        webView.loadUrl(link);
        webView.requestFocus();
        webView.setWebViewClient(new WebViewClient(){
            @Override
            public void onPageFinished(WebView view, String url) {
            }

            @Override
            public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
                Toast.makeText(CampusAmbassadors.this, "Connection Error", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(CampusAmbassadors.this, MainMenu.class);
                startActivity(intent);
                finish();
            }

            @Override
            public void onReceivedHttpError(WebView view, WebResourceRequest request, WebResourceResponse errorResponse) {
                Toast.makeText(CampusAmbassadors.this, "Connection Error", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(CampusAmbassadors.this, MainMenu.class);
                startActivity(intent);
                finish();
            }

            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                Toast.makeText(CampusAmbassadors.this, "Connection Error", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(CampusAmbassadors.this, MainMenu.class);
                startActivity(intent);
                finish();
            }

            @Override
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                super.onReceivedError(view, errorCode, description, failingUrl);
                Toast.makeText(CampusAmbassadors.this, "Connection Error", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(CampusAmbassadors.this, MainMenu.class);
                startActivity(intent);
                finish();
            }
        });


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