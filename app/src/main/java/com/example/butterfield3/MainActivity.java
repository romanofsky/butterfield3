package com.example.butterfield3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    ArrayList<ItemsModel>itemsModels = new ArrayList<>();

int[] itemsImages = {R.drawable.pizza, R.drawable.pasta, R.drawable.roll, R.drawable.burger};

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        RecyclerView recyclerView = findViewById(R.id.mRecyclerView);

        setUpItemsModels();

        Items_RecyclerViewAdapter adapter=new Items_RecyclerViewAdapter (context:this,itemsModels);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager (new LinearLayoutManager (context:this));

    }
        private void setUpItemsModels(){
        String[] items = getResources() .getStringArray(R.array.items );
        String[] prices = getResources() .getStringArray(R.array.prices );
        String[] descriptions = getResources() .getStringArray(R.array.descriptions );

        for (int i = 0; i<itemsModels.length; i++){
            itemsModels.add( new ItemsModel(items[i],prices[i],descriptions[i]) );
            {


            }