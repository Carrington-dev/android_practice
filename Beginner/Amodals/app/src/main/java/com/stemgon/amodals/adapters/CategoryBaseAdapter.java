package com.stemgon.amodals.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.stemgon.amodals.models.Category;

import java.util.ArrayList;

public class CategoryBaseAdapter extends BaseAdapter {
    private Context mContext;
    private ArrayList<Category> categories;


    public CategoryBaseAdapter(Context mContext, ArrayList<Category> categories) {
        this.mContext = mContext;
        this.categories = categories;
    }

    @Override
    public int getCount() {
        return categories.size();
    }

    @Override
    public Object getItem(int position) {
        return categories.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
