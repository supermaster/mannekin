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
public class DressBean implements Serializable {
    private List<DressCategory> dressCategories;

    private Clothes selectedClothes;

    public DressBean() {
        this.dressCategories = new ArrayList<DressCategory>();

        List<Clothes> clothesList = new ArrayList<Clothes>();

        clothesList.add(new Clothes("blue_coat", "blue_coat"));
        clothesList.add(new Clothes("white_coat", "white_coat"));
        clothesList.add(new Clothes("yellow_coat", "yellow_coat"));
        dressCategories.add(new DressCategory("Jackets & Coats", clothesList));

        clothesList = new ArrayList<Clothes>();
        clothesList.add(new Clothes("TREND", "hat"));
        clothesList.add(new Clothes("L.O.G.G.", "hat"));
        clothesList.add(new Clothes("DIVIDED", "hat"));
        dressCategories.add(new DressCategory("Shirts", clothesList));

        clothesList = new ArrayList<Clothes>();
        clothesList.add(new Clothes("Jumper", "hat"));
        clothesList.add(new Clothes("Cardigan", "hat"));
        dressCategories.add(new DressCategory("Jumpers & Cardigans", clothesList));

        clothesList = new ArrayList<Clothes>();
        clothesList.add(new Clothes("Slim fit", "hat"));
        clothesList.add(new Clothes("Spooky", "hat"));
        clothesList.add(new Clothes("Skinny", "hat"));
        dressCategories.add(new DressCategory("Jeans", clothesList));
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
}
