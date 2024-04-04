package org.learning.abstractanimals;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[] {
                new Dog(),
                new Sparrow(),
                new Eagle(),
                new Dolphin()
        };

//        for(Animal animal : animals) {
//            animal.makeNoise();
//            animal.eat();
//            animal.sleep();
//        }

        for(Animal animal : animals) {
            if(animal instanceof CanSwim) {
                makeSwim((CanSwim) animal);
            } else if (animal instanceof CanFly) {
                makeFly((CanFly) animal);
            } else {
                animal.makeNoise();
            }
        }
    }

    public static void makeFly(CanFly animal) {
        animal.fly();
    }

    public static void makeSwim(CanSwim animal) {
        animal.swim();
    }
}
