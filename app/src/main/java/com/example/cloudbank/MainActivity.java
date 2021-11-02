package com.example.cloudbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Login(View v){

        EditText username=(EditText)findViewById(R.id.userName);
        EditText password=(EditText)findViewById(R.id.passwordField);
        TextView textView=(TextView) findViewById(R.id.erreur);
        if( username.getText().toString().equals("amine.jh" ) && password.getText().toString().equals("123456") ){
            System.out.println(password.getText().toString());
            Intent intent=new Intent(this,AcceuilActivity.class);
           startActivity(intent);

        }
        else{
            textView.setText("false credentials");
        }

        }

    }