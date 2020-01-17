package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class landingactivepage extends AppCompatActivity {
    public String outActivity="";
    public String outPrice="";
    public String outTime="";
    boolean activity = false;
    boolean price = false;
    boolean time = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landingactivepage);

    }

    public void handleActive (View view){
        Button b = (Button) view;
        outActivity = b.getText().toString();
       activity = true;
    }
    public void handlePrice (View view){
        Button b = (Button) view;
        outPrice = b.getText().toString();
        price = true;
    }

    public void handleTime (View view){
        Intent intent = new Intent(this, outPlaces.class);
        Button a = (Button) view;
        outTime = a.getText().toString();
        intent.putExtra("activity",outActivity);
        intent.putExtra("price",outPrice);
        intent.putExtra("time",outTime);
        if ((price == true)&&(activity==true)) {
            setContentView(R.layout.activity_out_places);
            startActivity(intent);
        }

    }


}

