package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class registrationPage extends AppCompatActivity {

    EditText nameText, emailText, carText, pwdText;
    Button btn;
    FirebaseAuth mAuth;

    public void login(View view){

        startActivity(new Intent(registrationPage.this, loginPage.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_page);

        mAuth = FirebaseAuth.getInstance();
        nameText =findViewById(R.id.Name);
        emailText = findViewById(R.id.Email);
        carText = findViewById(R.id.Carno);
        pwdText = findViewById(R.id.pass);
        btn =findViewById(R.id.register);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email = emailText.getText().toString().trim();
                String pwd =pwdText.getText().toString().trim();


                mAuth.createUserWithEmailAndPassword(email, pwd).addOnCompleteListener(registrationPage.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        if(task.isSuccessful()){
                            FirebaseUser user = mAuth.getCurrentUser();
                            Toast.makeText(registrationPage.this, "You have been successfully registered", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(registrationPage.this, MainActivity.class));
                        } else {

                            Toast.makeText(registrationPage.this, "Error in registry", Toast.LENGTH_SHORT).show();
                        }
                    }
                });

            }
        });

    }
}
