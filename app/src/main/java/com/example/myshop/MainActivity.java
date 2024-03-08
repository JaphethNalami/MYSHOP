package com.example.myshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Views declaration
    Button btnLogin;
    TextView signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Views initialization
        btnLogin = findViewById(R.id.btnSignIn);
        signup = findViewById(R.id.signup);

        //Set click listener on login button
        btnLogin.setOnClickListener(v -> {
            //Open login activity
            startActivity(new Intent(MainActivity.this, Login.class));
        });

    }
}