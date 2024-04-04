package org.learning.abstractanimals;

public class Sparrow extends Animal implements CanFly {
    @Override
    public void makeNoise() {
        System.out.println("Chip!");
    }

    @Override
    public void eat() {
        System.out.println("I'm eating a worm.");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying!");
    }
}
