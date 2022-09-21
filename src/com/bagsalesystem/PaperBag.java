package com.bagsalesystem;

public class PaperBag extends Bag {
    @Override
    public double getPrice() {
        double area = getLength() * getWidth();
        if(area > 300.0){
            price = 250.0;
        } else {
            price = 150.0;
        }
        return price;
    }
}
