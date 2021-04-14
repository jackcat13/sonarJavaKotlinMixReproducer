package com.reproducer.sonarJavaKotlinMix.data;

import org.gradle.internal.impldep.org.testng.Assert;
import org.junit.jupiter.api.Test;

public class DataTest {

    private Data data = new Data("a", "b", "c");

    @Test
    void testToBeTested(){
        Assert.assertEquals(data.toBeTested("world"), "Hello world");
    }
}
