package com.example.tubes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class hal1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal1);
    }

    public void login (View view){

        Intent intent = new Intent(hal1.this, login.class);
        startActivity(intent);
    }

    public void signup (View view){

        Intent intent = new Intent(hal1.this, singup.class);
        startActivity(intent);
    }
}
