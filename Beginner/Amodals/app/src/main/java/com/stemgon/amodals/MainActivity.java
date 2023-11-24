package com.stemgon.amodals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.stemgon.amodals.adapters.CategoryAdapter;
import com.stemgon.amodals.models.Category;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ListView listView;
    Button go_to_adapter_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.data_holder_list);
        go_to_adapter_btn = findViewById(R.id.go_to_adapter);
        
        go_to_adapter_btn.setOnClickListener(this);


        ArrayList<Category> categoriess = new ArrayList<>();
        ArrayList<String> categories = new ArrayList<>();

        for (int i = 0; i < 25; i++){
            categories.add(("Star "+ i + " is loading"));
        }

//        listView.setAdapter((ListAdapter) new CategoryAdapter(this, categories));
        listView.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, categories));
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.go_to_adapter:
                Intent intent = new Intent(MainActivity.this, GridActivity.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Grid Activity opened", Toast.LENGTH_SHORT).show();;
            default:
                break;
        }
    }
}