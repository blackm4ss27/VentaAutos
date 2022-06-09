package com.example.proyectods;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Splash extends AppCompatActivity {
    private static final long SPLASH_SCREEN_DISPLAY = 3000;
    Animation topAnim, bottomAnim;
    ImageView image;
    TextView logo, Slogan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        MediaPlayer mp=MediaPlayer.create(this,R.raw.carro2);
        mp.start();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        bottomAnim = AnimationUtils.loadAnimation(this, R.anim.botton_animation);

        image = findViewById(R.id.imageView);
        logo = findViewById(R.id.textView);
        Slogan = findViewById(R.id.tv1);

        image.setAnimation(topAnim);
        logo.setAnimation(bottomAnim);
        Slogan.setAnimation(bottomAnim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent( Splash.this, Registrarse.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN_DISPLAY);
    }
}