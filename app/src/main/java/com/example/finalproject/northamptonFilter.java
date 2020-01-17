package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;




public class northamptonFilter extends AppCompatActivity {
   public String studyPrice="";
   public String studyRate="";

   boolean rate = false;
   boolean price = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_northampton_filter);
    }
   public void handlePrice (View view){
      Button b = (Button) view;
      studyPrice = b.getText().toString();
       price = true;
    }

   public void handleRate (View view){
       Intent intent = new Intent(this, northampton.class);
       Button a = (Button) view;
       studyRate = a.getText().toString();
       intent.putExtra("rate",studyRate);
       intent.putExtra("price",studyPrice);
       rate = true;
       if (price == true) {
           setContentView(R.layout.activity_northampton);
           startActivity(intent);
      }

    }


    }

