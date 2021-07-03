package com.emisdep;

public class Syrup{
    public String drinkName;
    public int liquidAmount;


    public Syrup(String drinkName, int liquidAmount) {
        this.liquidAmount = liquidAmount;
        this.drinkName = drinkName;

    }

    public String dispense(int amt){
        liquidAmount -= amt;
        return drinkName;
    }

    public int getVolume() {
        return liquidAmount;
    }

}
