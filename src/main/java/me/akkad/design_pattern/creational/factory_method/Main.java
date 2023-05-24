package me.akkad.design_pattern.creational.factory_method;

import me.akkad.design_pattern.creational.factory_method.concretecreator.BasicSubscriptionFactory;
import me.akkad.design_pattern.creational.factory_method.concretecreator.FamilySubscriptionFactory;
import me.akkad.design_pattern.creational.factory_method.concretecreator.PremiumSubscriptionFactory;
import me.akkad.design_pattern.creational.factory_method.creator.SubscriptionFactory;
import me.akkad.design_pattern.creational.factory_method.product.Subscription;

public class Main {
    public static void main(String[] args) {
        // Basic subscription
        SubscriptionFactory basicSubscriptionFactory = new BasicSubscriptionFactory();
        Subscription basicSubscription = basicSubscriptionFactory.createSubscription();
        basicSubscription.subscribe();

        // Premium subscription
        SubscriptionFactory premiumSubscriptionFactory = new PremiumSubscriptionFactory();
        Subscription premiumSubscription = premiumSubscriptionFactory.createSubscription();
        premiumSubscription.subscribe();

        // Family subscription
        SubscriptionFactory familySubscriptionFactory = new FamilySubscriptionFactory();
        Subscription familySubscription = familySubscriptionFactory.createSubscription();
        familySubscription.subscribe();

        // To introduce a new type of subscription, you simply need to create a class that implements the `Subscription`
        // and a concrete factory class that extends the abstract `SubscriptionFactory`.
        // The advantage of this approach is that you can add new functionality without modifying the existing codebase,
        // ensuring that the existing code remains untouched
        // Happy codding :)
    }
}
