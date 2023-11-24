package com.stemgon.amodals.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.stemgon.amodals.R;
import com.stemgon.amodals.models.Flower;

import java.util.ArrayList;

public class GridAdapter extends BaseAdapter {
    Context context;
    ArrayList<Flower> flowers;
    LayoutInflater mInflater;


    public GridAdapter(Context context, ArrayList<Flower> flowers) {
        this.context = context;
        this.flowers = flowers;
        this.mInflater = mInflater.from(context);
    }

    @Override
    public int getCount() {
        return flowers.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

            View myView = convertView;
            if (myView == null) {
                // Layout Inflater inflates each item to be displayed in GridView.
                myView = LayoutInflater.from(getContext()).inflate(R.layout.grid_item, parent, false);
            }
            //myView = mInflater.inflate(R.layout.grid_item, null);

            ImageView flowerImage = myView.findViewById(R.id.grid_image);
            TextView flowerName = myView.findViewById(R.id.grid_name);

            //flowerImage.setImageResource(flowers.get(position).image);
            flowerName.setText(flowers.get(position).name);

            System.out.println(flowerName.getText().toString());
            return myView;

    }

    private Context getContext() {
        return context;
    }
}
