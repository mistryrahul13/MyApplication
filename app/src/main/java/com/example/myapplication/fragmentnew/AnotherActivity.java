package com.example.myapplication.fragmentnew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.myapplication.R;
import com.example.myapplication.databinding.ActivityAnotherBinding;

public class AnotherActivity extends AppCompatActivity {
    private ActivityAnotherBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityAnotherBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}