package org.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class PalendromTest {

    Palendrom palendrom = new Palendrom();

    @Test
    public void testIsPalendromThenReturnTrue() {
        Assert.assertTrue(palendrom.isPalendrom(List.of("коту","тащат","уток")));
    }

    @Test
    public void testIsPalendromThenReturnFalse() {
        Assert.assertFalse(palendrom.isPalendrom(List.of("утки","тащат","кота")));
    }
}