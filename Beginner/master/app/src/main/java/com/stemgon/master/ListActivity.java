package com.stemgon.master;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ArrayList<String> cities =  new ArrayList<>();

        for(int i = 0; i < 50; i++){
            cities.add("Tshwane " + (i + 1));
        }

        ListView citiesListView =  findViewById(R.id.citiesList);
        ArrayAdapter<String> cityListAdapter = new ArrayAdapter<>(
                this,
                //android.R.layout.simple_list_item_1,
                R.layout.contacts,
                cities


        );

        citiesListView.setAdapter(cityListAdapter);
        citiesListView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListActivity.this, cities.get(position) + " is clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(ListActivity.this, ListingActivity.class);
                intent.putExtra("position_id", cities.get(position));
                startActivity(intent);
            }
        });


    }
}