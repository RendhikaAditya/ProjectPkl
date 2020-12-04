package com.example.projectpkl;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ViewAdapter viewAdapter;
    private ArrayList<phone> phones;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addContentView();

        recyclerView=findViewById(R.id.recycler);


        recyclerView.setLayoutManager(new GridLayoutManager(this, 1));
        viewAdapter = new ViewAdapter(phones);
        recyclerView.setAdapter(viewAdapter);


    }

    private void addContentView() {
        phones = new ArrayList<>();
        phones.add(new phone("Samsung S10", "Samsung", "3400Mah","Exynos 9860","6Gb","124Gb","6.1 inc","16mp",R.drawable.samsungs10));
        phones.add(new phone("Samsung note 10", "Samsung", "4000Mah","Exynos 9860","8Gb","256Gb","6.8 inc","12mp",R.drawable.samsungnote10));
        phones.add(new phone("iPhone 11 Pro Max", "iPhone", "3969Mah","Bionic A13","4Gb","64Gb","6.5 inc","12mp",R.drawable.iphone11promax));
        phones.add(new phone("iPhone Xs", "iPhone", "2658Mah","Bionic A12","4Gb","64Gb","5,8 inc","12mp",R.drawable.iphonexs));
        phones.add(new phone("Huawei Nova 5i pro", "Huawei", "4000Mah","Kirin 810","8Gb","124Gb","6.26 inc","48mp",R.drawable.nova5ipro));
        phones.add(new phone("OnePlus 7t", "OnePlus", "4048Mah","Snapdragon 855+","8Gb","124Gb","6.67 inc","48mp",R.drawable.oneplus7t));
        phones.add(new phone("Oppo Reno 2Z", "Oppo", "4000Mah","Helio P90","8Gb","256Gb","6.53 inc","48mp",R.drawable.opporenoz2));
        phones.add(new phone("Pixel 3 XL", "Pixel", "3700","Snapdrogon 855","6Gb","124Gb","6.3 inc","16mp",R.drawable.pixel4));
        phones.add(new phone("Asus Zenfone 6 ZS630KL", "Asus", "5000Mah","Snapdrogon 855","8Gb","124Gb","6.4 inc","48mp",R.drawable.zhenfone5));
        phones.add(new phone("Xiaomi mi CC9 pro", "Xiaomi", "5260Mah","Snapdrogon 855","8Gb","124Gb","6.42 inc","108mp",R.drawable.xiaomicc9));
    }

    public void about(View view) {
        Intent intent2 = new Intent(MainActivity.this, About.class);
        startActivity(intent2);
   }
}
