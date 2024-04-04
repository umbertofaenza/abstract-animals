package org.learning.abstractanimals;

public class Sparrow extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("Chip!");
    }

    @Override
    public void eat() {
        System.out.println("I'm eating a worm.");
    }
}
