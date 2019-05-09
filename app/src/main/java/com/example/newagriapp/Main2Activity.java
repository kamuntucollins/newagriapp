package com.example.newagriapp;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.ic_local_florist_black_24dp);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        setContentView(R.layout.activity_main2);

        BottomNavigationView Bottom_nav=findViewById(R.id.bottom_navigation);
        Bottom_nav.setOnNavigationItemSelectedListener(navlistner );
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                new Homefragment()).commit();

    }
    private BottomNavigationView.OnNavigationItemSelectedListener navlistner=
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                    Fragment selectedFragment=null;
                    switch(menuItem.getItemId()){
                        case R.id.nav_home:
                            selectedFragment=new Homefragment();
                            break;
                        case R.id.nav_favorites:
                            selectedFragment=new favoritesfragment();
                            break;
                        case R.id.nav_flight:
                            selectedFragment=new exportsfragment();
                            break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                            selectedFragment).commit();
                    return true;
                }
            };
}
