package com.mca.amalz.studentapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {
EditText t1,t2,t3,t4,t5,t6,t7;
Button b1,b2;
String gss1,gss2,gss3,gss4,gss5,gs6,gss7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        t1=(EditText)findViewById(R.id.name);
        t2=(EditText)findViewById(R.id.adm);
        t3=(EditText)findViewById(R.id.college);
        t4=(EditText)findViewById(R.id.place);
        t5=(EditText)findViewById(R.id.sid);
        t6=(EditText)findViewById(R.id.pass);
        t7=(EditText)findViewById(R.id.conpass);
        b1=(Button)findViewById(R.id.reg);
        b2=(Button)findViewById(R.id.alrdyreg);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              gss1=t1.getText().toString();
              gss2=t2.getText().toString();
              gss3=t3.getText().toString();
              gss4=t4.getText().toString();
              gss5=t5.getText().toString();
              gs6=t6.getText().toString();
              gss7=t7.getText().toString();



            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j=new Intent(getApplicationContext(),Login.class);
                startActivity(j);
            }
        });

    }
}
