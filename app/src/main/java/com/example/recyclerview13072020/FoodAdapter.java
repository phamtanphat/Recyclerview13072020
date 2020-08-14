package com.example.recyclerview13072020;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodHolder>{

    private List<Food> mFoods;

    public FoodAdapter(List<Food> mFoods) {
        if (mFoods != null){
            this.mFoods = mFoods;
        }else{
            this.mFoods = new ArrayList<>();
        }
    }

    @NonNull
    @Override
    public FoodHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_food, parent, false);
        return new FoodHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return mFoods.size();
    }

    class FoodHolder extends RecyclerView.ViewHolder{
        ImageView imgFood;
        TextView txtNameFood,txtPriceFood,txtDescribeFood;
        public FoodHolder(@NonNull View itemView) {
            super(itemView);
            imgFood = itemView.findViewById(R.id.imageFood);
            txtNameFood = itemView.findViewById(R.id.textviewNameFood);
            txtPriceFood = itemView.findViewById(R.id.textviewPriceFood);
            txtDescribeFood = itemView.findViewById(R.id.textviewDescribeFood);
        }
    }
}
