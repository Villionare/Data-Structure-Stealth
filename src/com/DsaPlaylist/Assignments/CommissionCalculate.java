package com.DsaPlaylist.Assignments;

public class CommissionCalculate {
    public static void main(String[] args) {
        //A shopkeeper sells a product for ₹8,000. His cost price for the product was ₹6,500.
        //Write a Java program to calculate the commission percentage he earned on the sale.

        int final_price = 8000;
        int actual_price = 6500;

        //commission = selling price - cost price;
        //percentage = (1500/8000)*100

        int commission = (final_price - actual_price)*100/final_price;
        System.out.println(commission);
    }
}
