package com.stemgon.first_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }



    public void onLoginBtnClick(View view) {

        System.out.println("Login Button Clicked");
        TextView btnLogin  = findViewById(R.id.textlogin);

        btnLogin.setText("I am working properly");
        btnLogin.setTextColor(Color.parseColor("#43bdec"));

    }

    public void onBaseOneBtnClick(View view) {
        Intent intent = new Intent(this, BaseOne.class);
        startActivity(intent);
    }
}