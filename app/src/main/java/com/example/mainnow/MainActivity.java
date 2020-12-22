package com.example.mainnow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    ArrayList<MonAnGrid> arrayList;
    MonAnGridAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView=(GridView) findViewById(R.id.gv);
        arrayList=new ArrayList<>();
        arrayList.add(new MonAnGrid("FreeShip","Trà Sữa R_B","85 Lê Duẩn",R.drawable.rb));
        arrayList.add(new MonAnGrid("Xem thêm","Trà Sữa GongCha","18 Lê Duẩn",R.drawable.ts));
        arrayList.add(new MonAnGrid("Món ăn yêu thích","Trà Sữa R_B","85 Lê Duẩn",R.drawable.rb));
        arrayList.add(new MonAnGrid("Xem thêm","Trà Sữa R_B","85 Lê Duẩn",R.drawable.rb));
        arrayList.add(new MonAnGrid("Ăn gì hôm nay?","Trà Sữa R_B","85 Lê Duẩn",R.drawable.rb));
        arrayList.add(new MonAnGrid("Xem thêm","Trà Sữa R_B","85 Lê Duẩn",R.drawable.rb));
        arrayList.add(new MonAnGrid("FreeShip","Trà Sữa R_B","85 Lê Duẩn",R.drawable.rb));
        arrayList.add(new MonAnGrid("FreeShip","Trà Sữa R_B","85 Lê Duẩn",R.drawable.rb));
        arrayList.add(new MonAnGrid("FreeShip","Trà Sữa R_B","85 Lê Duẩn",R.drawable.rb));
        arrayList.add(new MonAnGrid("FreeShip","Trà Sữa R_B","85 Lê Duẩn",R.drawable.rb));

        adapter= new MonAnGridAdapter(this,R.layout.gridview,arrayList);
        gridView.setAdapter(adapter);

    }
}