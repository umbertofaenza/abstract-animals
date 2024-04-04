package org.learning.abstractanimals;

public class Dolphin extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("Squeak!");
    }

    @Override
    public void eat() {
        System.out.println("I'm eating a fish.");
    }
}
