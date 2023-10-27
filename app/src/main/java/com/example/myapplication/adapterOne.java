package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class adapterOne extends RecyclerView.Adapter<adapterOne.adapterOneHolder>{
    Context context;
    List<modelProduct> product;

    public adapterOne(Context context, List<modelProduct> product) {
        this.context = context;
        this.product = product;
    }


    @NonNull
    @Override
    public adapterOneHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View product = LayoutInflater.from(context).inflate(R.layout.product_item, parent, false);
        return new adapterOne.adapterOneHolder(product);
    }

    @Override
    public int getItemCount() {
        return product.size();
    }

    @Override
    public void onBindViewHolder(@NonNull adapterOneHolder holder, int position) {
        int imageId = context.getResources().getIdentifier("ic_" + product.get(position).getImg(), "drawable" , context.getPackageName());
        holder.image.setImageResource(imageId);
        holder.title.setText(product.get(position).getTitle());
        holder.cost.setText(product.get(position).getCost());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switcherbuy = new Intent(context, buy.class);
                context.startActivity(switcherbuy);
            }
        });
    }

    public void setAdapter(adapterOne adapterOne) {
    }

    public  static final class adapterOneHolder extends  RecyclerView.ViewHolder{
        ImageView image;
        TextView title, cost;
        public adapterOneHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image);
            title = itemView.findViewById(R.id.textView);
            cost = itemView.findViewById(R.id.textViewCost);
        }
    }
}
