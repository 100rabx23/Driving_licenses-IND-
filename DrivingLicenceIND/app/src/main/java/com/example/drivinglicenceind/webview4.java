package com.example.drivinglicenceind;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class webview4 extends AppCompatActivity {

    private WebView webView4;

    @SuppressLint({"SetJavaScriptEnabled", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview4);
        WebView.setWebContentsDebuggingEnabled(true);
        // Initialize WebView..!
        webView4 = findViewById(R.id.webView4);
        webView4.setWebViewClient(new WebViewClient());
        webView4.getSettings().setJavaScriptEnabled(true);

        String url = "https://echallan.parivahan.gov.in/";
        webView4.loadUrl(url);
    }
    @Override
    public void onBackPressed() {
        // Go back to the previous page if it exists
        if (webView4.canGoBack()) {
            webView4.goBack();
        } else {
            super.onBackPressed();
        }
    }
}