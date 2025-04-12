package com.Practice;

public class ProductInfo {
    public static void main(String[] args) {
       Product p1 = new Product(101, "Laptop's", 60000, 55);

       p1.addStock(50);
       p1.purchaseProduct(12);
        p1.displayProductDetails();

    }
}
