package com.stemgon.first_one;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonClick(v);
            }
        });

    }

    public void buttonClick(View view){

        EditText emailAddress = findViewById(R.id.editTextTextEmailAddress);
        EditText firstName = findViewById(R.id.editTextTextPersonName);
        EditText lastName = findViewById(R.id.editTextTextPersonName2);
        TextView textView = findViewById(R.id.textView);
        TextView textView2 = findViewById(R.id.textView2);
        TextView textView3 = findViewById(R.id.textView3);

        textView.setText("First Name: " + firstName.getText().toString());
        textView2.setText("Last Name: " + lastName.getText().toString());
        textView3.setText("Email: " + emailAddress.getText().toString());
    }
}