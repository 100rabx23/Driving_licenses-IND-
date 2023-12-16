package com.example.drivinglicenceind;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class webview2 extends AppCompatActivity {

    private WebView webView2;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview2);
        WebView.setWebContentsDebuggingEnabled(true);
        // Initialize WebView..!
        webView2 = findViewById(R.id.webView2);
        webView2.setWebViewClient(new WebViewClient());
        webView2.getSettings().setJavaScriptEnabled(true);

        String url = "https://sarathi.parivahan.gov.in/sarathiservice/stateSelection.do";
        webView2.loadUrl(url);
    }
    @Override
    public void onBackPressed() {
        // Go back to the previous page if it exists
        if (webView2.canGoBack()) {
            webView2.goBack();
        } else {
            super.onBackPressed();
        }
    }
}