package com.company;

import com.company.MenuClasses.Menu;
import com.company.MenuClasses.MenuItem;

public class Main {

    public static void main(String[] args) {
        Menu restaurantMenu = new Menu("Cardápio", "Este cardápio contém todos os itens disponíveis.");
        System.out.println(restaurantMenu.toString() + "\n\n");

        Menu drinkMenu = new Menu("Cardápio de Bebidas", "Aqui você encontra todas as bebidas da casa!");
        MenuItem coke = new MenuItem("Coca-cola", "Bebida gaseificada sabor cola.", true, false, false, false);
        drinkMenu.addItem(coke);
        System.out.println(drinkMenu.itemsList() + "\n\n");

        MenuItem orangeJuice = new MenuItem("Suco de laranja", "Suco da fruta.", true, true, false, false);
        drinkMenu.addItem(orangeJuice);
        System.out.println(drinkMenu.itemsList() + "\n\n");

        restaurantMenu.addMenu(drinkMenu);

        System.out.println(restaurantMenu.itemsList());




    }
}
