package com.example.demoapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class GridAdapter extends BaseAdapter {

    int fruitImg[];
    Context context;
    LayoutInflater inflater;

    GridAdapter(Context context,int[] fruitImg)
    {
        this.context=context;
        this.fruitImg=fruitImg;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return fruitImg.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view=inflater.inflate(R.layout.activity_grid_adapter_try2,null);
        ImageView imageView=(ImageView)view.findViewById(R.id.imageViewTry);
        imageView.setImageResource(fruitImg[i]);
        return view;

    }
}
