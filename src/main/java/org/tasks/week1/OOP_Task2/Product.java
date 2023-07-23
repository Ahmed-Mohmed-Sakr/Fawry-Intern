package org.tasks.week1.OOP_Task2;

public class Product {
    private String productName;
    private double productPrice;

    public Product(String productName, double productPrice) throws Exception
    {
        this.productName = productName;
        if(productPrice < 0 || productPrice >= Double.MAX_VALUE)
            throw new Exception("that price is not valid");
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }
}
