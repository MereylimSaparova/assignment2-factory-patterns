# Assignment 2 — Factory Method & Abstract Factory

## Course
ShP-2216 — Software Design Patterns

## Student
Mereylim Saparova

## Description
This project demonstrates two creational design patterns in Java:

- Factory Method
- Abstract Factory

## Part A — Factory Method

The Factory Method pattern is used to create different types of transport objects.

### Products
- Transport
- Truck
- Ship

### Creators
- TransportFactory
- TruckFactory
- ShipFactory

The client does not create transport objects directly. Concrete factories are responsible for creating the required transport.

## Part B — Abstract Factory

The Abstract Factory pattern is used to create families of related GUI components.

### Abstract Products
- Button
- Checkbox

### Windows Family
- WindowsButton
- WindowsCheckbox
- WindowsFactory

### Mac Family
- MacButton
- MacCheckbox
- MacFactory

The Application class works only with abstract interfaces and does not directly instantiate concrete GUI components.

## Technologies

- Java
- JDK 17
- IntelliJ IDEA
- Git / GitHub

## How to Run

1. Open the project in IntelliJ IDEA.
2. Make sure JDK 17 or higher is configured.
3. Run `Main.java`.
4. The console displays results for both Factory Method and Abstract Factory.