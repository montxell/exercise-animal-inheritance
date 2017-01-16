package com.codethen.animalinheritance;


public class Main {

    public static void main(String[] args) {

        // Animal dog = new Dog();
        Dog dog = new Dog();
        System.out.println( dog.makeSound() );

        // Animal cat = new Cat();
        Cat cat = new Cat();
        System.out.println( cat.makeSound() );


/*
        Animal bird = new Bird(); Declarar con la clase Animal es posible con el método makeSound pero no con método fly
                                  que es de la clase 'hija' Bird.
*/
        Bird bird = new Bird();
        System.out.println( bird.makeSound() );
        System.out.println( bird.fly(10) );

/*
        Animal duck = new Duck(); Declarar con la clase Animal es posible con el método makeSound pero no con método fly
                                  que es de la clase 'hija' Bird y Duck, ni con el método swim que es de la clase 'hija' Duck.
        Bird duck = new Duck();   Declarar con la clase Bird es posible con el método makeSound y fly, pero no con el método
                                  swim que es de la clase 'hija' Duck.
*/

        Duck duck = new Duck();
        System.out.println( duck.makeSound() );
        System.out.println( duck.fly(20) );
        System.out.println( duck.swim(10) );

    }

}
