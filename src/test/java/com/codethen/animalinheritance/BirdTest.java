package com.codethen.animalinheritance;

import org.junit.Assert;
import org.junit.Test;

public class BirdTest {

    @Test
    public void testBird() {

        Bird bird = new Bird();

        Assert.assertEquals("Piu", bird.makeSound());

    }


    @Test
    public void testFly() {

        Bird bird = new Bird();

        Assert.assertEquals("I'm flying for 10 minutes.", bird.fly(10));
    }
}
