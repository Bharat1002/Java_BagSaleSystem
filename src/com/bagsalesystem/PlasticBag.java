package com.bagsalesystem;

public class PlasticBag extends Bag {
    private double tax;
    public void setTax(double tax){
        this.tax = tax;
    }
    public double getTax(){
        return tax;
    }
    @Override
    public double getPrice() {
        double area = getLength() * getWidth();
        if(area > 250){
            price = 300.0;
        } else {
            price = 200.0;
        }
        return price + tax;
    }
}
