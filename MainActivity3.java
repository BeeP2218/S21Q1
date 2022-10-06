package com.example.s21q1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    
    TextView t2,t3,t4,t5,t6,t7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        t2=(TextView) findViewById(R.id.textView2);
        t3=(TextView) findViewById(R.id.textView3);
        t4=(TextView) findViewById(R.id.textView4);
        t5=(TextView) findViewById(R.id.textView5);
        t6=(TextView) findViewById(R.id.textView6);
        t7=(TextView) findViewById(R.id.textView7);

        Intent i2=getIntent();

        String res=i2.getStringExtra("MESSAGE");
        t2.setText(res);
        String res2=i2.getStringExtra("MESSAGE2");
        t3.setText(res2);
        String res3=i2.getStringExtra("MESSAGE3");
        t4.setText(res3);
        String res4=i2.getStringExtra("MESSAGE4");
        t5.setText(res4);
        String res5=i2.getStringExtra("MESSAGE5");
        t6.setText(res5);
        String res6=i2.getStringExtra("MESSAGE6");
        t7.setText(res6);
    }
}