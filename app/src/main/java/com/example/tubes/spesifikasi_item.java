package com.example.tubes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class spesifikasi_item extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spesifikasi_item);
    }

    public void keran (View view){

        Intent intent = new Intent(spesifikasi_item.this, keranjang.class);
        startActivity(intent);
    }

    public void chat (View view){

        Intent intent = new Intent(spesifikasi_item.this, chatting.class);
        startActivity(intent);
    }
}
