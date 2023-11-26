package com.workintech.BurgerCompany.models;

import com.workintech.BurgerCompany.enums.BreadRollType;


public class HealthyBurger extends Hamburger {
    private Addition healthyAddition1;
    private Addition healthyAddition2;
    public HealthyBurger(String name, double price, BreadRollType breadRollType) {
        super(name, "Tofu", price, breadRollType);
    }

    public Addition getHealthyAddition1() {
        return healthyAddition1;
    }

    public Addition getHealthyAddition2() {
        return healthyAddition2;
    }

    public void addHealthyAddition(String name, double price){
        if( healthyAddition1 == null) {
            healthyAddition1 = new Addition(name, price);
        } else if( healthyAddition2 == null ) {
            healthyAddition2 = new Addition(name, price);
        }
    }

    @Override
    public void itemizeHamburger() {
        StringBuilder builder = new StringBuilder();

        if(getHealthyAddition1() != null) {
            builder.append("HealthyAddition1: " + getHealthyAddition1().getName() + "/n");
            setPrice(getPrice() + getHealthyAddition1().getPrice());
        }
        if(getHealthyAddition2() != null) {
            builder.append("HealthyAddition2: " + getHealthyAddition2().getName() + "/n");
            setPrice(getPrice() + getHealthyAddition1().getPrice());
        }
        super.itemizeHamburger();
    }
}
