package com.codethen.animalinheritance;


public class Duck extends Bird {

    @Override
    public String makeSound() {

        return "Quack";

    }


    // El método fly no es necesario porque ya lo incluye la clase 'padre' Bird.



    public String swim (int numMinutes) {

        return "I'm swimming for " + numMinutes + " minutes.";

    }


}
