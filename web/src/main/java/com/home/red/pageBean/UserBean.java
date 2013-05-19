package com.home.red.pageBean;

import com.home.red.model.Clothes;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@ManagedBean(name = "user")
@SessionScoped
public class UserBean implements Serializable {
    /**
     * Constants
     */
    public static final String[] purchaseNames = {"Green shirt", "Blue skirt", "White coat", "Green shirt", "Blue skirt", "White coat", "Green shirt", "Blue skirt", "White coat"};
    public static final int[] purchasePrices = {100, 200, 100, 100, 200, 100, 100, 200, 100};
    public static final String[] purchaseSizes = {"S", "XS", "S", "S", "XS", "S", "S", "XS", "S"};

    private int sum;
    private int iter;
    private List<Clothes> purchases = new ArrayList<Clothes>();
    private int height = 100;

    private int siski = 50;

    private int puzo = 30;

    private int zhopa = 50;

    private int selectedBrendIndex;

    private int gender = 1;

    private List<String> result = new ArrayList<String>();

    private int totalPrise;


    //    ---------------------------------


    public int getTotalPrise() {
        return totalPrise;
    }

    public void setTotalPrise(int totalPrise) {
        this.totalPrise = totalPrise;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getSiski() {
        return siski;
    }

    public void setSiski(int siski) {
        this.siski = siski;
    }

    public int getPuzo() {
        return puzo;
    }

    public void setPuzo(int puzo) {
        this.puzo = puzo;
    }

    public int getZhopa() {
        return zhopa;
    }

    public List<Clothes> getPurchases() {
        return purchases;
    }

    public void setPurchases(List<Clothes> purchases) {
        this.purchases = purchases;
    }

    public void setZhopa(int zhopa) {
        this.zhopa = zhopa;
    }

    public int getSelectedBrendIndex() {
        return selectedBrendIndex;
    }

    public void setSelectedBrendIndex(int selectedBrendIndex) {
        this.selectedBrendIndex = selectedBrendIndex;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

//    public String getResult() {
//        switch (iter){
//            case 1: {
//                totalPrise = 150;
//                return "Green Shirt ($150) \n Total $150" ;
//            }
//            case 2:{
//                totalPrise=100;
//                return "Green Shirt ($100) \n Total $100";
//            }
//            case 3:{
//                totalPrise = 80;
//                return "Red Shirt ($80) \n Total $80";
//            }
//        }
//
//
//        return "";
//    }


    public List<String> getResult() {
        result.clear();
        switch (iter){
            case 1:{
                result.add("Green Shirt ($100)");
                totalPrise = 150;
                break;
            }
            case 2:{
                result.add("White Shirt ($100)");
                totalPrise = 100;
                break;
            }
            case 3:{
                result.add("Red Shirt ($80)");
                totalPrise = 80;
                break;
            }
            case 4:{
                result.add("Red Shirt ($80)");
                result.add("Blue Jeans ($50)");
                totalPrise = 130;
                break;
            }
            case 5:{
                result.add("Red Shirt ($80)");
                result.add("Blue Skirt ($60)");
                totalPrise = 140;
                break;

            }
            case 6:{
                result.add("Red Shirt ($80)");
                result.add("Blue Skirt ($60)");
                result.add("Blue Coat ($200)");
                totalPrise = 340;
                break;

            }
            case 7:{
                result.add("Red Shirt ($80)");
                result.add("Blue Skirt ($60)");
                result.add("White Coat ($220)");
                totalPrise = 360;
                break;

            }

            case 8:{
                result.add("Red Shirt ($80)");
                result.add("Purple Jeans ($70)");
                result.add("White Coat ($220)");
                totalPrise = 370;
                break;

            }

        }







        return result;
    }

    public void setResult(List<String> result) {
        this.result = result;
    }

    public void userAdd(String x) {
        try {
            iter++;
        } catch (Exception ex) {
            FacesContext.getCurrentInstance().addMessage("totals", new FacesMessage(FacesMessage.SEVERITY_INFO, "Warning", "You've exceeded your limit"));
        }

    }

    public String getShirtSize() {
        if (siski < 60) {
            return "S";
        } else if (siski < 90) {
            return "M";
        } else if (siski < 120) {
            return "L";
        } else if (siski < 150) {
            return "XL";
        }
        return "XXL";

    }

    public String getJeansSize() {
        if (zhopa < 60) {
            return "S";
        } else if (zhopa < 90) {
            return "M";
        } else if (zhopa < 120) {
            return "L";
        } else if (zhopa < 150) {
            return "XL";
        }
        return "XXL";

    }
    

    public int getPurchasesTotal() {
        return sum;
    }
}
