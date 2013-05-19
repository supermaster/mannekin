package com.home.red.pageBean;

import com.home.red.model.Clothes;
import com.home.red.model.DressCategory;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ManagedBean(name = "dressBean")
@SessionScoped
public class    DressBean implements Serializable {
    private List<DressCategory> dressCategories;

    private String[] sizes = {"S", "M", "L", "XL", "XXL"};

    private Clothes selectedClothes;

    public DressBean() {
        this.dressCategories = new ArrayList<DressCategory>();

        List<Clothes> clothesList = new ArrayList<Clothes>();
        clothesList.add(new Clothes("GreenShirt", "green_shirt", 150));
        clothesList.add(new Clothes("WhiteShirt", "white_shirt", 100));
        clothesList.add(new Clothes("RedShirt", "red_shirt", 80));
        dressCategories.add(new DressCategory("Shirts", clothesList));

        clothesList = new ArrayList<Clothes>();
        clothesList.add(new Clothes("BlueJeans", "blue_jeans", 50));
        clothesList.add(new Clothes("BlueSkirt", "blue_skirt",60));
        clothesList.add(new Clothes("PurpleJeans", "purple_jeans",70));
        dressCategories.add(new DressCategory("Jeans", clothesList));

        clothesList = new ArrayList<Clothes>();
        clothesList.add(new Clothes("BlueCoat", "blue_coat",200));
        clothesList.add(new Clothes("WhiteCoat", "white_coat",180));
        clothesList.add(new Clothes("YellowCoat", "yellow_coat",220));
        dressCategories.add(new DressCategory("Coats", clothesList));
    }


    public List<DressCategory> getDressCategories() {
        return dressCategories;
    }

    public void setDressCategories(List<DressCategory> dressCategories) {
        this.dressCategories = dressCategories;
    }

    public Clothes getSelectedClothes() {
        return selectedClothes;
    }

    public void setSelectedClothes(Clothes selectedClothes) {
        this.selectedClothes = selectedClothes;
    }

    public String[] getSizes() {
        return sizes;
    }
}
