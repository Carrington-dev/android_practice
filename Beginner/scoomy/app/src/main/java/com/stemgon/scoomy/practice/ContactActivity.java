package com.stemgon.scoomy.practice;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.navigation.NavigationView;
import com.stemgon.scoomy.R;
import com.stemgon.scoomy.adapters.ViewPagerAdapter;

public class ContactActivity extends AppCompatActivity {
    ViewPager mViewPager;
    private Toolbar toolbar;
    private NavigationView navigationView;
    private DrawerLayout drawerLayout;



    // images array

    int[] images = {R.drawable.car_1, R.drawable.car_2, R.drawable.car_3, R.drawable.car_4,
            R.drawable.car_5, R.drawable.car_6, R.drawable.car_7, R.drawable.car_8,
            R.drawable.car_8, R.drawable.car_6, R.drawable.car_7, R.drawable.car_8,
    };



    // Creating Object of ViewPagerAdapter

    ViewPagerAdapter mViewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        toolbar = findViewById(R.id.appBar);



        mViewPager = (ViewPager)findViewById(R.id.viewPagerMain);



        // Initializing the ViewPagerAdapter

        mViewPagerAdapter = new ViewPagerAdapter(this, images);



        // Adding the Adapter to the ViewPager

        mViewPager.setAdapter(mViewPagerAdapter);
    }
}