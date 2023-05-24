package me.akkad.design_pattern.creational.factory_method.concreteproduct;

import me.akkad.design_pattern.creational.factory_method.product.Subscription;

public class FamilySubscription implements Subscription {

    public void subscribe() {
        System.out.println("You are subscribed to the stream");
        System.out.println("Your subscription is : "+getType());
    }

    public String getType() {
        return "Family";
    }


    public double getPrice() {
        return 24.99;
    }
}