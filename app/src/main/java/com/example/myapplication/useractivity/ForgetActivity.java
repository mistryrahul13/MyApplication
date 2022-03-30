package com.example.myapplication.useractivity;

import androidx.appcompat.app.AppCompatActivity;
import com.example.myapplication.R;
import com.example.myapplication.databinding.ActivityForgetBinding;
import com.example.myapplication.databinding.ActivityLogin1Binding;
import com.example.myapplication.databinding.ActivityRegisterBinding;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ForgetActivity extends AppCompatActivity {
    private ActivityForgetBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityForgetBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();

        binding.resetbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(ForgetActivity.this, LoginActivity.class);
                startActivity(i);
            }
        });
    }
}