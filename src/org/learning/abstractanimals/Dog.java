package org.learning.abstractanimals;

public class Dog extends Animal implements CanSwim {
    @Override
    public void makeNoise() {
        System.out.println("Woof!");
    }

    @Override
    public void eat() {
        System.out.println("I'm eating dog food.");
    }

    @Override
    public void swim() {
        System.out.println("I'm swimming!");
    }
}
