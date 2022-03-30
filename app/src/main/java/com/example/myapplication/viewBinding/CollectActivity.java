package com.example.myapplication.viewBinding;

import androidx.appcompat.app.AppCompatActivity;
import com.example.myapplication.R;
import com.example.myapplication.databinding.ActivityCollectBinding;
import com.example.myapplication.databinding.ActivityViewBinding;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class CollectActivity extends AppCompatActivity {
    private ActivityCollectBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityCollectBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        TextView tv = findViewById(R.id.tvclct1);
        TextView tv1 = findViewById(R.id.tvclct2);
        TextView tv2= findViewById(R.id.tvclct3);
        TextView tv3 = findViewById(R.id.tvclct4);
        TextView tv4 = findViewById(R.id.tvclct5);

        Intent i = getIntent();
        String str= i.getStringExtra("Data");
        tv.setText(str);

        Intent i1 = getIntent();
        String str1= i1.getStringExtra("Data");
        tv.setText(str1);

        Intent i2 = getIntent();
        String str2= i2.getStringExtra("Data");
        tv.setText(str2);

        Intent i3 = getIntent();
        String str3= i3.getStringExtra("Data");
        tv.setText(str3);

        Intent i4 = getIntent();
        String str4= i4.getStringExtra("Data");
        tv.setText(str4);










    }
}