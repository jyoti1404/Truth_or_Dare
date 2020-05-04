package com.example.truth_dare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.view.textclassifier.SelectionEvent;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button button;
    ImageView imageView;
    int lastdxn;
    Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Truth or Dare...");
        button = findViewById(R.id.button);
        imageView = findViewById(R.id.imageView);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Please Click on the button for bottle to rotate...", Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void spin(View view){
        int newDirection = random.nextInt(3600);
        float pivotX = imageView.getWidth()/2;
        float pivotY = imageView.getHeight()/2;

        Animation rotate = new RotateAnimation(lastdxn,newDirection,pivotX,pivotY);
        rotate.setDuration(3000);
        rotate.setFillAfter(true);
        rotate.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                button.setEnabled(false);
              //  button.setBackground();
              //  button.setBackgroundColor(Integer.parseInt("#c1c1c1"));
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                button.setEnabled(true);
                Intent intent = new Intent(MainActivity.this, Splash.class);
                startActivity(intent);

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        lastdxn = newDirection;

        imageView.startAnimation(rotate);

//        Intent intent = new Intent(MainActivity.this, Splash.class);
//        startActivity(intent);
    }

}
