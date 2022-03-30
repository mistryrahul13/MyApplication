package com.example.myapplication.useractivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.databinding.ActivityLogin1Binding;
import com.example.myapplication.menu.MenuActivity;

public class LoginActivity extends AppCompatActivity {
    private ActivityLogin1Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLogin1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();


        binding.btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LoginActivity.this, MenuActivity.class);
                startActivity(i);
            }

        });

        binding.fgtpswrd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LoginActivity.this, ForgetActivity.class);
                startActivity(i);
            }
        });
    }
}