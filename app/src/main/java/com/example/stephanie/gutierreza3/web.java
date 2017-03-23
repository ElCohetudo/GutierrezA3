package com.example.stephanie.gutierreza3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class web extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        WebView web = (WebView) findViewById(R.id.webView1);
        web.setWebViewClient(new WebViewClient());
        web.loadUrl("http://www.sdmesa.edu");



    }
}
