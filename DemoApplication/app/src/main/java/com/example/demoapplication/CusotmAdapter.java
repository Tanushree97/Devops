package com.example.demoapplication;

import android.content.Context;
import android.provider.DocumentsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.zip.Inflater;

public class CusotmAdapter extends BaseAdapter {

    Context context;
    String[] fruitName;
    int fruitImg[];
    LayoutInflater inflater;

    CusotmAdapter(Context context,String fruitName[],int fruitImg[])
    {
        this.fruitImg=fruitImg;
        this.context=context;
        this.fruitName=fruitName;
        inflater=LayoutInflater.from(context);
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
    public View getView(int i, View view, ViewGroup viewGroup)
    {
        view=inflater.inflate(R.layout.activity_custom_list_view2,null);
        TextView textView=(TextView)view.findViewById(R.id.FruitTextView);
        ImageView imageView=(ImageView)view.findViewById(R.id.FruitImageView1);
        ImageView imageView2=(ImageView)view.findViewById(R.id.FruitImageView2);
        textView.setText(fruitName[i]);
        imageView.setImageResource(fruitImg[i]);
        imageView2.setImageResource(fruitImg[i]);
        return view;
    }
}
