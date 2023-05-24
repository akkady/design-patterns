package me.akkad.design_pattern.creational.factory_method.concreteproduct;

import me.akkad.design_pattern.creational.factory_method.product.Subscription;

public class PremiumSubscription implements Subscription {

    public void subscribe() {
        System.out.println("You are subscribed to the stream");
        System.out.println("Your subscription is : "+getType());
    }

    public String getType() {
        return "Premium";
    }

    public double getPrice() {
        return 14.99;
    }
}