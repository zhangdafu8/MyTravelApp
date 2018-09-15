package com.example.qiaoxian.mymutaotravel.entity;

public class Menu {
    public int icon;
    public String menu;
    public String information;

    public Menu(int icon, String menu) {
        this.icon = icon;
        this.menu = menu;
    }

    public Menu(int icon, String menu, String information) {
        this.icon = icon;
        this.menu = menu;
        this.information = information;
    }
}
