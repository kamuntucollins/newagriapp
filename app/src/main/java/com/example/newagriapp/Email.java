package com.example.newagriapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Email extends AppCompatActivity {
    Button sendBt;
    EditText text1,text2,text3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.ic_local_florist_black_24dp);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        setContentView(R.layout.activity_email);


        text1=findViewById(R.id.editText);
        text2=findViewById(R.id.text1);
        text3=findViewById(R.id.editText3);
        sendBt=findViewById(R.id.button8);

        sendBt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String to = text1.getText().toString();
                String sub = text2.getText().toString();
                String mes = text3.getText().toString();

                if (text2.getText().toString().isEmpty()) {
                    Toast.makeText(Email.this, "Please provide a subject to send", Toast.LENGTH_LONG).show();
                    text2.requestFocus();
                } else if (text3.getText().toString().isEmpty()) {
                    Toast.makeText(Email.this, "Message body is required", Toast.LENGTH_LONG).show();
                    text3.requestFocus();
                } else {

                    Intent email = new Intent(Intent.ACTION_SEND);
                    email.putExtra(Intent.EXTRA_EMAIL, new String[]{to});
                    email.putExtra(Intent.EXTRA_SUBJECT, sub);
                    email.putExtra(Intent.EXTRA_TEXT, mes);
                    email.setType("mes/rfc822");
                    startActivity(Intent.createChooser(email, "Select Email client like Gmail"));
                }
            }
        });
    }
}
