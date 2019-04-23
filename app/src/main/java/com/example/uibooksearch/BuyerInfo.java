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

public class BuyerInfo extends AppCompatActivity {
    String name, classes;
    long phonenumber;
    EditText Name;
    EditText PhoneNumber;
    EditText Course;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buyer_info);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        Name = (EditText) findViewById(R.id.Name);
        PhoneNumber = (EditText) findViewById(R.id.PhoneNumber);
        Course = (EditText) findViewById(R.id.Course);
        button = (Button) findViewById(R.id.SearchButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent showSellers = new Intent(BuyerInfo.this, DisplaySellerLocation.class);
                startActivity(showSellers);
            }
        });
    }
}