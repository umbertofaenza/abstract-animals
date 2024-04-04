package org.learning.abstractanimals;

public class Eagle extends Animal implements CanFly {
    @Override
    public void makeNoise() {
        System.out.println("Screech!");
    }

    @Override
    public void eat() {
        System.out.println("I'm eating a mouse.");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying!");
    }
}
