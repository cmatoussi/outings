package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.io.InputStream;
import java.util.ArrayList;


public class outPlaces extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_out_places);

    InputStream inputStream = getResources().openRawResource(R.raw.out);
    CSVFile csvFile = new CSVFile(inputStream);
    ArrayList<ArrayList<String>> outList = csvFile.read();
        Intent j= getIntent();
        String outPrice= j.getStringExtra("price");
        String outTime= j.getStringExtra("time");
        String outActivity= j.getStringExtra("activity");
        String column1;
        String column2;
        String column3;
        String column4;
        String column;
        TextView textView = (TextView) findViewById(R.id.textView4);
        textView.append("\n");
        textView.setText("Here are the places that matched:");
        textView.append("\n");
        textView.append("\n");

      for(int i=1; i<outList.size();i++ ){
          column1=outList.get(i).get(1);
          column2=outList.get(i).get(2);
          column3=outList.get(i).get(3);
          column=outList.get(i).get(0);
          column4=outList.get(i).get(5);


        if ((column1.equals(outActivity))&&(column2.equals(outPrice))&&(column3.compareTo(outTime)>0)){

      textView.append("- " +column+" : " +column4);
      textView.append("\n");
      textView.append("\n");
        }

     }


     }
}

