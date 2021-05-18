package com.example.navegaciondrawer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class NuevaBusquedaWeb extends AppCompatActivity {

    WebView wv1;
    private  TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nueva_busqueda_web);

        wv1=(WebView)findViewById(R.id.wv1);

        String URL = getIntent().getStringExtra("SitioWeb");

        wv1.setWebViewClient(new WebViewClient());


        wv1.loadUrl("https://" + URL);

        ///textView = findViewById(R.id.txtviewBusqueda);
        ///Intent intent = getIntent();
        ///String s= intent.getStringExtra("SitioWeb");
        //textView.setText(s);
    }


}