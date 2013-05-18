package com.home.red.pageBean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.List;


@ManagedBean(name = "user")
@SessionScoped
public class UserBean implements Serializable {



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

    public void setZhopa(int zhopa) {
        this.zhopa = zhopa;
    }
}
