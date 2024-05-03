package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class PalendromTest {

    Palendrom palendrom = new Palendrom();

    @Test
    public void testIsPalendromThenReturnTrue() {
        Assert.assertTrue(palendrom.isPalendrom(new ArrayList<>(List.of("коту", "тащат", "уток"))));
    }

    @Test
    public void testIsPalendromThenReturnFalse() {
        Assert.assertFalse(palendrom.isPalendrom(List.of("утки", "тащат", "кота")));
    }

    @ParameterizedTest
    @MethodSource("createArguments")
    public void testPalindrome2(List<?> list,Object expected) {
        Assert.assertEquals(expected,palendrom.isPalendrom2(list));
    }

    public static Stream<Arguments> createArguments() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(1, 2, 3)),false),
                Arguments.of(new ArrayList<>(List.of(1, 2, 3, 2, 1)),true),
                Arguments.of(new ArrayList<>(List.of()),false)
        );
    }
}