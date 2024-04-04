package org.learning.abstractanimals;

public class Dog extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("Woof!");
    }

    @Override
    public void eat() {
        System.out.println("I'm eating dog food.");
    }
}
