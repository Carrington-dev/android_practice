package com.stemgon.vroomy.welcome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.stemgon.vroomy.R;
import com.stemgon.vroomy.adapters.VehicleAdapter;

import java.util.ArrayList;

public class VehicleActivity extends AppCompatActivity {
    ListView cars;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicle);

        cars = findViewById(R.id.cars_list);

        ArrayList<String> car_titles = new ArrayList<>();
        ArrayList<String> car_prices = new ArrayList<>();

        for(int i = 0; i < 34; i++){
            car_titles.add("2023 Hyundai Elantra For Sale");
            car_prices.add("R. 567,000");
        }


        VehicleAdapter car_adapter = new VehicleAdapter(this, car_titles, car_prices);

        cars.setAdapter(car_adapter);
        cars.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(VehicleActivity.this, car_titles.get(position) + " opened.", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(VehicleActivity.this, VehicleDetailActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}