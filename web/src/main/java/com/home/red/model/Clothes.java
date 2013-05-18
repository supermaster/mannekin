package com.home.red.model;

public class Clothes {
    public Clothes(String label, String image) {
        this.label = label;
        this.image = image;
    }

    private String label;
    private String image;


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
}
