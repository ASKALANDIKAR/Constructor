
//Define a Product class with attributes: productId, productName, price, stock.
//   Implement methods for purchaseProduct (reduce stock), addStock, and displayProductDetails.
//   Ensure stock does not go negative.
//   Create a Main class to demonstrate the working.

package com.Practice;


public class Product{
   int productId;
   String productName;
   double  total , price;
   int stock;



    public Product(int productId, String productName, double price, int stock) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.stock = stock;
    }


    public void purchaseProduct(int amount)
    {
        if(amount<=stock){
            stock=stock-amount;
            System.out.println(amount+" Unit Purchased");
            total= price*amount;
        }
        else {
            System.out.println("Insufficient Resources \n" +stock +" Units remained ");
        }
    }

    public void addStock(int amount)
    {
        if(amount>=0){
            stock=stock+amount;
            System.out.println(amount+" Units are added in Stocks \n Current Stock: "+ stock);

        }

        else {
            System.out.println("Invalid Amount to Add ");
        }

    }

    public void displayProductDetails()
    {
        System.out.println("\n\nProduct ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: ₹" + price);
        System.out.println("Available Stock: " + stock);
        System.out.println("Total Amount: "+ total );
    }
}






















