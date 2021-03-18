package com.example.demoapplication;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.GridView;

public class GridAdapterTry extends AppCompatActivity {

    int fruitImg[]={R.drawable.apple,R.drawable.strawberry,R.drawable.watermelon,R.drawable.walnut,R.drawable.banana};
    GridView gridView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_adapter_try);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        gridView2=(GridView)findViewById(R.id.fruitImageViewTry);
        GridAdapter gridAdapter=new GridAdapter(getApplicationContext(),fruitImg);
        gridView2.setAdapter(gridAdapter);
    }

}
