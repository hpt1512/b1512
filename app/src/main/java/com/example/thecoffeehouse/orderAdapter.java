package com.example.thecoffeehouse;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class orderAdapter extends RecyclerView.Adapter<orderAdapter.orderViewholder>{
        Context context337;
        int row_layout337;
        List<orderItem> itemList337;

        public orderAdapter(Context context, List<orderItem> itemList,int row_layout) {
            this.context337 = context;
            this.itemList337 = itemList;
            this.row_layout337=row_layout;
        }

    @NonNull
    @Override
    public orderViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View itemView =layoutInflater.inflate(row_layout337,parent,false);
        return new orderViewholder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull orderViewholder holder, int position) {
        holder.image337.setImageResource(itemList337.get(position).getImage());
        holder.title337.setText(itemList337.get(position).getTitle());
        holder.price337.setText(itemList337.get(position).getPrice());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context337, MainActivity.class);
                context337.startActivities(new Intent[]{intent});
            }
        });
    }

    @Override
    public int getItemCount() {
        return itemList337.size();
    }

    public static final class orderViewholder extends RecyclerView.ViewHolder  {

            ImageView image337;
            TextView title337,price337;

            public orderViewholder(@NonNull View itemView) {
                super(itemView);
                image337=itemView.findViewById(R.id.image);
                title337=itemView.findViewById(R.id.title);
                price337=itemView.findViewById(R.id.price);
            }
        }
    }

