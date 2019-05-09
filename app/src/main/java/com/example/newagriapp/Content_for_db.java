package com.example.newagriapp;

import android.Manifest;
import android.database.Cursor;
import android.provider.ContactsContract;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Content_for_db extends AppCompatActivity {
ListView mylist;
ArrayList myphonelist=new ArrayList();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.ic_local_florist_black_24dp);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        setContentView(R.layout.activity_content_for_db);


        ActivityCompat.requestPermissions(Content_for_db.this,new String[]{Manifest.permission.READ_CONTACTS},1);
        mylist=findViewById(R.id.listview);

        Cursor c=getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI,null,null,
                null,null,null);
        while (c.moveToNext()){
String name=c.getString(c.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME));
myphonelist.add(name);
mylist.setAdapter(new ArrayAdapter(Content_for_db.this,android.R.layout.simple_list_item_1,myphonelist));
        }
    }
}
