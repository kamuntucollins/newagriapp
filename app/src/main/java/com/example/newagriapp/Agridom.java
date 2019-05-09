package com.example.newagriapp;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.app.Notification;

import static com.example.newagriapp.App.channel_1_id;
import static com.example.newagriapp.App.channel_2_id;


public class Agridom extends AppCompatActivity {
  private NotificationManagerCompat notificationmanager;
  private EditText edittexttitle;
  private EditText editTextmessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.ic_local_florist_black_24dp);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        setContentView(R.layout.activity_agridom);


notificationmanager=NotificationManagerCompat.from(this);
edittexttitle=findViewById(R.id.txt1);
editTextmessage=findViewById(R.id.txt2);

    }
    public  void sendonchannel1(View v){
        String title=edittexttitle.getText().toString();
        String message=editTextmessage.getText().toString();
        Notification notify=new NotificationCompat.Builder(this,channel_1_id)
                .setSmallIcon(R.mipmap.icon)
                .setContentTitle(title)
                .setContentText(message)
                .setPriority(NotificationCompat.PRIORITY_LOW)
                .setCategory(NotificationCompat.CATEGORY_MESSAGE)
                .build();
        notificationmanager.notify(1,notify);
    }
public void sendonchannel2(View v){

    String title=edittexttitle.getText().toString();
    String message=editTextmessage.getText().toString();
    Notification notify=new NotificationCompat.Builder(this,channel_2_id)
            .setSmallIcon(R.drawable.ic_meso)
            .setContentTitle(title)
            .setContentText(message)
            .setPriority(NotificationCompat.PRIORITY_LOW)
            .build();
    notificationmanager.notify(2,notify);

}

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu_more,menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int a = item.getItemId();
        switch (a) {
            case R.id.email:
                Intent myintent1 = new Intent(Agridom.this, Email.class);
                startActivity(myintent1);
                break;
            case R.id.search:
                Intent myintent2 = new Intent(Agridom.this, chemicals.class);
                startActivity(myintent2);
                break;

            default:
                return false;
        }
        return super.onOptionsItemSelected(item);


    }

    }
