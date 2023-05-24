package me.akkad.design_pattern.creational.factory_method.creator;

import me.akkad.design_pattern.creational.factory_method.product.Subscription;

// SubscriptionFactory (Creator)
public abstract class SubscriptionFactory {
    // Factory method
    public abstract Subscription createSubscription();

    // Other methods related to the factory
    // ...
}