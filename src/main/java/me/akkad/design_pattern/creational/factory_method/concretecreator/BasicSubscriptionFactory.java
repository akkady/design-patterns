package me.akkad.design_pattern.creational.factory_method.concretecreator;

import me.akkad.design_pattern.creational.factory_method.concreteproduct.BasicSubscription;
import me.akkad.design_pattern.creational.factory_method.creator.SubscriptionFactory;
import me.akkad.design_pattern.creational.factory_method.product.Subscription;

public class BasicSubscriptionFactory extends SubscriptionFactory {
    @Override
    public Subscription createSubscription() {
        return new BasicSubscription();
    }
}