package com.example.uibooksearch;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SellerInfo extends AppCompatActivity {
    String name, classes;
    long phonenumber, pincode;
    EditText Name;
    EditText PhoneNumber;
    EditText Course;
    EditText PinCode;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seller_info);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Name = (EditText) findViewById(R.id.Name);
        PhoneNumber = (EditText) findViewById(R.id.PhoneNumber);
        Course = (EditText) findViewById(R.id.Course);
        PinCode = (EditText) findViewById(R.id.PinCode);
        button = (Button) findViewById(R.id.SearchButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent showSellers = new Intent(SellerInfo.this, AddSellerLocation.class);
                startActivity(showSellers);
            }
        });
    }
}
