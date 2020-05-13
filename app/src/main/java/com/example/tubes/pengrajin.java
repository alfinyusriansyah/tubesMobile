package com.example.tubes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class pengrajin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengrajin);
    }

    public void chat (View view){

        Intent intent = new Intent(pengrajin.this, chatting.class);
        startActivity(intent);
    }

    public void home (View view){

        Intent intent = new Intent(pengrajin.this, menu.class);
        startActivity(intent);
    }
}
