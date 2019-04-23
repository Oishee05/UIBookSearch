package com.example.uibooksearch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button buybutton;
    Button sellbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buybutton = (Button) findViewById(R.id.BuyerButton);
        sellbutton = (Button) findViewById(R.id.SellerButton);

        buybutton.setOnClickListener(this);
        sellbutton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.BuyerButton:
                Intent showbuyChoice = new Intent(MainActivity.this, BuyerInfo.class);
                startActivity(showbuyChoice);
                break;
            case R.id.SellerButton:
                Intent showsellChoice = new Intent(MainActivity.this, SellerInfo.class);
                startActivity(showsellChoice);
                break;
        }
    }
}