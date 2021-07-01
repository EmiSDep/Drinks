package com.emisdep;

public class CupHolder {
    public int volume;
    public int quantity;

    public CupHolder(int volume, int quantity) {
        this.volume = volume;
        this.quantity = quantity;

    }

    public int dispenseCup() {
        quantity--;
        return this.volume;
    }

    public void refill(int amt){
        quantity = amt;
    }

}
