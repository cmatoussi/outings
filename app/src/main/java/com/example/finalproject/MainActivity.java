package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handleStudy(View view){
        setContentView(R.layout.activity_landing_study);
        Intent intent = new Intent(this, landing_study.class);
        startActivity(intent);
    }
    public void handleOut(View view){
        setContentView(R.layout.activity_landingactivepage);
        Intent intent = new Intent(this, landingactivepage.class);
        startActivity(intent);
    }
}
