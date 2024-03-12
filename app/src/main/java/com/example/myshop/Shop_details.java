package com.example.myshop;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Shop_details extends AppCompatActivity {
    Button finish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_shop_details);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // spinner
        Spinner spinner = (Spinner) findViewById(R.id.txtBusiness_type);
// Create an ArrayAdapter using the string array and a default spinner layout.
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this,
                R.array.spinner_items,
                android.R.layout.simple_spinner_item
        );
// Specify the layout to use when the list of choices appears.
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner.
        spinner.setAdapter(adapter);

        // binding views
        finish = findViewById(R.id.btnFinish);

        //click event for button finish
        finish.setOnClickListener(view -> {
            // move to shop details activity
            startActivity(new Intent(Shop_details.this, Item_Add.class));

        });
    }
}