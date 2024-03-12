package com.example.myshop;

import static android.content.ContentValues.TAG;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


public class Sign_up extends AppCompatActivity {

    //declarations
    Button  sign_up;
    ImageView google;
    TextView  sign_in;
    EditText username,phone, email,password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
         FirebaseAuth mAuth = FirebaseAuth.getInstance();

        //initialize
        sign_up = findViewById(R.id.btnSignUp);
        google = findViewById(R.id.imgGoogle);
        sign_in = findViewById(R.id.txtSignIn);
        username = findViewById(R.id.username);
        phone = findViewById(R.id.phone);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);



        //setOnClickListener
        sign_up.setOnClickListener(view -> {

            // get values from views
            String name = username.getText().toString();
            String phone_number = phone.getText().toString();
            String mail = email.getText().toString();
            String pass = password.getText().toString();

            //  validate the inputs
            if (name.isEmpty()) {
                username.setError("Name is required");
                username.requestFocus();
                return;
            }
            if (phone_number.isEmpty()) {
                phone.setError("Phone number is required");
                phone.requestFocus();
                return;
            }
            if (mail.isEmpty()) {
                email.setError("Email is required");
                email.requestFocus();
                return;
            }
            if (pass.isEmpty()) {
                password.setError("Password is required");
                password.requestFocus();
                return;
            }

            else {
                //move shop details activity
                startActivity(new Intent(Sign_up.this, Shop_details.class));

            }
        });




        //google authentication
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