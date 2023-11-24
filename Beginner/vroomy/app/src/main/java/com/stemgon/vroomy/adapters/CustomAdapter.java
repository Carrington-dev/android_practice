package com.stemgon.vroomy.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.stemgon.vroomy.R;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {
    Context context;
    ArrayList<String> names;
    ArrayList<String> surnames;
    LayoutInflater inflater;

    public CustomAdapter(Context ctx, ArrayList<String> n, ArrayList<String> s){
        this.context = ctx;
        this.names = n;
        this.surnames= s;
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
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.contacts_layout, null);
        TextView myname = convertView.findViewById(R.id.name_view);
        TextView mysname = convertView.findViewById(R.id.sname_view);
        ImageView myIcon = convertView.findViewById(R.id.icon_view);
        ImageView mypro = convertView.findViewById(R.id.profile_view);

        myname.setText(names.get(position) +" Muleya" );
        mysname.setText((surnames.get(position)).toLowerCase()+"@vroomhive.com");
        myIcon.setImageResource(R.drawable.ic_info);
        mypro.setImageResource(R.drawable.ic_profile);

        return convertView;
    }
}
