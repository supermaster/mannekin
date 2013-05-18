package com.home.red.model;

import java.util.List;

public class Clothes {
    public Clothes(String label, String image) {
        this.label = label;
        this.image = image;
    }

    private String label;
    private String image;
    private int price;
    private String size;


    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
