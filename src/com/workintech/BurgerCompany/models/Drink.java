package com.workintech.BurgerCompany.models;

import com.workintech.BurgerCompany.enums.DrinkType;

public class Drink {
    private DrinkType drinkType;

    public Drink(DrinkType type) {
        this.drinkType = type;
    }

    public DrinkType getDrinkType() {
        return drinkType;
    }
}
