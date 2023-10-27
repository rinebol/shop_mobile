package com.example.myapplication;

public class modelProduct {
    int id;
    String img, title, cost;

    public modelProduct(int id, String img, String title, String cost) {
        this.id = id;
        this.img = img;
        this.title = title;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public String getImg() {
        return img;
    }

    public String getTitle() {
        return title;
    }

    public String getCost() {
        return cost;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }
}
