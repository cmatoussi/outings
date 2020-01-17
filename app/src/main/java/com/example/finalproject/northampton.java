package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.os.Parcelable;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.util.Log;
import java.io.InputStream;
import java.util.ArrayList;
import android.provider.SyncStateContract.Constants;
import android.widget.TextView;




public class northampton extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_northampton);

    InputStream inputStream = getResources().openRawResource(R.raw.study);
    CSVFile csvFile = new CSVFile(inputStream);
    ArrayList<ArrayList<String>> studyList = csvFile.read();
        Intent j= getIntent();
        String studyPrice= j.getStringExtra("price");
        String studyRate= j.getStringExtra("rate");
        String column1;
        String column2;
        for (int i = 1; i < studyList.size(); i++) {
        Button button = (Button) findViewById(getResources().getIdentifier("button" + i, "id",
                this.getPackageName()));
       column1=studyList.get(i).get(1);
       column2=studyList.get(i).get(2);

    if ((!column1.equals(studyPrice))||(column2.compareTo(studyRate)<0)){
           ((ViewGroup) button.getParent()).removeView(button);

             }
    }

}

    public void handleMatch(View view) {
        setContentView(R.layout.activity_match);
    }

}
