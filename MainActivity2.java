package com.example.s21q1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    EditText e1,e2,e3,e4,e5,e6;
    Button b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        e1=(EditText) findViewById(R.id.editText);
        e2=(EditText) findViewById(R.id.editText2);
        e3=(EditText) findViewById(R.id.editText3);
        e4=(EditText) findViewById(R.id.editText4);
        e5=(EditText) findViewById(R.id.editText5);
        e6=(EditText) findViewById(R.id.editText6);
        b2=(Button) findViewById(R.id.button2);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=getIntent();

                Intent i2=new Intent(getApplicationContext(),MainActivity3.class);

                String res=e1.getText().toString();
                i2.putExtra("MESSAGE",res);
                String res2=e2.getText().toString();
                i2.putExtra("MESSAGE2",res2);
                String res3=e3.getText().toString();
                i2.putExtra("MESSAGE3",res3);
                String res4=e4.getText().toString();
                i2.putExtra("MESSAGE4",res4);
                String res5=e5.getText().toString();
                i2.putExtra("MESSAGE5",res5);
                String res6=e6.getText().toString();
                i2.putExtra("MESSAGE6",res6);

                startActivity(i2);
            }
        });
    }
}