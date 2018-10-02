package com.company.MenuClasses;

public class MenuItem {

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

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public boolean containsGluten() {
        return containsGluten;
    }

    public boolean containsLactose() {
        return containsLactose;
    }

    public String toString() {
        return this.name+ "(" + this.description + "):";

    }
}
