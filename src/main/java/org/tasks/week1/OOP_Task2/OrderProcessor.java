package org.tasks.week1.OOP_Task2;

import java.util.Map;

public class OrderProcessor {

    public void placeOrder (ShoppingCart cart)
    {
        System.out.println("Ordered Products:");
        for (Map.Entry<Product, Integer> product : cart.getOrderedItems().entrySet())
        {
            double productPrice = product.getKey().getProductPrice();
            String productName = product.getKey().getProductName();
            int amount = product.getValue();
            System.out.println(
                    productName + " - X - " + amount + ": $" + (productPrice * amount)
            );
        }
        System.out.println("--------------------------------");
        System.out.println("Total price: $" + cart.getProductsTotalCost());
    }
}
