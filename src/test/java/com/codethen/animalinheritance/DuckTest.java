package com.codethen.animalinheritance;

import org.junit.Assert;
import org.junit.Test;

public class DuckTest {

    @Test
    public void testDuck() {

        Duck duck = new Duck();

        Assert.assertEquals("Quack", duck.makeSound());

    }


    @Test
    public void testFly() {

        Duck duck = new Duck();

        Assert.assertEquals("I'm flying for 20 minutes.", duck.fly(20));
    }


    @Test
    public void testSwim() {

        Duck duck = new Duck();

        Assert.assertEquals("I'm swimming for 10 minutes.", duck.swim(10));
    }
}
