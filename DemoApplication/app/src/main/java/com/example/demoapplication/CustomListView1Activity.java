package com.example.demoapplication;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.ListView;

public class CustomListView1Activity extends AppCompatActivity {

    String[] fruitName={"Apple","Pineapple","Banana","Pear","Blackberry","Kiwi","Orange","Strawberry","Walnut","Watermelon"};
    int[] fruitImg={R.drawable.apple,R.drawable.pineapple,R.drawable.banana,R.drawable.pear,R.drawable.blackberry,R.drawable.kiwi,R.drawable.orange,R.drawable.strawberry,R.drawable.walnut,R.drawable.watermelon};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view1);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        listView=(ListView)findViewById(R.id.fruitListView);
        CusotmAdapter cusotmAdapter =new CusotmAdapter(getApplicationContext(),fruitName,fruitImg);
        listView.setAdapter(cusotmAdapter);

    }

}
