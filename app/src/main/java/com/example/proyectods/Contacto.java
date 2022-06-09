package com.example.proyectods;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;

public class Contacto extends AppCompatActivity {

    //declaracion de variabales
    WebView wv;
    ImageButton btnFB, btnIG, btnWEB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);
        //casteo
        btnFB = findViewById(R.id.btnFb);
        btnIG = findViewById(R.id.btnIg);
        btnWEB = findViewById(R.id.btnWeb);
        wv = findViewById(R.id.wv1);
        //permitira al user navegar solo en el app
        wv.setWebViewClient(new WebViewClient());
        //abrira el sitio que solicito
        wv.loadUrl("http://www.google.com");
    }

    public void abrirFB(View view) {
        Uri facebook = Uri.parse("https://www.facebook.com/ventaautoscusco/");
        Intent fb = new Intent(Intent.ACTION_VIEW, facebook);
        startActivity(fb);
    }

    public void abrirIG(View view) {
        Uri instagram = Uri.parse("https://www.instagram.com/ventadeautosperu1/");
        Intent ig = new Intent(Intent.ACTION_VIEW, instagram);
        startActivity(ig);
    }

    public void abrirWEB(View view) {
        Uri webpage = Uri.parse("https://neoauto.com");
        Intent wp = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(wp);
    }
    public void abrirMapa(View view){
        Intent intent = new Intent( Contacto.this, Mapa.class);
        startActivity(intent);
    }
}