package com.example.myapplication.colours;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.SeekBar;

import com.example.myapplication.databinding.ActivityColourBinding;

public class ColourActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {
    private ActivityColourBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityColourBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.imageView.setBackgroundColor(Color.BLACK);

        binding.Sbred.setOnSeekBarChangeListener(this);
        binding.Sbgreen.setOnSeekBarChangeListener(this);
        binding.Sbblue.setOnSeekBarChangeListener(this);


    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

        int red = binding.Sbred.getProgress();
        int green = binding.Sbgreen.getProgress();
        int blue = binding.Sbblue.getProgress();

        binding.imageView.setBackgroundColor(Color.rgb(red,green,blue));
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}