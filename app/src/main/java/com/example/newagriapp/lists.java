package com.example.newagriapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

public class lists extends AppCompatActivity {
    ListView listView;
    ArrayList<String> array;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.ic_local_florist_black_24dp);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        setContentView(R.layout.activity_lists);

        listView = (ListView) findViewById(R.id.list1);
        array = new ArrayList<>();
        array.add("Tomatoes");
        array.add("Green paper");
        array.add("Cabbages");
        array.add("Cucamber");
        array.add("Bananas");
        array.add("carrots");
        array.add("Beet roots");
        array.add("Corn flower");
        array.add("lettuce");
        array.add("zuccine");
        array.add("onions");
        array.add("cattle");
        array.add("goats");
        array.add("poutrly");

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,array);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Toast.makeText(getApplicationContext()," "+array.get(position),Toast.LENGTH_SHORT).show();

            }
        });


    }
}
