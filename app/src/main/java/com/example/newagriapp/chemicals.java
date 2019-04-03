package com.example.newagriapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

public class chemicals extends AppCompatActivity {
    Button mybutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chemicals);
        mybutton=findViewById(R.id.button4);
        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent =new Intent( chemicals .this,explore.class);
                startActivity(myintent);
            }
        });
    }
}
