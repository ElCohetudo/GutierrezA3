package com.example.stephanie.gutierreza3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class webb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webb);

        WebView webb = (WebView) findViewById(R.id.webView2);
        webb.setWebViewClient(new WebViewClient());
        webb.loadUrl("http://www.google.com");


    }
}
