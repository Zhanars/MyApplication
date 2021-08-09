package com.example.myapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.models.Service;

import java.util.List;

public class ServiceAdapter extends RecyclerView.Adapter<ServiceAdapter.ServiceViewHolder> {

    Context context;
    List<Service> services;

    public ServiceAdapter(Context context, List<Service> services) {
        this.context = context;
        this.services = services;
    }

    @NonNull
    @Override
    public ServiceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View serviceItems = LayoutInflater.from(context).inflate(R.layout.service_item, parent, false);
        return new ServiceViewHolder(serviceItems);
    }

    @Override
    public void onBindViewHolder(@NonNull ServiceViewHolder holder, int position) {
        holder.serviceTitle.setText(services.get(position).getTitle());
        //holder.serviceImg.setImageURI(services.get(position).getImg());

    }

    @Override
    public int getItemCount() {
        return services.size();
    }

    public static final class ServiceViewHolder extends RecyclerView.ViewHolder{

        TextView serviceTitle;
        ImageView serviceImg;

        public ServiceViewHolder(@NonNull View itemView) {
            super(itemView);
            serviceTitle = itemView.findViewById(R.id.serviceTitle);
            serviceImg = itemView.findViewById(R.id.serviceImg);
        }
    }
}
