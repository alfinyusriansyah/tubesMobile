package com.example.tubes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void reset (View view){

        Intent intent = new Intent(login.this, forgotEmail.class);
        startActivity(intent);
    }

    public void inMenu (View view){

        Intent intent = new Intent(login.this, menu.class);
        startActivity(intent);
    }
}
