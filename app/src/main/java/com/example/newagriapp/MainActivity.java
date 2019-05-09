package com.example.newagriapp;

import android.annotation.SuppressLint;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
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
    TextView mytext;
    private ImageView myimage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.ic_local_florist_black_24dp);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        setContentView(R.layout.activity_main);

        mybutton = findViewById(R.id.button2);
        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent = new Intent(MainActivity.this, explore.class);
                startActivity(myintent);

            }
        });




        mybutton=findViewById(R.id.button3);
        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent =new Intent( MainActivity .this,Store.class);
                startActivity(myintent);
            }
        });

        mytext=(TextView)findViewById(R.id.textView);
      mytext.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
Intent myintent=new Intent(MainActivity.this,Agridom.class);
startActivity(myintent);
              Toast.makeText(MainActivity.this, "you attempt to open AgriDom", Toast.LENGTH_SHORT).show();
          }
      });

        myimage=findViewById(R.id.img);
       myimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent =new Intent( MainActivity .this,Draweroptions.class);
                startActivity(myintent);
            }
        });



    }
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.frag_menu
                , menu);
        return super.onCreateOptionsMenu(menu);
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        int a = item.getItemId();
        switch (a) {
            case R.id.tour:
                Intent myintent1 = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(myintent1);
                break;

            case R.id.contact:
                Intent myintent2 = new Intent(MainActivity.this,Content_for_db.class);
                startActivity(myintent2);
                break;


            case R.id.Register:
                Intent myintent3 = new Intent(MainActivity.this,Mydb.class);
                startActivity(myintent3);
                break;
            default:
                return false;
        }
        return super.onOptionsItemSelected(item);
    }
}
