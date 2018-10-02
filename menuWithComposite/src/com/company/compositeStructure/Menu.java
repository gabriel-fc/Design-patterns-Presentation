package com.company.compositeStructure;

import java.util.ArrayList;

public class Menu extends MenuComponent {

    private ArrayList<MenuComponent> menuComponents;
    private String name;
    private String description;

    public Menu(String name, String description){
        this.menuComponents = new ArrayList<>();

        this.name = name;

        this.description = description;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public void addComponent(MenuComponent newComponent) {
        this.menuComponents.add(newComponent);
    }

    @Override
    public void removeComponent(MenuComponent component) {
        this.menuComponents.remove(component);
    }

    @Override
    public MenuComponent getMenuItem(String name) {
        for (int i = 0; i < this.menuComponents.size(); i++) {
            if (this.menuComponents.get(i).getName().compareTo(name) == 0){
                return this.menuComponents.get(i);
            }
        }
        System.out.println("there is no such item in the list!\n");
        return null;
    }

    @Override
    public String itemsList() {
        String list = this.toString();
        MenuComponent auxiliary;
        for (int i = 0; i < menuComponents.size(); i++) {
            auxiliary = menuComponents.get(i);
            list = list.concat("\n  ".concat(auxiliary.toString()));
        }
        return list;
    }

    @Override
    public String toString() {
        return this.name+ "(" + this.description + "):";

    }
}
