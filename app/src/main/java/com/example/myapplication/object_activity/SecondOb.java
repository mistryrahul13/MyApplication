package com.example.myapplication.object_activity;

import androidx.appcompat.app.AppCompatActivity;
import com.example.myapplication.R;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondOb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_ob);
        getSupportActionBar().hide();
        TextView tv = findViewById(R.id.getobtxt);

                Intent i = getIntent();
                String str2= i.getStringExtra("Data");
                tv.setText(str2);
        }


    }
