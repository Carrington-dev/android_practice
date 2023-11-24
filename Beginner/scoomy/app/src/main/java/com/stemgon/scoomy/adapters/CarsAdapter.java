package com.stemgon.scoomy.adapters;


import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.stemgon.scoomy.R;
import com.stemgon.scoomy.models.Car;

import java.util.ArrayList;


public class CarsAdapter extends BaseAdapter {

    LayoutInflater inflater;
    ArrayList<Car> names;
    Context context;

    public CarsAdapter(Context ctx, ArrayList<Car> names){
        this.context = ctx;
        this.inflater = LayoutInflater.from(ctx);
        this.names = names;
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
        convertView = inflater.inflate(R.layout.car_model, null);
        TextView make = convertView.findViewById(R.id.make);
        //TextView year = convertView.findViewById(R.id.year);
        TextView name = convertView.findViewById(R.id.name);

        //String yy = names.get(position)).year;

        name.setText((names.get(position)).name);
        make.setText(Integer.toString((names.get(position)).year) + " " + (names.get(position)).make);
        //year.setText(Integer.toString((names.get(position)).year));
        System.out.println(names.get(position).make);
        System.out.println(names.get(position).name);
        System.out.println(names.get(position).year);

        return convertView;
    }
}
