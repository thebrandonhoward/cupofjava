package com.thebrandonhoward.cupofjava.design.iterator;

public class Menu {

    public String getName() {
        return "Soul Food Menu";
    }

    public MenuItems getMenuItems() {
        return new MenuItems();
    }
}
