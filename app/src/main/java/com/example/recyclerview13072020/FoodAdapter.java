package com.example.recyclerview13072020;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodHolder>{

    private List<Food> mFoods;
    private OnListenerItemClick mOnListenerItemClick;

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
        Food food = mFoods.get(position);
        holder.txtNameFood.setText(food.getName());
        holder.txtPriceFood.setText(food.getPrice() + "VND");
        holder.txtDescribeFood.setText(food.getDescribe());
        holder.imgFood.setImageResource(food.getImage());
    }

    @Override
    public int getItemCount() {
        return mFoods.size();
    }

    class FoodHolder extends RecyclerView.ViewHolder{
        ImageView imgFood;
        TextView txtNameFood,txtPriceFood,txtDescribeFood;
        public FoodHolder(@NonNull final View itemView) {
            super(itemView);
            imgFood = itemView.findViewById(R.id.imageFood);
            txtNameFood = itemView.findViewById(R.id.textviewNameFood);
            txtPriceFood = itemView.findViewById(R.id.textviewPriceFood);
            txtDescribeFood = itemView.findViewById(R.id.textviewDescribeFood);
            
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mOnListenerItemClick.onItemClick(getAdapterPosition());
                }
            });
        }
    }
    public void setOnListenerItemClick(OnListenerItemClick onListenerItemClick){
        this.mOnListenerItemClick = onListenerItemClick;
    }
}
