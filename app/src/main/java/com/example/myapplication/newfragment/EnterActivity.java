package com.example.myapplication.newfragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.myapplication.databinding.ActivityEnterBinding;

public class EnterActivity extends AppCompatActivity {
    private ActivityEnterBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityEnterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());






    }
}