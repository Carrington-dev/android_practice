package com.stemgon.scoomy.practice;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import com.stemgon.scoomy.MainActivity;
import com.stemgon.scoomy.R;
import com.stemgon.scoomy.adapters.CarsAdapter;
import com.stemgon.scoomy.models.Car;

import java.util.ArrayList;

public class CarListActivity extends AppCompatActivity {
    ListView containerView;
    Button button, singleCar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_list);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });




        containerView = findViewById(R.id.containerView);
        ArrayList<Car> cars = new ArrayList<>();

        for (int i = 0; i < 25; i++) {
            cars.add(new Car("Mazda 3 Sedan 2.0L", "Mazda", 2000 + i));
        }

        CarsAdapter carsAdapter = new CarsAdapter(this, cars);
        containerView.setAdapter(carsAdapter);


        containerView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(CarListActivity.this, ContactActivity.class);
                startActivity(intent);
            }
        });

        /*
        button = findViewById(R.id.button_recyclerview);
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ContactsActivity.class);
                startActivity(intent);
            }
        });

        singleCar = findViewById(R.id.button_contact);
        singleCar.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ContactActivity.class);
                startActivity(intent);
            }
        });
     */
    }
}