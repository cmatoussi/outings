package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class smith extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smith);
    }
    public void handleLibrary(View view){
        setContentView(R.layout.activity_library);
        Intent intent = new Intent(this, library.class);
        startActivity(intent);
    }
    public void handleOther(View view){
        setContentView(R.layout.activity_other);
        Intent intent = new Intent(this, other.class);
        startActivity(intent);
    }

}
