package com.example.alzheimersdetector;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Test4 extends AppCompatActivity {

    RadioButton rdc1,rdc2;
    RadioGroup rdg2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_test4);

        rdg2 = findViewById(R.id.rdg2);
        rdc1 = findViewById(R.id.rdc1);
        rdc2 = findViewById(R.id.rdc2);

        rdc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Test4.this,"Correct!",Toast.LENGTH_SHORT).show();
            }
        });

        rdc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Test4.this,"You`r Wrong!",Toast.LENGTH_SHORT).show();
            }
        });
    }
}