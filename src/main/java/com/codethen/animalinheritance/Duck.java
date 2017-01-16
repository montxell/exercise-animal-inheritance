package com.codethen.animalinheritance;


public class Duck extends Bird {

    @Override
    public String makeSound() {

        return "Quack";

    }

    @Override
    public String fly (int numMinutes) {

        return "I'm flying for " + numMinutes + " minutes.";
    }

    public String swim (int numMinutes) {

        return "I'm swimming for " + numMinutes + " minutes.";

    }


}
