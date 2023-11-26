package com.workintech.BurgerCompany.models;

import com.workintech.BurgerCompany.enums.BreadRollType;

public class DeluxeBurger extends Hamburger {
    private Drink drink;
    private Chips chips;
    public DeluxeBurger(Drink drink, Chips chips) {
        super("Deluxe Burger", "DOUBLE", 19.10, BreadRollType.DOUBLE_BURGER);
        this.drink = drink;
        this.chips = chips;
    }


    @Override
    public void add(String name, double price) {
        System.out.println("/nDeluxe Burger icin yeni malzeme eklenemez.");
    }

    @Override
    public void itemizeHamburger() {
        StringBuilder builder = new StringBuilder();
        builder.append("DRINK: " + drink.getDrinkType() + "/n");
        builder.append("CHIPS: " + chips.getChipsType() + "/n");
        System.out.println(builder + "/n");
        super.itemizeHamburger();
    }
}
