# Factory Method Pattern

<!-- TOC -->
* [I. Definition](#i-definition)
* [II. UML](#ii-uml)
* [III. When to use](#iii-when-to-use)
* [IV. Exercise](#iv-exercise)
<!-- TOC -->

## I. Definition

The Factory Method design pattern is a creational pattern that provides an interface for creating objects but allows
subclasses to decide which class to instantiate. It encapsulates the object creation logic within a method, known as 
the factory method, which is responsible for creating instances of a particular class or its subclasses. This pattern
promotes loose coupling between the creator (the class with the factory method) and the products
(the objects being created).

Here's a simplified explanation of how the Factory Method design pattern works:

- **Product** : This represents the common interface or abstract class that defines the objects the factory method will 
create.


- **Concrete Products** : These are the specific implementations of the product interface or abstract class.


- **Creator**: The creator class contains the factory method, which returns an instance of the product. It can be an 
abstract class or an interface that declares the factory method. The creator class may also provide default 
implementations or additional methods related to the product.


- **Concrete Creators**: These are the subclasses of the creator class that override the factory method to create 
specific products.


## II. UML


![factory-method-uml.png](..%2F..%2F..%2F..%2F..%2F..%2Fresources%2Fimages%2FfactoryMethod%2Ffactory-method-uml.png)

## III. When to use


![fm-when-to-use.png](..%2F..%2F..%2F..%2F..%2F..%2Fresources%2Fimages%2FfactoryMethod%2Ffm-when-to-use.png)

## IV. Exercise

Imagine a music streaming application that offers different types of subscriptions: Basic, Premium, and Family.
Implement the Factory Method pattern to create instances of the different subscription types.

- To view a possible solution, refer to the code source in this package
