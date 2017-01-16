package com.codethen.animalinheritance;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Animal dog = new Dog();
        Dog dog = new Dog();
        System.out.println(dog.makeSound());

        // Animal cat = new Cat();
        Cat cat = new Cat();
        System.out.println(cat.makeSound());


/*
        Animal bird = new Bird(); Declarar con la clase Animal es posible con el método makeSound pero no con método fly
                                  que es de la clase 'hija' Bird.
*/
        Bird bird = new Bird();
        System.out.println(bird.makeSound());
        System.out.println(bird.fly(10));

/*
        Animal duck = new Duck(); Declarar con la clase Animal es posible con el método makeSound pero no con método fly
                                  que es de la clase 'hija' Bird y Duck, ni con el método swim que es de la clase 'hija' Duck.
        Bird duck = new Duck();   Declarar con la clase Bird es posible con el método makeSound y fly, pero no con el método
                                  swim que es de la clase 'hija' Duck.
*/

        Duck duck = new Duck();
        System.out.println(duck.makeSound());
        System.out.println(duck.fly(20));
        System.out.println(duck.swim(10));


        // CREAR UNA LISTA DE ANIMALES Y HACER EMITIR EL SONIDO DE CADA UNO

        List<Animal> animals = new ArrayList<>();

        animals.add(dog);
        animals.add(cat);
        animals.add(bird);
        animals.add(duck);


        System.out.println("List of sounds made by the animals:");

        for (int i = 0; i < animals.size(); i++) {

            Animal animal = animals.get(i);
            System.out.print(i + 1 + " - ");
            String sound = animal.makeSound();
            System.out.println(sound);

        }

    }


/*
        // OPCIÓN ALTERNATIVA BUCLE ENHANCED FOR:

        Se debería añadir después de la adición a la lista de animales:

                animalsMakeSound(animals);


        // All the animals make a sound

        private static void animalsMakeSound(List<Animal> animals) {

            for (Animal animal : animals) {
                System.out.println( animal.makeSound() );
            }
        }
*/


}