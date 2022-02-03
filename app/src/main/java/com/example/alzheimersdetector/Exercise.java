package com.example.alzheimersdetector;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;

public class Exercise extends AppCompatActivity {

    TextView t1, t2;
    ImageView i1, i2, i3, i4, i5, i6, i7 ,i8, i9, i10, i11, i12;
    Integer[] cardsArray = {101, 102, 103, 104, 105, 106, 201, 202, 203, 204, 205, 206};
    int Aries, Taurus, Gemini, Cancer, Leo, Virgo, Libra, Scorpio, Sagittarius, Capricorn, Aquarius, Pisces;
    int firstCard, secondCard;
    int clickedFirst, clickedSecond;
    int cardNumber = 1;
    int turn = 1;
    int playerPoints = 0, cpuPoints = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_exercise);

        t1 = (TextView) findViewById(R.id.t1);
        t2 = (TextView) findViewById(R.id.t2);

        i1 = (ImageView) findViewById(R.id.i1);
        i2 = (ImageView) findViewById(R.id.i2);
        i3 = (ImageView) findViewById(R.id.i3);
        i4 = (ImageView) findViewById(R.id.i4);
        i5 = (ImageView) findViewById(R.id.i5);
        i6 = (ImageView) findViewById(R.id.i6);
        i7 = (ImageView) findViewById(R.id.i7);
        i8 = (ImageView) findViewById(R.id.i8);
        i9 = (ImageView) findViewById(R.id.i9);
        i10 = (ImageView) findViewById(R.id.i10);
        i11 = (ImageView) findViewById(R.id.i11);
        i12 = (ImageView) findViewById(R.id.i12);

        i1.setTag("0");
        i2.setTag("1");
        i3.setTag("2");
        i4.setTag("3");
        i5.setTag("4");
        i6.setTag("5");
        i7.setTag("6");
        i8.setTag("7");
        i9.setTag("8");
        i10.setTag("9");
        i11.setTag("10");
        i12.setTag("11");

        frontOfCardsResources();
        Collections.shuffle(Arrays.asList(cardsArray));

        //t2.setTextColor(Color.GRAY);

        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(i1, theCard);
            }
        });
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(i2, theCard);
            }
        });
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(i3, theCard);
            }
        });
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(i4, theCard);
            }
        });
        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(i5, theCard);
            }
        });
        i6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(i6, theCard);
            }
        });
        i7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(i7, theCard);
            }
        });
        i8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(i8, theCard);
            }
        });
        i9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(i9, theCard);
            }
        });
        i10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(i10, theCard);
            }
        });
        i11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(i11, theCard);
            }
        });
        i12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(i12, theCard);
            }
        });
    }
    private void doStuff(ImageView iv, int card){
        if (cardsArray[card] == 101){
            iv.setImageResource(Aries);
        }else if (cardsArray[card] == 102){
            iv.setImageResource(Taurus);
        }else if (cardsArray[card] == 103){
            iv.setImageResource(Gemini);
        }else if (cardsArray[card] == 104){
            iv.setImageResource(Cancer);
        }else if (cardsArray[card] == 105){
            iv.setImageResource(Leo);
        }else if (cardsArray[card] == 106){
            iv.setImageResource(Virgo);
        }else if (cardsArray[card] == 201){
            iv.setImageResource(Libra);
        }else if (cardsArray[card] == 202){
            iv.setImageResource(Scorpio);
        }else if (cardsArray[card] == 203){
            iv.setImageResource(Sagittarius);
        }else if (cardsArray[card] == 204){
            iv.setImageResource(Capricorn);
        }else if (cardsArray[card] == 205){
            iv.setImageResource(Aquarius);
        }else if (cardsArray[card] == 206){
            iv.setImageResource(Pisces);
        }
        if (cardNumber == 1){
            firstCard = cardsArray[card];
            if (firstCard > 200){
                firstCard = firstCard - 100;
            }
            cardNumber = 2;
            clickedFirst = card;

            iv.setEnabled(false);
        }else if (cardNumber == 2){
            secondCard = cardsArray[card];
            if (secondCard > 200){
                secondCard = secondCard - 100;
            }
            cardNumber = 1;
            clickedSecond = card;

            i1.setEnabled(false);
            i2.setEnabled(false);
            i3.setEnabled(false);
            i4.setEnabled(false);
            i5.setEnabled(false);
            i6.setEnabled(false);
            i7.setEnabled(false);
            i8.setEnabled(false);
            i9.setEnabled(false);
            i10.setEnabled(false);
            i11.setEnabled(false);
            i12.setEnabled(false);

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    calculate();
                }
            }, 1000);
        }
    }
    private void calculate(){
        if (firstCard == secondCard){
            if (clickedFirst == 0){
                i1.setVisibility(View.INVISIBLE);
            }else if (clickedFirst == 1){
                i2.setVisibility(View.INVISIBLE);
            }else if (clickedFirst == 2){
                i3.setVisibility(View.INVISIBLE);
            }else if (clickedFirst == 3){
                i4.setVisibility(View.INVISIBLE);
            }else if (clickedFirst == 4){
                i5.setVisibility(View.INVISIBLE);
            }else if (clickedFirst == 5){
                i6.setVisibility(View.INVISIBLE);
            }else if (clickedFirst == 6){
                i7.setVisibility(View.INVISIBLE);
            }else if (clickedFirst == 7){
                i8.setVisibility(View.INVISIBLE);
            }else if (clickedFirst == 8){
                i9.setVisibility(View.INVISIBLE);
            }else if (clickedFirst == 9){
                i10.setVisibility(View.INVISIBLE);
            }else if (clickedFirst == 10){
                i11.setVisibility(View.INVISIBLE);
            }else if (clickedFirst == 11){
                i12.setVisibility(View.INVISIBLE);
            }

            if (clickedSecond == 0){
                i1.setVisibility(View.INVISIBLE);
            }else if (clickedSecond == 1){
                i2.setVisibility(View.INVISIBLE);
            }else if (clickedSecond == 2){
                i3.setVisibility(View.INVISIBLE);
            }else if (clickedSecond == 3){
                i4.setVisibility(View.INVISIBLE);
            }else if (clickedSecond == 4){
                i5.setVisibility(View.INVISIBLE);
            }else if (clickedSecond == 5){
                i6.setVisibility(View.INVISIBLE);
            }else if (clickedSecond == 6){
                i7.setVisibility(View.INVISIBLE);
            }else if (clickedSecond == 7){
                i8.setVisibility(View.INVISIBLE);
            }else if (clickedSecond == 8){
                i9.setVisibility(View.INVISIBLE);
            }else if (clickedSecond == 9){
                i10.setVisibility(View.INVISIBLE);
            }else if (clickedSecond == 10){
                i11.setVisibility(View.INVISIBLE);
            }else if (clickedSecond == 11){
                i12.setVisibility(View.INVISIBLE);
            }

            /*if (turn == 1){
                playerPoints++;
                t1.setText("P1: " + playerPoints);
            }else if (turn == 2){
                cpuPoints++;
                t2.setText("P2: " + cpuPoints);
            }*/
        } else {
            i1.setImageResource(R.drawable.imageback);
            i2.setImageResource(R.drawable.imageback);
            i3.setImageResource(R.drawable.imageback);
            i4.setImageResource(R.drawable.imageback);
            i5.setImageResource(R.drawable.imageback);
            i6.setImageResource(R.drawable.imageback);
            i7.setImageResource(R.drawable.imageback);
            i8.setImageResource(R.drawable.imageback);
            i9.setImageResource(R.drawable.imageback);
            i10.setImageResource(R.drawable.imageback);
            i11.setImageResource(R.drawable.imageback);
            i12.setImageResource(R.drawable.imageback);

            /*if (turn == 1){
                turn = 2;
                t1.setTextColor(Color.GRAY);
                t2.setTextColor(Color.BLACK);
            }else if (turn == 2){
                turn = 1;
                t2.setTextColor(Color.GRAY);
                t1.setTextColor(Color.BLACK);
            }*/
        }

        i1.setEnabled(true);
        i2.setEnabled(true);
        i3.setEnabled(true);
        i4.setEnabled(true);
        i5.setEnabled(true);
        i6.setEnabled(true);
        i7.setEnabled(true);
        i8.setEnabled(true);
        i9.setEnabled(true);
        i10.setEnabled(true);
        i11.setEnabled(true);
        i12.setEnabled(true);

        checkEnd();
    }

    private void checkEnd(){
        if (i1.getVisibility() == View.INVISIBLE && i2.getVisibility() == View.INVISIBLE && i3.getVisibility() == View.INVISIBLE && i4.getVisibility() == View.INVISIBLE && i5.getVisibility() == View.INVISIBLE && i6.getVisibility() == View.INVISIBLE && i7.getVisibility() == View.INVISIBLE && i8.getVisibility() == View.INVISIBLE && i9.getVisibility() == View.INVISIBLE && i10.getVisibility() == View.INVISIBLE && i11.getVisibility() == View.INVISIBLE && i12.getVisibility() == View.INVISIBLE){
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Exercise.this);
            alertDialogBuilder.setMessage("YOU PLAYED WELL !😃").setCancelable(false).setPositiveButton("PLAY AGAIN", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Intent i = new Intent(getApplicationContext(), Exercise.class);
                    startActivity(i);
                    finish();
                }
            }).setNegativeButton("EXIT", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            });
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }
    }
    private void frontOfCardsResources(){
        Aries = R.drawable.image101;
        Taurus = R.drawable.image102;
        Gemini = R.drawable.image103;
        Cancer = R.drawable.image104;
        Leo = R.drawable.image105;
        Virgo = R.drawable.image106;
        Libra = R.drawable.image201;
        Scorpio = R.drawable.image202;
        Sagittarius = R.drawable.image203;
        Capricorn = R.drawable.image204;
        Aquarius = R.drawable.image205;
        Pisces = R.drawable.image206;
    }
}