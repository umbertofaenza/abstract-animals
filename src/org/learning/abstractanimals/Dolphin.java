package org.learning.abstractanimals;

public class Dolphin extends Animal implements CanSwim {
    @Override
    public void makeNoise() {
        System.out.println("Squeak!");
    }

    @Override
    public void eat() {
        System.out.println("I'm eating a fish.");
    }

    @Override
    public void swim() {
        System.out.println("I'm swimming!");
    }
}
