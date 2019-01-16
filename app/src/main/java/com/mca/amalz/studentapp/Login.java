package com.mca.amalz.studentapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
EditText ed1,ed2;
Button but1,but2;
String str1,str2;
String usn="mzc",id="college";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ed1=(EditText)findViewById(R.id.sid);
        ed2=(EditText)findViewById(R.id.Pass);
        but1=(Button)findViewById(R.id.But1);
        but2=(Button)findViewById(R.id.But2);

        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                str1=ed1.getText().toString();
                str2=ed2.getText().toString();
                if((str1 .equals(usn)) && (str2.equals(id)))
                {
                    Intent j=new Intent(getApplicationContext(),welcomeActivity.class);
                    startActivity(j);
                }
                
                else {
                    Toast.makeText(getApplicationContext(),"username and password are incorrect",Toast.LENGTH_LONG).show();
                }
            }
        });
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k=new Intent(getApplicationContext(),RegisterActivity.class);
                startActivity(k);
            }
        });
    }
}
