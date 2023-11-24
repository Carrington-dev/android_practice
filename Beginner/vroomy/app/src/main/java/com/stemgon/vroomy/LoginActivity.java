package com.stemgon.vroomy;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.ListView;

import com.google.android.material.navigation.NavigationView;
import com.stemgon.vroomy.adapters.CustomFragmentAdapter;
import com.stemgon.vroomy.fragments.CarsFragment;
import com.stemgon.vroomy.fragments.SearchFragment;
import com.stemgon.vroomy.welcome.NewsActivity;
import com.stemgon.vroomy.welcome.VehicleActivity;

import java.util.ArrayList;
import java.util.Arrays;

public class LoginActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private Toolbar toolbar;
    private NavigationView navigationView;
    private DrawerLayout drawerLayout;
    ListView cars;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);

        toolbar = findViewById(R.id.appBar);
        navigationView = findViewById(R.id.navView);
        drawerLayout = findViewById(R.id.my_drawer_layout);
        setSupportActionBar(toolbar);

        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.openNav, R.string.closeNav);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(this);



        cars = findViewById(R.id.list_item_new);

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

        cars.setAdapter(adapter);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.top_menu, menu);
        return true;
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START) ){
            drawerLayout.closeDrawer(GravityCompat.START);
        }else{
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.add_to_fav:
            //                Intent intent = new Intent(LoginActivity.this, Welcome.class);
            //                startActivity(intent);
                replaceFragment(new CarsFragment());


            case R.id.search_badge:
                //                Intent intent2 = new Intent(LoginActivity.this, NewsActivity.class);
                //                startActivity(intent2);
                replaceFragment(new SearchFragment());

            case R.id.settings:
            //                Intent intent3 = new Intent(LoginActivity.this, VehicleActivity.class);
            //                startActivity(intent3);
                replaceFragment(new SearchFragment());
            case R.id.search_badge2:
                Intent intent3 = new Intent(LoginActivity.this, NewsActivity.class);
                startActivity(intent3);


            default:
                break;
        }
        return true;
    }

    private void replaceFragment(Fragment fragment)
    {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, fragment);
        fragmentTransaction.commit();
    }
}