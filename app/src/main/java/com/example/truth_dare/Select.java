package com.example.truth_dare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Select extends AppCompatActivity {

    Button truth,dare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        setTitle("Select One");
        truth = findViewById(R.id.truth);
        dare = findViewById(R.id.dare);

        truth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Select.this,Truth.class);
                startActivity(intent);
                finish();
            }
        });
        dare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Select.this,Dare.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
