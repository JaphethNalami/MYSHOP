package com.example.myshop;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.journeyapps.barcodescanner.ScanContract;
import com.journeyapps.barcodescanner.ScanOptions;

public class Item_Add extends AppCompatActivity {

    // views declaration
     EditText item_name, item_price, units;
     Button btn_add, btn_scan, btn_delete;
     ImageView img_item,img_scan;
     TextView barcode;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_item_add);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // views initialization
        item_name = findViewById(R.id.et_item_name);
        item_price = findViewById(R.id.et_item_price);
        units = findViewById(R.id.et_item_quantity);
        btn_add = findViewById(R.id.btn_add_item);
        btn_delete = findViewById(R.id.btn_delete_item);
        img_item = findViewById(R.id.item_card_image);
        img_scan = findViewById(R.id.scan);
        barcode = findViewById(R.id.item_barcode);

        //scan function

        img_scan.setOnClickListener(v -> {
            scanCode();
        });

    }
    // scanning function
    private void scanCode() {
        ScanOptions options = new ScanOptions();
        options.setPrompt("Volume up to flash on");
        options.setBeepEnabled(true);
        options.setOrientationLocked(true);
        options.setCaptureActivity(CaptureAct.class);
        barLauncher.launch(options);
    }
    // launching camera activity
    ActivityResultLauncher<ScanOptions> barLauncher = registerForActivityResult(new ScanContract(), result -> {
        if (result != null) {
            // handle result
            AlertDialog.Builder builder = new AlertDialog.Builder(Item_Add.this);

            //set the code to textview barcode
            barcode.setText(result.getContents());
            }
    });
}