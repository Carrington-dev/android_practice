package com.stemgon.vroomy.welcome;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.stemgon.vroomy.R;
import com.stemgon.vroomy.adapters.CustomFragmentAdapter;
import com.stemgon.vroomy.adapters.VehicleAdapter;

import java.util.ArrayList;
import java.util.Arrays;

public class NewsActivity extends AppCompatActivity {
    ListView listViewNow, listViewWel, listViewNew;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        listViewNow = findViewById(R.id.list_item_now);
        ArrayList<String> myList = new ArrayList<String>();
        for(int i = 0; i < 23; i++){
            myList.add("Cape Town " + i);
        }

        ArrayAdapter<String> adapterView = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                myList
        );

        listViewNow.setAdapter(adapterView);




        listViewWel = findViewById(R.id.list_item_wel);
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList(new String[]{"Carington", "Portia", "Chalmers", "Cornwel", "Rendani",
                "Sharon", "Oluga", "Nthabi", "Ndivhu", "Carington", "Portia", "Chalmers", "Cornwel", "Rendani",
                "Sharon", "Oluga", "Nthabi", "Ndivhu", "Carington", "Portia", "Chalmers", "Cornwel", "Rendani",
                "Sharon", "Oluga", "Nthabi", "Ndivhu", "Carington", "Portia", "Chalmers", "Cornwel", "Rendani",
                "Sharon", "Oluga", "Nthabi", "Ndivhu"}));


        ArrayAdapter<String> new_arr = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, names);

        listViewWel.setAdapter(new_arr);


        listViewNew = findViewById(R.id.list_item_new);

        ArrayList<String> car_titles = new ArrayList<>();
        ArrayList<String> car_prices = new ArrayList<>();


        for(int i = 0; i < 50; i++){
            car_titles.add("2023 Hyundai Elantra For Sale");
            car_prices.add("R. 567,000");
        }



        CustomFragmentAdapter adapter = new CustomFragmentAdapter(
                this,
                car_titles,
                car_prices
        );

        listViewNew.setAdapter(adapter);
    }
}