package com.codethen.animalinheritance;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {

    @Test
    public void testCat() {

        Cat cat = new Cat();

        Assert.assertEquals("Miau", cat.makeSound());

    }
}
