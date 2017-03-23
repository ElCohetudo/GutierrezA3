package com.example.stephanie.gutierreza3;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private Button btnGoMesa;
    private Button btnGoGoogle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGoMesa = (Button) findViewById(R.id.btnGo1);
        btnGoGoogle = (Button) findViewById(R.id.btnGo2);

        btnGoMesa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent test = new Intent(MainActivity.this, web.class);
                startActivity(test);
            }
        });

        btnGoGoogle.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {
                Intent test2 = new Intent(MainActivity.this, webb.class);
                startActivity(test2);
            }
        });

    }
}