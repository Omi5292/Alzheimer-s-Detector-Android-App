package com.example.alzheimersdetector;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_home);
    }
    public void inst(View view) {
        Intent i = new Intent(Home.this, Instructions.class);
        startActivity(i);
    }
    public void test(View view) {
        Intent i = new Intent(Home.this, Test.class);
        startActivity(i);
    }
    public void play(View view) {
        Intent i = new Intent(Home.this, Exercise.class);
        startActivity(i);
    }
    public void site(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.alz.org/in/dementia-alzheimers-en.asp"));
        startActivity(i);
    }
}