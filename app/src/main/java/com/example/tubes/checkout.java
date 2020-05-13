package com.example.tubes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class checkout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);
    }

    public void kodePem (View view){

        Intent intent = new Intent(checkout.this, kodeBayar.class);
        startActivity(intent);
    }

    public void home (View view){

        Intent intent = new Intent(checkout.this, menu.class);
        startActivity(intent);
    }
}
