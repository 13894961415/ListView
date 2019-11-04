package com.example.administrator.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 2019/11/1.
 */

public class FruitAdapter extends BaseAdapter{
    private Context context;
    private List<Fruit> fruitList;

    public FruitAdapter(Context context,List<Fruit> models) {
        this.context = context;
        this.fruitList = models;
    }

    @Override
    public int getCount() {
        return this.fruitList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       Fruit fruit = fruitList.get(position);
       View view = LayoutInflater.from(context).inflate(R.layout.listview_item,parent,false);
        ImageView img=(ImageView)view.findViewById(R.id.img);
        TextView title = (TextView)view.findViewById(R.id.title);
        TextView goods= (TextView)view.findViewById(R.id.goods);
        TextView price = (TextView)view.findViewById(R.id.price);
        TextView num = (TextView)view.findViewById(R.id.num);
        img.setImageResource(fruit.getImageId());
        title.setText(fruit.getTitle());
        goods.setText(fruit.getGoods());
        price.setText(fruit.getPrice());
        num.setText(fruit.getNum());
        return view;
    }
}
