package com.example.newagriapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View;

public class explore extends AppCompatActivity {
Button mybutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.ic_local_florist_black_24dp);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        setContentView(R.layout.activity_explore);

        mybutton=findViewById(R.id.more);
        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent= new Intent(explore.this,Email.class);
                startActivity(myintent);
            }
        });
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.mymenu,menu);
        return super.onCreateOptionsMenu(menu);
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        int a=item.getItemId();
        switch (a){
            case R.id.Home:
                Intent myintent1 =new Intent(explore.this,MainActivity.class);
                startActivity(myintent1);
                break;
            case R.id.Chemicals:
                Intent myintent2 =new Intent(explore.this,chemicals.class);
                startActivity(myintent2);
                break;
            case R.id.Plants:
                Intent myintent3 =new Intent(explore.this,plants.class);
                startActivity(myintent3);
                break;
            case R.id.Service:
                Intent myintent4 =new Intent(explore.this,lists.class);
                startActivity(myintent4);
                break;
            case R.id.More:
                Intent myintent5 =new Intent(explore.this,Draweroptions.class);
                startActivity(myintent5);
                break;


            default:
                return false;

        }

        return super.onOptionsItemSelected(item);
    }
}
