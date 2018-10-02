package com.company.compositeStructure;

public abstract class MenuComponent {

    //general
    @Override
    public String toString() {
        throw new UnsupportedOperationException();
    }

    public String getName(){
        throw new UnsupportedOperationException();
    }

    public String getDescription(){
        throw new UnsupportedOperationException();
    }

    // for menu itens only

    public boolean isAvailable(){
        throw new UnsupportedOperationException();
    }

    public boolean isVegetarian(){
        throw new UnsupportedOperationException();
    }

    public boolean containsGluten(){
        throw new UnsupportedOperationException();
    }

    public boolean containsLactose(){
        throw new UnsupportedOperationException();
    }

    //for menu only
    public void addComponent(MenuComponent newComponent){
        throw new UnsupportedOperationException();
    }

    public void removeComponent(MenuComponent component){
        throw new UnsupportedOperationException();
    }

    public MenuComponent getMenuItem(String name){
        throw new UnsupportedOperationException();
    }

    public String itemsList(){
        throw new UnsupportedOperationException();
    }
}
