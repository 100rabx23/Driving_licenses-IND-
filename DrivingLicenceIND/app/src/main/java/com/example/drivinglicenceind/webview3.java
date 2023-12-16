package com.example.drivinglicenceind;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class webview3 extends AppCompatActivity {

    private WebView webView3;

    @SuppressLint({"SetJavaScriptEnabled", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview3);
        WebView.setWebContentsDebuggingEnabled(true);
        // Initialize WebView..!
        webView3 = findViewById(R.id.webView3);
        webView3.setWebViewClient(new WebViewClient());
        webView3.getSettings().setJavaScriptEnabled(true);

        String url = "https://parivahan.gov.in/parivahan//node/1978";
        webView3.loadUrl(url);
    }
    @Override
    public void onBackPressed() {
        // Go back to the previous page if it exists
        if (webView3.canGoBack()) {
            webView3.goBack();
        } else {
            super.onBackPressed();
        }
    }
}