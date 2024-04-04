package org.learning.abstractanimals;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[] {
                new Dog(),
                new Sparrow(),
                new Eagle(),
                new Dolphin()
        };

        for(Animal animal : animals) {
            animal.makeNoise();
            animal.eat();
            animal.sleep();
        }
    }
}
