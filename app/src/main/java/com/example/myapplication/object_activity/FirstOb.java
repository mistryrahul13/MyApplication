package com.example.myapplication.object_activity;

import androidx.appcompat.app.AppCompatActivity;
import com.example.myapplication.R;
import com.example.myapplication.activity_switch_explicit.FirstActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class FirstOb extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_ob);
        getSupportActionBar().hide();
        Button b = findViewById(R.id.btnob);
        EditText e = findViewById(R.id.edtxtob);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = e.getText().toString();
                if (str.isEmpty()){
                    e.setError("Fill the Data");
                }else {
                    Intent i = new Intent(FirstOb.this, SecondOb.class);
                    i.putExtra("Data",str);
                    startActivity(i);
                }

            }
        });

        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}