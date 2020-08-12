package com.example.recyclerview13072020;

public class Food {
    private int image;
    private String name;
    private String describe;
    private int price;

    public Food(int image, String name, String describe, int price) {
        this.image = image;
        this.name = name;
        this.describe = describe;
        this.price = price;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
