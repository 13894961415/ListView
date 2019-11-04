package com.example.administrator.listview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
private List<Fruit> fruitList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initdata();
        FruitAdapter adapter = new FruitAdapter(MainActivity.this,fruitList);
        ListView Name = (ListView)findViewById(R.id.lv);
        Name.setAdapter(adapter);
    }

    private void initdata() {
        for (int i=0;i<10;i++){
            Fruit apple= new Fruit("商品标题商品标题商品标题商品标题"+i,"颜色：红色 尺码","￥999","X1", R.drawable.ic_launcher_background);
            fruitList.add(apple);
        }
    }
}
