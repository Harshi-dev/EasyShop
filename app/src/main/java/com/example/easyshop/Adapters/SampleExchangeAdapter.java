package com.example.easyshop.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.easyshop.Fragments.ProfileFragment;
import com.example.easyshop.Models.ProfileExchange;
import com.example.easyshop.R;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class SampleExchangeAdapter extends RecyclerView.Adapter<SampleExchangeAdapter.viewholder>{

    ArrayList<ProfileExchange> list;
    Context context;

    public SampleExchangeAdapter(ArrayList<ProfileExchange> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @NotNull
    @Override
    public viewholder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.sample_exchange,parent,false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull viewholder holder, int position) {

        final ProfileExchange model = list.get(position);
        holder.product_image.setImageResource(model.getImage());
        holder.owner.setText(model.getName());
        holder.product.setText(model.getProductName());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewholder extends RecyclerView.ViewHolder {

        ImageView product_image;
        TextView owner,product;
        RatingBar ratings;

        public viewholder(@NonNull @NotNull View itemView) {
            super(itemView);

            product_image = itemView.findViewById(R.id.productImage);
            owner = itemView.findViewById(R.id.ownerName);
            product = itemView.findViewById(R.id.productName);
        }
    }
}
