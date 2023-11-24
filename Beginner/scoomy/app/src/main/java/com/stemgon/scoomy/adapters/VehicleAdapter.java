package com.stemgon.scoomy.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.stemgon.scoomy.R;
import com.stemgon.scoomy.models.Car;
import com.stemgon.scoomy.models.Vehicle;

import java.util.ArrayList;

public class VehicleAdapter extends RecyclerView.Adapter<VehicleAdapter.MyViewHolder>{
    ArrayList<Vehicle> vehicles;
    Context context;

    public VehicleAdapter(ArrayList<Vehicle> vehicles, Context context) {
        this.vehicles = vehicles;
        this.context = context;
    }

    @NonNull
    @Override
    public VehicleAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.vehicle_item, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VehicleAdapter.MyViewHolder holder, int position) {
        holder.model.setText(vehicles.get(position).model);
        holder.price.setText("ZAR 316,890" ); //+ Integer.toString((vehicles.get(position).price))
        holder.type.setText(vehicles.get(position).type);
    }

    @Override
    public int getItemCount() {
        return vehicles.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView model , type, price;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            model = itemView.findViewById(R.id.model);
            type = itemView.findViewById(R.id.type);
            price = itemView.findViewById(R.id.price);


        }
    }
}
