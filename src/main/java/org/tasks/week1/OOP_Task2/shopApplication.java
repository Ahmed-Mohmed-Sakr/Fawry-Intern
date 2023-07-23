package org.tasks.week1.OOP_Task2;

public class shopApplication {
    public static void main(String[] args) {
        try {
            /*--------- Products ---------*/
            Product T_shirt = new Product("T-shirt", 100.7);
            Product pants = new Product("pants", 89.5);
            Product cap = new Product("cap", 48.3);
            Product ships = new Product("ships", 10.2);
            Product book = new Product("book", 130.9);
            /*----------- my cart products --------*/
            ShoppingCart cart = new ShoppingCart();
            cart.addProduct(T_shirt);
            cart.addProduct(T_shirt);
            cart.addProduct(pants);
            cart.addProduct(cap);
            cart.addProduct(ships);
            cart.addProduct(ships);
            cart.addProduct(ships);
                /*------- remove product rom card ----*/
            cart.removeProduct(ships);

            /*------ place order -----------*/
            OrderProcessor order = new OrderProcessor();
            order.placeOrder(cart);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
