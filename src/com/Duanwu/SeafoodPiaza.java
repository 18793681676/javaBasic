package com.Duanwu;

public class SeafoodPiaza {


    private String category;//种类

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public SeafoodPiaza() {
        super();
    }

    public SeafoodPiaza(String name, int price, int size, String category) {
        /* super(name,price,size);*/
        this.category = category;
    }


    /*public String show() {
        *//* return "名称:"+super.getname+"\n价格:"+super.getPrice()+"元"+"\n大小:"+super.getSize()+"寸"+"\n配料:"+category;*//*
    }*/
}



