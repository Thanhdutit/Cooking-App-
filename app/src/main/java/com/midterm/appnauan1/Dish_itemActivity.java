package com.midterm.appnauan1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.midterm.appnauan1.databinding.ActivityDishItemBinding;

import java.util.ArrayList;

public class Dish_itemActivity extends AppCompatActivity {
    private ActivityDishItemBinding binding;
    private ArrayList<Food> arrayList;
    private DishAdappter dishAdappter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDishItemBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Intent it = getIntent();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ActionBar actionBar = getSupportActionBar();

        if(it!=null)
        {
            String data = it.getStringExtra("key");
            String name = it.getStringExtra("name");
            actionBar.setTitle(name);
            switch (data)
            {
                case "1":
                {
                    arrayList = new ArrayList<>();
                    dishAdappter = new DishAdappter(arrayList);
                    binding.rvFood.setAdapter(dishAdappter);
                    binding.rvFood.setLayoutManager(new GridLayoutManager(this, 3));
                    arrayList.add(new Food("https://img2.thuthuatphanmem.vn/uploads/2018/11/30/anh-dai-dien-zalo-de-thuong_104206622.jpg", "Món ăn cho cả nhà",1));
                    arrayList.add(new Food("https://img2.thuthuatphanmem.vn/uploads/2018/11/30/anh-dai-dien-zalo-de-thuong_104206622.jpg", "Khai vị và tráng miện",2));
                    arrayList.add(new Food("https://img2.thuthuatphanmem.vn/uploads/2018/11/30/anh-dai-dien-zalo-de-thuong_104206622.jpg", "Công thức nấu canh",3));
                    arrayList.add(new Food("https://img2.thuthuatphanmem.vn/uploads/2018/11/30/anh-dai-dien-zalo-de-thuong_104206622.jpg", "Pha cafe",4));
                    arrayList.add(new Food("https://img2.thuthuatphanmem.vn/uploads/2018/11/30/anh-dai-dien-zalo-de-thuong_104206622.jpg", "Các món bún,mỳ",5));
                    arrayList.add(new Food("https://img2.thuthuatphanmem.vn/uploads/2018/11/30/anh-dai-dien-zalo-de-thuong_104206622.jpg", "Đồ nướng",6));
                    dishAdappter.notifyDataSetChanged();
                }
            }
        }
    }
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case android.R.id.home:
                onBackPressed();
                return  true;
            default: break;
        }
        return super.onOptionsItemSelected(item);
    }
}