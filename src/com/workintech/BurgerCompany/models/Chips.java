package com.workintech.BurgerCompany.models;

import com.workintech.BurgerCompany.enums.ChipsType;

public class Chips {
    private ChipsType chipsType;

    public Chips(ChipsType chipsType) {
        this.chipsType = chipsType;
    }

    public ChipsType getChipsType() {
        return chipsType;
    }
}
