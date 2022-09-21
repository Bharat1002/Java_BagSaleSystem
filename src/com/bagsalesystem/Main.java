package com.bagsalesystem;

import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("Select A bag Type : ");
            System.out.println("1. Paper Bag");
            System.out.println("2. Plastic Bag");

            System.out.print("Type 1 or 2 and press enter : ");
            String option = br.readLine();
            if(option.equals("1")){

                PaperBag paperBag = new PaperBag();

                System.out.print("Enter length of Bag : ");
                String inputLength = br.readLine();

                try {
                    double length = Double.parseDouble(inputLength);
                    paperBag.setLength(length);
                } catch (NumberFormatException e){
                    System.out.println("Invalid Length! try again");
                    continue;
                }

                System.out.print("Enter width of Bag : ");
                String inputWidth = br.readLine();
                try {
                    double width = Double.parseDouble(inputWidth);
                    paperBag.setWidth(width);
                } catch (NumberFormatException e){
                    System.out.println("Invalid Width! try again");
                    continue;
                }


                double price = paperBag.getPrice();
                if(price == -1.0){
                    System.out.println("No bag available of this size");
                } else {
                    System.out.println("Price of Bag With Length : " + paperBag.getLength() +
                            " and Width : " + paperBag.getWidth() + " is " + price + " Rs.");
                }

                break;
            } else if(option.equals("2")){

                PlasticBag plasticBag = new PlasticBag();

                System.out.print("Enter length of Bag : ");
                String inputLength = br.readLine();

                try {
                    double length = Double.parseDouble(inputLength);
                    plasticBag.setLength(length);
                } catch (NumberFormatException e){
                    System.out.println("Invalid Length! try again");
                    continue;
                }

                System.out.print("Enter width of Bag : ");
                String inputWidth = br.readLine();
                try {
                    double width = Double.parseDouble(inputWidth);
                    plasticBag.setWidth(width);
                } catch (NumberFormatException e){
                    System.out.println("Invalid Width! try again");
                    continue;
                }


                double price = plasticBag.getPrice();
                if(price == -1.0){
                    System.out.println("No bag available of this size");
                } else {
                    System.out.println("Price of Bag With Length : " + plasticBag.getLength() +
                            " and Width : " + plasticBag.getWidth() + " is " + price + " Rs.");
                }

                break;
            } else {
                System.out.println("Invalid input, Please try again");
            }
        }


    }
}
