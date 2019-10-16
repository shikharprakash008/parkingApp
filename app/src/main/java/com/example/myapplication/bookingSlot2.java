package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class bookingSlot2 extends AppCompatActivity {

    public void success(View view){


    }

    public void cancel(View view){

        startActivity(new Intent(bookingSlot2.this, MainActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_slot2);
    }
}
