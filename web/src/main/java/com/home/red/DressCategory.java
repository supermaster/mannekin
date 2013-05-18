package com.home.red;


import java.util.List;

public class DressCategory {
    public DressCategory(String label, List<Clothes> clothesList) {
        this.label = label;
        this.clothesList = clothesList;
    }

    private String label;

    private List<Clothes> clothesList;





    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<Clothes> getClothesList() {
        return clothesList;
    }

    public void setClothesList(List<Clothes> clothesList) {
        this.clothesList = clothesList;
    }


}
