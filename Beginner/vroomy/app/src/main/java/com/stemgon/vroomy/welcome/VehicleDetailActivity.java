package com.stemgon.vroomy.welcome;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.android.material.appbar.MaterialToolbar;
import com.smarteist.autoimageslider.SliderView;
import com.stemgon.vroomy.R;
import com.stemgon.vroomy.adapters.SliderAdapter;
import com.stemgon.vroomy.models.SliderData;

import java.util.ArrayList;

public class VehicleDetailActivity extends AppCompatActivity {

    // Urls of our images.
    String url1 = "https://img.autotrader.co.za/21993142";
    String url2 = "https://img.autotrader.co.za/21993145";
    String url3 = "https://img.autotrader.co.za/21993144";
    String url4 = "https://img.autotrader.co.za/21993143";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicle_detail);

        // we are creating array list for storing our image urls.
        ArrayList<SliderData> sliderDataArrayList = new ArrayList<>();

        // initializing the slider view.
        SliderView sliderView = findViewById(R.id.slider);
        TextView title = findViewById(R.id.title_view);
        MaterialToolbar toolbar = findViewById(R.id.appBar);
        toolbar.setTitle("2023 Hyundai Elantra For Sale");
        title.setText("2023 Hyundai Elantra For Sale");

        // adding the urls inside array list
        sliderDataArrayList.add(new SliderData(url1));
        sliderDataArrayList.add(new SliderData(url2));
        sliderDataArrayList.add(new SliderData(url3));
        sliderDataArrayList.add(new SliderData(url4));
        for (int i = 0; i < 12; i++){
            sliderDataArrayList.add(new SliderData("https://img.autotrader.co.za/21993143"));
        }

        // passing this array list inside our adapter class.
        SliderAdapter adapter = new SliderAdapter(this, sliderDataArrayList);

        // below method is used to set auto cycle direction in left to
        // right direction you can change according to requirement.
        sliderView.setAutoCycleDirection(SliderView.LAYOUT_DIRECTION_LTR);

        // below method is used to
        // setadapter to sliderview.
        sliderView.setSliderAdapter(adapter);

        // below method is use to set
        // scroll time in seconds.
        sliderView.setScrollTimeInSec(3);

        // to set it scrollable automatically
        // we use below method.
        sliderView.setAutoCycle(true);

        // to start autocycle below method is used.
        sliderView.startAutoCycle();
    }
}