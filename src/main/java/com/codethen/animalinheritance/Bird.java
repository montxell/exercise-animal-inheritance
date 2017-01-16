package com.codethen.animalinheritance;


public class Bird implements Animal {

    @Override
    public String makeSound() {

        return "Piu";

    }


    public String fly (int numMinutes) {

        return "I'm flying for " + numMinutes + " minutes.";

    }

}