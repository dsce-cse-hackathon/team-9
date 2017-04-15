package com.example.ashish.auto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class loginpage extends AppCompatActivity {

    EditText emailEditText, passwordEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);

        emailEditText=(EditText)findViewById(R.id.emaileditText);
        passwordEditText=(EditText)findViewById(R.id.PasswordeditText);


    }
    public void SignInCallback(View v){

        String mEmail, mPassword;
        mEmail = emailEditText.getText().toString();
        mPassword = passwordEditText.getText().toString();
        if(mEmail.equals("ashish10677@gmail.com")
                && mPassword.equals("ashish123")){

            Intent intent = new Intent(loginpage.this,LoggedIn2.class);
            startActivity(intent);

        }
        else
        {
            Toast.makeText(this, "Wrong email or password", Toast.LENGTH_SHORT).show();
        }


    }


}
