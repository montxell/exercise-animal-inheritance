package com.codethen.animalinheritance;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {

    @Test
    public void testDog() {

        Dog dog = new Dog();

        Assert.assertEquals("Guau", dog.makeSound());

    }
}
