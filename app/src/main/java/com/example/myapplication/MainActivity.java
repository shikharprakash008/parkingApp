package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    public void slot_book1(View view){

        startActivity(new Intent(MainActivity.this,bookingSlot1.class ));
    }

    public void slot_book2(View view){

        startActivity(new Intent(MainActivity.this, bookingSlot2.class));
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
