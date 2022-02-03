package com.example.alzheimersdetector;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Test3 extends AppCompatActivity {

    RadioButton rdb1,rdb2;
    RadioGroup rdg1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_test3);

        rdg1 = findViewById(R.id.rdg1);
        rdb1 = findViewById(R.id.rdb1);
        rdb2 = findViewById(R.id.rdb2);

        rdb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Test3.this,"Correct!",Toast.LENGTH_SHORT).show();
            }
        });

        rdb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Test3.this,"You`r Wrong!",Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void test4(View view) {
        Intent homeIntent = new Intent(Test3.this, Test4.class);
        startActivity(homeIntent);
    }
}