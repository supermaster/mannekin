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


    //    ---------------------------------
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

    public void userAdd(String x) {
        System.out.println("x = " + x);
        try {
            purchases.add(new Clothes(purchaseNames[iter], "", purchasePrices[iter], purchaseSizes[iter]));
            sum += purchasePrices[iter];
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
