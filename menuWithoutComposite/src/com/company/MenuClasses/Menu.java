package com.company.MenuClasses;

import java.util.ArrayList;

public class Menu {

    private ArrayList<Menu> menus;
    private ArrayList<MenuItem> menuItems;
    private String name;
    private String description;

    public Menu(String name, String description){
        this.menus = new ArrayList<>();
        this.menuItems = new ArrayList<>();
        this.name = name;

        this.description = description;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public void addMenu(Menu newMenu) {
        this.menus.add(newMenu);
    }

    public void addItem(MenuItem newItem){
        this.menuItems.add(newItem);
    }

    public void removeMenu(Menu menu) {
        this.menus.remove(menu);
    }

    public void removeItem(MenuItem item){
        this.menuItems.remove(item);
    }

    public Menu getMenuItem(String name) {
        for (int i = 0; i < this.menus.size(); i++) {
            if (this.menus.get(i).getName().compareTo(name) == 0){
                return this.menus.get(i);
            }
        }
        System.out.println("there is no such item in the list!\n");
        return null;
    }

    public MenuItem getItem(String name) {
        for (int i = 0; i < this.menuItems.size(); i++) {
            if (this.menuItems.get(i).getName().compareTo(name) == 0){
                return this.menuItems.get(i);
            }
        }
        System.out.println("there is no such item in the list!\n");
        return null;
    }

    public String itemsList() {
        String list = this.toString();
        Menu auxiliary;
        MenuItem auxiliary2;
        for (int i = 0; i < menus.size(); i++) {
            auxiliary = menus.get(i);
            list = list.concat("\n  ".concat(auxiliary.toString()));
        }
        for (int i = 0; i < menuItems.size(); i++) {
            auxiliary2 = menuItems.get(i);
            list = list.concat("\n  ".concat(auxiliary2.toString()));
        }
        return list;
    }

    @Override
     public String toString() {
        return this.name+ "(" + this.description + "):";

    }
}
