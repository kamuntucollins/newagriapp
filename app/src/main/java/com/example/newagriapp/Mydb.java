package com.example.newagriapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Mydb extends AppCompatActivity {
    DatabaseHelper db;
    EditText txt1,txt2,txt3,txt4;
    Button sendbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.ic_local_florist_black_24dp);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        setContentView(R.layout.activity_mydb);

        db=new DatabaseHelper(this);

        txt1=findViewById(R.id.username);
        txt2=findViewById(R.id.email);

        txt3=findViewById(R.id.password);
        txt4=findViewById(R.id.cpassword);
        sendbtn=findViewById(R.id.send);
        sendbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=txt1.getText().toString();
                String s2=txt2.getText().toString();
                String s3=txt3.getText().toString();
                String s4=txt4.getText().toString();

                if(s.equals("")||s2.equals("")||s3.equals("")||s4.equals("")){
                    Toast.makeText(getApplicationContext(),"field all the required fields please",Toast.LENGTH_LONG).show();
                }
               else{
                   if(s3.equals(s4)){
                       Boolean chkusername=db.chkusername(s);
                       if (chkusername==true){
                           Boolean insert=db.insert(s,s2,s3);
                           if (insert==true){
                               Toast.makeText(getApplicationContext(),"registered successfully",Toast.LENGTH_LONG).show();
                           }
                       }
                       else{
                           Toast.makeText(getApplicationContext(),"username already exists try a new one",Toast.LENGTH_LONG).show();
                       }
                   }
                   Toast.makeText(getApplicationContext(),"the password doesnot match",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
