package com.example.myshop;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Login extends AppCompatActivity {

    // declarations
    Button  login;
    TextView  forgot_password, sign_up;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

            // initialize
            //login = findViewById(R.id.btnLogin);
            forgot_password = findViewById(R.id.txtForgotPassword);
            sign_up = findViewById(R.id.txtSignup);

            // setOnClickListener
            /*login.setOnClickListener(view -> {
                // do something
            });*/
            forgot_password.setOnClickListener(view -> {
                // do something
            });
            sign_up.setOnClickListener(view -> {
                // move to sign up activity
                startActivity(new Intent(Login.this, Sign_up.class));
            });

        }
    }
