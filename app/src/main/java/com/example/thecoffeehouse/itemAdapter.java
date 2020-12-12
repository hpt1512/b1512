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

public class itemAdapter extends RecyclerView.Adapter<itemAdapter.itemViewholder> {

    Context context337;
    List<item> itemList337;

    public itemAdapter(Context context, List<item> itemList) {
        this.context337 = context;
        this.itemList337 = itemList;
    }

    @NonNull
    @Override
    public itemViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context337).inflate(R.layout.row_item,parent,false);
        return new itemViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull itemViewholder holder, int position) {
        holder.image.setImageResource(itemList337.get(position).getImage());
        holder.title.setText(itemList337.get(position).getTitle());
        holder.text.setText(itemList337.get(position).getText());
        holder.bt.setText(itemList337.get(position).getBt());
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

    public static final class itemViewholder extends RecyclerView.ViewHolder  {

        ImageView image;
        TextView title,text,bt;

        public itemViewholder(@NonNull View itemView) {
            super(itemView);
            image=itemView.findViewById(R.id.image);
            title=itemView.findViewById(R.id.title);
            text=itemView.findViewById(R.id.text);
            bt=itemView.findViewById(R.id.button);
        }
    }
}
