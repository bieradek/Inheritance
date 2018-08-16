package com.timbuchalka;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        // in order to avoid redundance we can remove brain and body and hard-code it in super call
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Method unique to the dog class called");
    }

    @Override
    public void eat() {
        System.out.println("Override method called i.e. chew() instead of default eat()");
        chew();
        super.eat(); // calling a default Animal method
    }

    public void walk() {
        System.out.println("dog.walk() called");
        move(5);
    }

    public void run() {
        System.out.println("dog.run() called");
        move(10);
        //If Java wouldn't find an overriden method inside the initial class it would
        //execute the method in super class.
    }

    public void runWithSuper() {
        System.out.println("run.with.super called");
        super.move(10);
        // i.e. only execute the method available in the super class
    }

    public void moveLegs(int speed) {
        System.out.println("Dog.moveLegs called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move called");
        moveLegs(speed);
        super.move(speed);
    }
}
