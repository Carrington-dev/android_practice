package com.stemgon.vroomy.adapters;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.stemgon.vroomy.R;



import java.util.ArrayList;



public class CustomFragmentAdapter extends BaseAdapter {
    LayoutInflater inflater;
    ArrayList<String> titles;
    ArrayList<String> prices;
    Context context;

    public CustomFragmentAdapter(Context ctx, ArrayList<String> n, ArrayList<String> p){
        this.context = ctx;
        this.titles = n;
        this.prices = p;
        this.inflater = LayoutInflater.from(ctx);
    };

    @Override
    public int getCount() {
        return titles.size();
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

        convertView = inflater.inflate(R.layout.single_car, null);
        TextView textView = convertView.findViewById(R.id.title_view);
        TextView priceView = convertView.findViewById(R.id.price_view);
        ImageView imageView = convertView.findViewById(R.id.icon_view);
//        ImageView vView = convertView.findViewById(R.id.vehicle_view);

        textView.setText(titles.get(position));
        priceView.setText(prices.get(position));
        imageView.setImageResource(R.drawable.ic_info);
//        vView.setImageResource(R.drawable.ic_info);



        /*
        convertView = inflater.inflate(R.layout.vehicles, null);
        ImageView vehicle_image = convertView.findViewById(R.id.vehicle_view);
        ImageView icon_view = convertView.findViewById(R.id.icon_view);
        TextView vehicle_title = convertView.findViewById(R.id.title_view);
        TextView vehicle_price = convertView.findViewById(R.id.price_view);

        vehicle_title.setText(names.get(position));
        vehicle_price.setText(price.get(position) + " in Pretoria, Gauteng");
        icon_view.setImageResource(R.drawable.ic_info);
        */

        return convertView;
    }



}

