package com.example.administrator.listview;

/**
 * Created by Administrator on 2019/11/1.
 */

public class  Fruit {
    private String title;
    private String goods;
    private String price;
    private String num;
    private int imageId;

    public Fruit(String title, String goods, String price, String num, int imageId){
        this.title = title;
        this.goods = goods;
        this.price = price;
        this.num = num;
        this.imageId = imageId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGoods() {
        return goods;
    }

    public void setGoods(String goods) {
        this.goods = goods;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
