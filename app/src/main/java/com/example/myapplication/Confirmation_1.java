package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Confirmation_1 extends AppCompatActivity {

    public  void success(View view){


        Toast.makeText(this, "Confirmation mail has been sent to your registered email", Toast.LENGTH_SHORT).show();
    }

    public void cancel(View view){

        startActivity(new Intent(Confirmation_1.this, bookingSlot1.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation_1);
    }
}
