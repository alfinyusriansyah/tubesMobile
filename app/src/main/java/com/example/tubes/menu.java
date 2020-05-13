package com.example.tubes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void item (View view){

        Intent intent = new Intent(menu.this, item.class);
        startActivity(intent);
    }

    public void tukang (View view){

        Intent intent = new Intent(menu.this, pengrajin.class);
        startActivity(intent);
    }

    public void jual (View view){

        Intent intent = new Intent(menu.this, jual_item.class);
        startActivity(intent);
    }
}
