package org.tasks.week1.OOP_Task2;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private final Map<Product, Integer> orderedItems = new HashMap<>();

    public void addProduct(Product product)
    {
        if(orderedItems.containsKey(product))
            orderedItems.put(product, orderedItems.get(product)+1);
        else
            orderedItems.put(product, 1);
    }

    public void  removeProduct(Product product) throws Exception
    {
        if(orderedItems.containsKey(product))
        {
            orderedItems.put(product, orderedItems.get(product) - 1);
            if (orderedItems.get(product) <= 0)
                orderedItems.remove(product);
        }
        else
        {
            throw new Exception ("can't remove product it's not exist already");
        }
    }

    public double getProductsTotalCost ()
    {
        double totalCost = 0;
        for (Map.Entry<Product, Integer> product : orderedItems.entrySet())
        {
            double productPrice = product.getKey().getProductPrice();
            int amount = product.getValue();
            totalCost += (productPrice * amount);
        }

        return totalCost;
    }

    public Map<Product, Integer> getOrderedItems() {
        return orderedItems;
    }


}
