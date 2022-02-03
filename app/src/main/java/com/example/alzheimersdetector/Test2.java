package com.example.alzheimersdetector;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.TimePicker;

public class Test2 extends AppCompatActivity {

    TextView result1;
    TimePicker timePickerclock;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_test2);

        result1 = findViewById(R.id.settime);
        timePickerclock = findViewById(R.id.tp1);
        timePickerclock.setIs24HourView(true);

        timePickerclock.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int i, int i1) {
                result1.setText("Time: " + i + ":" + i1);
            }
        });
    }
    public void test3(View view) {
        Intent homeIntent = new Intent(Test2.this, Test3.class);
        startActivity(homeIntent);
    }
}