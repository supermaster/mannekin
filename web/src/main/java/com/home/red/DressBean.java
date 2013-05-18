package com.home.red;

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

        clothesList.add(new Clothes("Кепка", "hat"));
        clothesList.add(new Clothes("Шапка", "hat"));
        clothesList.add(new Clothes("Шлем", "hat"));
        dressCategories.add(new DressCategory("Головные уборы", clothesList));

        clothesList = new ArrayList<Clothes>();
        clothesList.add(new Clothes("Майка", "hat"));
        clothesList.add(new Clothes("Кофта", "hat"));
        clothesList.add(new Clothes("пиджак", "hat"));
        dressCategories.add(new DressCategory("Верхняя одежда", clothesList));

        clothesList = new ArrayList<Clothes>();
        clothesList.add(new Clothes("Трусы", "hat"));
        clothesList.add(new Clothes("Носки", "hat"));
        dressCategories.add(new DressCategory("Нижнее белье", clothesList));

        clothesList = new ArrayList<Clothes>();
        clothesList.add(new Clothes("Тапки", "hat"));
        clothesList.add(new Clothes("Валенки", "hat"));
        clothesList.add(new Clothes("Лыжи", "hat"));
        dressCategories.add(new DressCategory("Обувь", clothesList));
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
