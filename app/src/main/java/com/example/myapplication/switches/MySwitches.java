package com.example.myapplication.switches;

import androidx.appcompat.app.AppCompatActivity;
import com.example.myapplication.R;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;

import com.example.myapplication.databinding.ActivityMySwitchesBinding;

public class MySwitches extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener{
    private ActivityMySwitchesBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMySwitchesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.getRoot().setBackgroundColor(Color.rgb(35,124,195));

        binding.cb1.setOnCheckedChangeListener(this);
        binding.sw1.setOnCheckedChangeListener(this);
        binding.tb1.setOnCheckedChangeListener(this);


    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

        if(b){

            if(compoundButton== binding.cb1){

//                binding.getRoot().setBackgroundColor(Color.rgb(52,42,255));

                binding.getRoot().setBackgroundResource(R.drawable.splashimg);
            }else{
//                binding.getRoot().setBackgroundColor(Color.rgb(56,142,70));

                binding.getRoot().setBackgroundResource(R.drawable.splashimg);
            }

            binding.imageView4.setVisibility(View.VISIBLE);


        }else{

            binding.getRoot().setBackgroundColor(Color.rgb(130,124,195));

            binding.imageView4.setVisibility(View.GONE);
        }



    }
}