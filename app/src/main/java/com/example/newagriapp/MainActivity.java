package com.example.newagriapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //my name is kamuntu collins
    // studying from mbarara university of science and technology
    // bachelor of information technology
    //registration number 2017/bit/085/ps
    //current year of study, year two
    // from mbarara district
    //hobby:software development
    Button mybutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mybutton=findViewById(R.id.button2);
        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent =new Intent( MainActivity .this,explore.class);
                startActivity(myintent);
            }
        });
    }
}
