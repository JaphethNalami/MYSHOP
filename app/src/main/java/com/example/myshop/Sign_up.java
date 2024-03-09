package com.example.myshop;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Sign_up extends AppCompatActivity {

    //declarations
    Button  sign_up;
    ImageView google;
    TextView  sign_in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //initialize
        sign_up = findViewById(R.id.btnSignUp);
        google = findViewById(R.id.imgGoogle);
        sign_in = findViewById(R.id.txtSignIn);

        //setOnClickListener
        sign_up.setOnClickListener(view -> {
            // move to shop details activity
            startActivity(new Intent(Sign_up.this, Shop_details.class));
        });
        google.setOnClickListener(view -> {
            // move to shop details activity
            startActivity(new Intent(Sign_up.this, Shop_details.class));
        });
        sign_in.setOnClickListener(view -> {
            // move to sign in activity
            startActivity(new Intent(Sign_up.this, Login.class));
        });


    }
}