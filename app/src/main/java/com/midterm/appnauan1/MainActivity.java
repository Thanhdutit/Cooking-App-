package com.midterm.appnauan1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.midterm.appnauan1.databinding.ActivityMainBinding;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private ArrayList<MenuFood> arrayList;
    private ListFoodAdappter listFoodAdappter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ViewFlipper();
        arrayList = new ArrayList<>();
        listFoodAdappter = new ListFoodAdappter(arrayList);
        binding.rvFood.setAdapter(listFoodAdappter);
        binding.rvFood.setLayoutManager(new GridLayoutManager(this, 3));
        arrayList.add(new MenuFood("https://img2.thuthuatphanmem.vn/uploads/2018/11/30/anh-dai-dien-zalo-de-thuong_104206622.jpg", "Món ăn cho cả nhà",1));
        arrayList.add(new MenuFood("https://img2.thuthuatphanmem.vn/uploads/2018/11/30/anh-dai-dien-zalo-de-thuong_104206622.jpg", "Khai vị và tráng miện",2));
        arrayList.add(new MenuFood("https://img2.thuthuatphanmem.vn/uploads/2018/11/30/anh-dai-dien-zalo-de-thuong_104206622.jpg", "Công thức nấu canh",3));
        arrayList.add(new MenuFood("https://img2.thuthuatphanmem.vn/uploads/2018/11/30/anh-dai-dien-zalo-de-thuong_104206622.jpg", "Pha cafe",4));
        arrayList.add(new MenuFood("https://img2.thuthuatphanmem.vn/uploads/2018/11/30/anh-dai-dien-zalo-de-thuong_104206622.jpg", "Các món bún,mỳ",5));
        arrayList.add(new MenuFood("https://img2.thuthuatphanmem.vn/uploads/2018/11/30/anh-dai-dien-zalo-de-thuong_104206622.jpg", "Đồ nướng",6));
        listFoodAdappter.notifyDataSetChanged();



    }

    void ViewFlipper()
    {
        ArrayList<String> food = new ArrayList<>();
        food.add("https://img2.thuthuatphanmem.vn/uploads/2018/11/30/anh-dai-dien-zalo-de-thuong_104206622.jpg");
        food.add("data:image/jpeg;base64,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");
        food.add("https://img2.thuthuatphanmem.vn/uploads/2018/11/30/anh-dai-dien-zalo-de-thuong_104206622.jpg");
        for(int i=0 ;i<food.size();i++)
        {
            ImageView imageView = new ImageView(getApplicationContext());
            Picasso.get().load(food.get(i)).into(imageView);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            binding.viewFlipper.addView(imageView);

        }
        binding.viewFlipper.setFlipInterval(5000);
        binding.viewFlipper.setAutoStart(true);
        Animation animation_in = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_in_right);
        Animation animation_out = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_out_right);
        binding.viewFlipper.setInAnimation(animation_in);
        binding.viewFlipper.setOutAnimation(animation_out);



    }
}