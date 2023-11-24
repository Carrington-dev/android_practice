package com.stemgon.master;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listing);

        String sessionId = getIntent().getStringExtra("position_id");

        ArrayList<String> images = new ArrayList<>();

        for(int i = 0; i < 50; i++){
            // images.add("https://vroomhive.com/cars-for-sale/bac/" + (i + 1) + "/2021");
            images.add("https://www.vroomhive.com/");
        }

        ListView list_item = findViewById(R.id.list_item);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                images
        );

        list_item.setAdapter(adapter);
        list_item.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(ListingActivity.this, ListItemActivity.class);
                intent.putExtra("images_views", images.get(position));
                startActivity(intent);
                Toast.makeText(ListingActivity.this, "Opening " + images.get(position), Toast.LENGTH_SHORT).show();
            }
        });

    }
}