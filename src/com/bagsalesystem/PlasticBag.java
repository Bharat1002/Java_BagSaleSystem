package com.bagsalesystem;

public class PlasticBag extends Bag {
    private double tax;
    private void setTax(double tax){
        this.tax = tax;
    }
    public double getTax(){
        return tax;
    }
    @Override
    public double getPrice() {
        double area = getLength() * getWidth();
        if(area > 800){
            return -1;
        } else if(area > 250){
            tax = 100;
            price = 300.0;
        } else {
            tax = 50;
            price = 200.0;
        }
        return price + tax;
    }
}
