package com.example.proyectods;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.firebase.auth.FirebaseAuth;

public class CerrarSesion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cerrar_sesion);
        FirebaseAuth.getInstance().signOut();
        //MainActivity.this.onBackPressed();
        Intent intent = new Intent(CerrarSesion.this, Registrarse.class);
        startActivity(intent);
    }
}