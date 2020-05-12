package com.example.tubes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class forgotEmail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forgot_email);
    }

    public void restart (View view){

        Intent intent = new Intent(forgotEmail.this, resetPass.class);
        startActivity(intent);
    }
}
