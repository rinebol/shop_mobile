package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class Login extends AppCompatActivity {

    RecyclerView recycler, recycler2, recycler3;
    adapterOne AdapterOne;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        List<modelProduct> productList = new ArrayList<>();
        productList.add(new modelProduct (1,"phone","Супер телефон", "100 000 р"));
        productList.add(new modelProduct (1,"xiaomi_13_t","6.67\" Смартфон Xiaomi 13T 256 ГБ зеленый", "47 999 р"));
        productList.add(new modelProduct (1,"apple_iphone_11_64","Apple iPhone 11 64ГБ", "35 000 р"));
        productList.add(new modelProduct (1,"samsung_galaxy_s22_256"," Samsung Galaxy S22 256", "77 599 р"));
        productList.add(new modelProduct (1,"black_shark_5_pro","6.67\"Black Shark 5 Pro 256 ГБ черный", "64 000 р"));
        setProdRec(productList);

        List<modelProduct> productList2 = new ArrayList<>();
        productList2.add(new modelProduct (1,"phone","Супер телефон", "100 000 р"));
        productList2.add(new modelProduct (1,"xiaomi_13_t","6.67\" Смартфон Xiaomi 13T 256 ГБ зеленый", "47 999 р"));
        productList2.add(new modelProduct (1,"apple_iphone_11_64","Apple iPhone 11 64ГБ", "35 000 р"));
        productList2.add(new modelProduct (1,"samsung_galaxy_s22_256"," Samsung Galaxy S22 256", "77 599 р"));
        productList2.add(new modelProduct (1,"black_shark_5_pro","6.67\"Black Shark 5 Pro 256 ГБ черный", "64 000 р"));
        setProdRec2(productList2);

        List<modelProduct> productList3 = new ArrayList<>();
        productList3.add(new modelProduct (1,"phone","Супер телефон", "100 000 р"));
        productList3.add(new modelProduct (1,"xiaomi_13_t","6.67\" Смартфон Xiaomi 13T 256 ГБ зеленый", "47 999 р"));
        productList3.add(new modelProduct (1,"apple_iphone_11_64","Apple iPhone 11 64ГБ", "35 000 р"));
        productList3.add(new modelProduct (1,"samsung_galaxy_s22_256"," Samsung Galaxy S22 256", "77 599 р"));
        productList3.add(new modelProduct (1,"black_shark_5_pro","6.67\"Black Shark 5 Pro 256 ГБ черный", "64 000 р"));
        setProdRec3(productList3);
    }

    private void setProdRec3(List<modelProduct> productList3) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL,false);
        recycler3 = findViewById(R.id.recycler3);
        recycler3.setLayoutManager(layoutManager);

        AdapterOne = new adapterOne(this, productList3);
        recycler3.setAdapter(AdapterOne);
    }

    private void setProdRec2(List<modelProduct> productList2) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL,false);
        recycler2 = findViewById(R.id.recycler2);
        recycler2.setLayoutManager(layoutManager);

        AdapterOne = new adapterOne(this, productList2);
        recycler2.setAdapter(AdapterOne);
    }

    private void setProdRec(List<modelProduct> productList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL,false);
        recycler = findViewById(R.id.recycler);
        recycler.setLayoutManager(layoutManager);

        AdapterOne = new adapterOne(this, productList);
        recycler.setAdapter(AdapterOne);
    }




}

