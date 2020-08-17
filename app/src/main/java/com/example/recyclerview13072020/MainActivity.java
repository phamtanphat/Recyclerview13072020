package com.example.recyclerview13072020;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.logging.Logger;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRcvFood;
    FoodAdapter mFoodAdapter;
    ArrayList<Food> mArrayFoods;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRcvFood = findViewById(R.id.recyclerviewFood);
        mArrayFoods = new ArrayList<>();
        mArrayFoods.add(new Food(R.drawable.hinh_mon_banh_khot,"Bánh khọt","Món ăn miền trung",20000));
        mArrayFoods.add(new Food(R.drawable.hinh_mon_banh_my,"Bánh mỳ","Món ăn nổi tiếng của Việt Nam",25000));
        mArrayFoods.add(new Food(R.drawable.hinh_mon_bi_ngoi_chien_xu,"Bí ngòi chiên xù","Món ăn lạ hấp dẫn",30000));
        mArrayFoods.add(new Food(R.drawable.hinh_mon_bun_mam,"Bún mắm","Bún mắm đặc sản quán cô Ba",40000));
        mArrayFoods.add(new Food(R.drawable.hinh_mon_bun_rieu,"Bún riêu","Bún mắm đặc sản quán cô Ba",25000));
        mArrayFoods.add(new Food(R.drawable.hinh_mon_muc,"Mực nướng","Hải sản tươi sống",25000));

        mFoodAdapter = new FoodAdapter(mArrayFoods);
        mRcvFood.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
        mRcvFood.setAdapter(mFoodAdapter);


        mFoodAdapter.setOnListenerItemClick(new OnListenerItemClick() {
            @Override
            public void onItemClick(int position) {
                mArrayFoods.remove(position);
//                mFoodAdapter.notifyDataSetChanged();
                mFoodAdapter.notifyItemRemoved(position);
                Log.d("BBB",mArrayFoods.size() + "");
            }
        });
    }
}