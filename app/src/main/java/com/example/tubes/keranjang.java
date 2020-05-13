package com.example.tubes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class keranjang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keranjang);
    }

    public void home (View view){

        Intent intent = new Intent(keranjang.this, menu.class);
        startActivity(intent);
    }

    public void cekout (View view){

        Intent intent = new Intent(keranjang.this, checkout.class);
        startActivity(intent);
    }


}
