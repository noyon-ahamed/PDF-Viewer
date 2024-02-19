package com.example.pdfviewer;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dashbord extends AppCompatActivity {

    Button button1,button2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashbord);

        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MainActivity.asset= "muhammad_sa.pdf";

                Intent myint= new Intent(Dashbord.this,MainActivity.class);
                startActivity(myint);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.asset= "muhammad_sa.pdf";
                startActivity(new Intent(Dashbord.this,MainActivity.class));
            }
        });
    }
}