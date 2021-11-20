package com.example.cloudbank;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class BlankFragment extends Fragment {

  private EditText email;
    private EditText password;
    private  Button signup;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.fragment_blank,container,false);
        email=(EditText) rootView.findViewById(R.id.emailRegister);
        password=(EditText) rootView.findViewById(R.id.passwordRegister);
        signup=(Button) rootView.findViewById(R.id.signupButton);

        signup.setOnClickListener( new View.OnClickListener( ){
            @Override
            public void onClick(View v) {
                Log.d("test" ,email.getText().toString());

            }
        });

        return inflater.inflate(R.layout.fragment_blank, container, false);
    }
}