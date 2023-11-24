package com.stemgon.scoomy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.stemgon.scoomy.adapters.CarsAdapter;
import com.stemgon.scoomy.models.Car;
import com.stemgon.scoomy.practice.AddActivity;
import com.stemgon.scoomy.practice.BooksActivity;
import com.stemgon.scoomy.practice.ContactActivity;
import com.stemgon.scoomy.practice.ContactsActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity{

    BottomNavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        navigationView = findViewById(R.id.navigation_bar);
        navigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.home:
                    Intent intent = new Intent(MainActivity.this, ContactsActivity.class);
                    startActivity(intent);
                    return true;
                case R.id.cars:
                    Intent intent2 = new Intent(MainActivity.this, ContactActivity.class);
                    startActivity(intent2);
                    return true;
                case R.id.search:
                    Intent intent3 = new Intent(MainActivity.this, AddActivity.class);
                    startActivity(intent3);
                    return true;
                case R.id.profile:
                    Intent intent4 = new Intent(MainActivity.this, BooksActivity.class);
                    startActivity(intent4);
                    return true;
                default:
                    return true;


            }
        });
    }


}