package com.example.truth_dare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.widget.ImageView;

public class Splash extends AppCompatActivity {

    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        setTitle("Wooooohhhoo");
        imageView = findViewById(R.id.imageView);

       // AnimationDrawable animationDrawable = (AnimationDrawable)getResources().getDrawable(this, R.)

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash.this,Select.class);
                startActivity(intent);
                finish();
            }
        },4000);
    }
}
