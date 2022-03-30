package com.example.myapplication.menu;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.provider.Settings;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;
import com.example.myapplication.databinding.ActivityMenuBinding;
import com.example.myapplication.useractivity.RegisterActivity;

public class MenuActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener{
    private ActivityMenuBinding binding;

    private Intent i;
    private Intent i1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityMenuBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        registerForContextMenu(binding.tvclickhere);

        binding.animationView.setVisibility(View.GONE);
        binding.checkBox.setOnCheckedChangeListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(com.example.myapplication.R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        i(item);
        return super.onOptionsItemSelected(item);
    }
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.main_menu,menu);
    }
    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        i(item);
        return super.onContextItemSelected(item);
    }
    void i (MenuItem item){
        switch (item.getItemId()){

            case R.id.item1:
                startActivity(new Intent(this, RegisterActivity.class));
                break;

            case R.id.item2:
                i=new Intent(Intent.ACTION_MAIN);
                i.addCategory(Intent.CATEGORY_APP_GALLERY);
                startActivity(i);
                break;

            case R.id.item3:
                i1=new Intent(Settings.ACTION_SETTINGS);
                startActivity(i1);
                break;

            case R.id.item4:
                System.exit(0);
                break;
        }
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if (b){
//            try {
//                Thread.sleep(1000);
//            }catch (Exception e){
//
//            }
            binding.animationView.setVisibility(View.VISIBLE);

        }else{
            binding.animationView.setVisibility(View.GONE);
        }

    }
}



