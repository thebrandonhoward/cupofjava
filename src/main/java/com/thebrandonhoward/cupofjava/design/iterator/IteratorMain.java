package com.thebrandonhoward.cupofjava.design.iterator;

public class IteratorMain {
    public static void main(String... args) {
        Menu menu = new Menu();

        System.out.println(menu.getName() + " has:");

        MenuItems menuItems = menu.getMenuItems();

        while(menuItems.hasNext()) {
            System.out.println(menuItems.next());
        }

    }
}
