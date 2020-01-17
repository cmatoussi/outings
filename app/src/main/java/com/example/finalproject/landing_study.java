package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class landing_study extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_landing_study);
    }
    public void handleNorthampton(View view){
        setContentView(R.layout.activity_northampton_filter);
        Intent intent = new Intent(this, northamptonFilter.class);
        startActivity(intent);
    }
    public void handleSmith(View view){
        setContentView(R.layout.activity_smith);
        Intent intent = new Intent(this, smith.class);
        startActivity(intent);
    }

    


}
