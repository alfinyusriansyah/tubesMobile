package com.example.tubes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class kodeBayar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kode_bayar);
    }

    public void home (View view){

        Intent intent = new Intent(kodeBayar.this, menu.class);
        startActivity(intent);
    }
}
