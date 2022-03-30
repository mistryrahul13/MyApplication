package com.example.myapplication.viewBinding;

import androidx.appcompat.app.AppCompatActivity;
import com.example.myapplication.R;
import com.example.myapplication.databinding.ActivityViewBinding;
import com.example.myapplication.object_activity.FirstOb;
import com.example.myapplication.object_activity.SecondOb;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ViewActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_view);

        Button b = findViewById(R.id.viewbtn);
        EditText e1 = findViewById(R.id.edttxt1);
        EditText e2 = findViewById(R.id.edttx2);
        EditText e3 = findViewById(R.id.edttx3);
        EditText e4 = findViewById(R.id.edttx4);
        EditText e5 = findViewById(R.id.edtx5);



















//
//        b.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String str = e1.getText().toString();
//                if (str.isEmpty()) {
//                    e1.setError("Fill the Data");
//                } else {
//                    Intent i = new Intent(ViewActivity.this, CollectActivity.class);
//                    i.putExtra("Data", str);
//                    startActivity(i);
//                }
//                String str1 = e2.getText().toString();
//                if (str1.isEmpty()) {
//
//                    e1.setError("Fill the Data");
//                } else {
//                    Intent i1 = new Intent(ViewActivity.this, CollectActivity.class);
//                    i1.putExtra("Data", str1);
//                    startActivity(i1);
//                }
//                String str2 = e3.getText().toString();
//                if (str2.isEmpty()) {
//                    e1.setError("Fill the Data");
//                } else {
//                    Intent i2 = new Intent(ViewActivity.this, CollectActivity.class);
//                    i2.putExtra("Data", str);
//                    startActivity(i2);
//                }
//                String str3 = e4.getText().toString();
//                if (str3.isEmpty()) {
//                    e1.setError("Fill the Data");
//                } else {
//                    Intent i3 = new Intent(ViewActivity.this, CollectActivity.class);
//                    i3.putExtra("Data", str);
//                    startActivity(i3);
//                }
//                String str4 = e5.getText().toString();
//                if (str.isEmpty()) {
//                    e1.setError("Fill the Data");
//                } else {
//                    Intent i4 = new Intent(ViewActivity.this, CollectActivity.class);
//                    i4.putExtra("Data", str);
//                    startActivity(i4);
//                }
//            }
//        });
    }
}