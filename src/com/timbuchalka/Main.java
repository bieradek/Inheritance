package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("York", 8, 20, 4, 4, 1, 20, "Long silky");

        dog.eat();
    }
}
