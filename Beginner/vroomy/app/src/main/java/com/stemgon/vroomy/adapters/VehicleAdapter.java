package com.stemgon.vroomy.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.stemgon.vroomy.R;

import java.util.ArrayList;

public class VehicleAdapter extends BaseAdapter {
    LayoutInflater inflater;
    Context context;
    ArrayList<String> names;
    ArrayList<String> price;


    public VehicleAdapter(Context ctx, ArrayList<String> n, ArrayList<String> price){
        this.context = ctx;
        this.names = n;
        this.price = price;
        this.inflater = LayoutInflater.from(ctx);
    }

    @Override
    public int getCount() {
        return names.size();
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
        convertView = inflater.inflate(R.layout.vehicles, null);
        ImageView vehicle_image = convertView.findViewById(R.id.vehicle_view);
        ImageView icon_view = convertView.findViewById(R.id.icon_view);
        TextView vehicle_title = convertView.findViewById(R.id.title_view);
        TextView vehicle_price = convertView.findViewById(R.id.price_view);

        vehicle_title.setText(names.get(position));
        vehicle_price.setText(price.get(position) + " in Pretoria, Gauteng");
        icon_view.setImageResource(R.drawable.ic_info);

        return convertView;
    }
}
