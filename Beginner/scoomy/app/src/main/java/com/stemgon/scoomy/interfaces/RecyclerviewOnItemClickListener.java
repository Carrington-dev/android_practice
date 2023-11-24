package com.stemgon.scoomy.interfaces;

import android.view.View;
import android.widget.AdapterView;

public interface RecyclerviewOnItemClickListener {
    public void onItemClick(AdapterView<?> parent, View view, int position, long id);
}
