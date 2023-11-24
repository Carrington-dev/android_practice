package com.stemgon.master;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        Button sButton = findViewById(R.id.sbutton);
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                TextView textView = findViewById(R.id.firstText);
                if (textView.getText() == "Welcome"){
                    Toast.makeText(MainActivity.this, textView.getText() + " changed to Carrington", Toast.LENGTH_SHORT).show();
                    textView.setText("Carrington");
                    button.setText("LOG IN");
                    Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                    startActivity(intent);
                }else {

                    Toast.makeText(MainActivity.this, textView.getText() + " changed to welcome", Toast.LENGTH_SHORT).show();
                    textView.setText("Welcome");
                    button.setText("LOG OUT");
                    Intent intent = new Intent(MainActivity.this, ListActivity.class);
                    startActivity(intent);
                }

            }
        });

        sButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ListActivity.class);
                startActivity(intent);
            }
        });
    }
}