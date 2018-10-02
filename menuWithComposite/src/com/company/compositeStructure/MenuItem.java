package com.company.compositeStructure;

import com.company.compositeStructure.MenuComponent;

public class MenuItem extends MenuComponent {

    private String name;
    private String description;
    private boolean isAvailable, isVegetarian, containsGluten, containsLactose;

    public MenuItem(String name, String description, boolean isAvailable, boolean isVegetarian, boolean containsGluten, boolean containsLactose){
        this.name = name;
        this.description = description;

        this.isAvailable = isAvailable;
        this.isVegetarian = isVegetarian;
        this.containsGluten = containsGluten;
        this.containsLactose = containsLactose;
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
    public boolean isAvailable() {
        return isAvailable;
    }

    @Override
    public boolean isVegetarian() {
        return isVegetarian;
    }

    @Override
    public boolean containsGluten() {
        return containsGluten;
    }

    @Override
    public boolean containsLactose() {
        return containsLactose;
    }

    @Override
    public String toString() {
        return this.name+ "(" + this.description + "):";

    }
}
