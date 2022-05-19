package com.example.mantraprototipo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity1 extends AppCompatActivity {
    RecyclerView dataList;
    List<String> titles;
    List<Integer> images;
    Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        dataList = findViewById(R.id.dataList);

        titles = new ArrayList<>();
        images = new ArrayList<>();

        titles.add("Lic. Elia Paulina González");
        titles.add("Mtra. Elizabeth de la Cruz Ortega");
        titles.add("Lic. Edith Díaz Rivas");
        titles.add("Lic. Alfredo Mario Mejia Ramirez");
        titles.add("Ana Esperanza Madera Muñoz");
        titles.add("Lic. Priscilla Alejandra Madrigal Melgoza");
        titles.add("Lic. José Enrique Soltero Pérez");
        titles.add("Mtro. Alfonso Romero Alcántara");

        images.add(R.drawable.dcpaulina);
        images.add(R.drawable.dcelizabeth);
        images.add(R.drawable.dcedith);
        images.add(R.drawable.dcmario);
        images.add(R.drawable.dcana);
        images.add(R.drawable.dcprisicla);
        images.add(R.drawable.dcjose);
        images.add(R.drawable.dcalfonso);

        adapter = new Adapter(this,titles,images);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2,GridLayoutManager.VERTICAL,false);
        dataList.setLayoutManager(gridLayoutManager);
        dataList.setAdapter(adapter);













    }
}
