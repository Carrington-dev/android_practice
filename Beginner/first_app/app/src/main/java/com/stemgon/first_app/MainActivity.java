package com.stemgon.first_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonClick(v);
            }

        });

        Button lgnButton = findViewById(R.id.signUpButton);

        lgnButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                System.out.println("SignUpButton clicked");
                openNewActivity();
            }
        });

    }

    public void buttonClick(View v){
        TextInputLayout username = findViewById(R.id.username);
        TextInputLayout email = findViewById(R.id.email);
        TextInputLayout phone = findViewById(R.id.phone);

        TextView phoneOut = findViewById(R.id.phoneOutput);
        TextView emailOut = findViewById(R.id.emailOutput);
        TextView userOutOut = findViewById(R.id.usernameOutput);

        phoneOut.setText("Phone: " + phone.getEditText().getText().toString());
        emailOut.setText("Email: " + email.getEditText().getText().toString());
        userOutOut.setText("Username: " + username.getEditText().getText().toString());
    };

    public void openNewActivity(){
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
}