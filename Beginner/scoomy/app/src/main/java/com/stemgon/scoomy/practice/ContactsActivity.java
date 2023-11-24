package com.stemgon.scoomy.practice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.AdapterView;

import com.stemgon.scoomy.R;
import com.stemgon.scoomy.adapters.VehicleAdapter;
import com.stemgon.scoomy.models.Vehicle;

import java.util.ArrayList;

public class ContactsActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<Vehicle> vehicles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        vehicles = new ArrayList<>();
        for(int i=0; i < 40; i++){
            vehicles.add(new Vehicle("MODEL S LONG DRIVE RANGE", "2026 MODEL X", 456000));
        }

        VehicleAdapter adapter = new VehicleAdapter(vehicles, this);
        recyclerView.setAdapter(adapter);


    }
}