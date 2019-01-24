package com.mca.amalz.studentapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class welcomeActivity extends AppCompatActivity {
    String usn,pass;
    Button B;
    String check;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

//        SharedPreferences pref=getSharedPreferences("login",MODE_PRIVATE);
//        check=pref.getString("username",null);
//
//        if(check==null)
//        {
//            Intent i=new Intent(getApplicationContext(),Login.class);
//            startActivity(i);
//        }



        B=(Button)findViewById(R.id.logout);
        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor=getSharedPreferences("login",MODE_PRIVATE).edit();
                editor.clear();
                editor.apply();
                Intent i=new Intent(getApplicationContext(),Login.class);
                startActivity(i);
             }

        });

        SharedPreferences sharedPreferences=getSharedPreferences("login",MODE_PRIVATE);
        usn=sharedPreferences.getString("username",null);
        pass=sharedPreferences.getString("password",null);
        Toast.makeText(getApplicationContext(),usn,Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(),pass,Toast.LENGTH_SHORT).show();


        //Intent j=getIntent();
        //usn=j.getExtras().getString("StudentID");
        //pass=j.getExtras().getString("Password");

//        Toast.makeText(getApplicationContext(),usn,Toast.LENGTH_SHORT).show();
//        Toast.makeText(getApplicationContext(),pass,Toast.LENGTH_SHORT).show();

    }
}
