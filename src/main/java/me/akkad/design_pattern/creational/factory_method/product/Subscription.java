package me.akkad.design_pattern.creational.factory_method.product;

// Subscription interface (The Product)
public interface Subscription {
    void subscribe();

    String getType();
    double getPrice();
}