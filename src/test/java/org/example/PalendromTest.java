package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class PalendromTest {

    Palendrom palendrom = new Palendrom();

    @Test
    public void testIsPalendromThenReturnTrue() {
        Assertions.assertTrue(palendrom.isPalendrom(Arrays.asList("коту", "тащат", "уток")));
    }

    @ParameterizedTest
    @MethodSource("createArguments1")
    public void testIsPalendromThenReturnFalse(List<String> list,Object expected) {
        Assertions.assertEquals(palendrom.isPalendrom(list),expected);
    }

    public static Stream<Arguments> createArguments1() {
        return Stream.of(
                Arguments.of(Arrays.asList("коту", "тащат", "уток"),true),
                Arguments.of(Arrays.asList("утки", "тащат", "кота"),false)
        );
    }

    @ParameterizedTest
    @MethodSource("createArguments2")
    public void testPalindrome2(List<?> list,Object expected) {
        Assertions.assertEquals(expected, palendrom.isPalendrom2(list));
    }

    public static Stream<Arguments> createArguments2() {
        return Stream.of(
                Arguments.of(Arrays.asList(1, 2, 3),false),
                Arguments.of(Arrays.asList(1, 2, 3, 2, 1),true),
                Arguments.of(Collections.emptyList(),false),
                Arguments.of(Arrays.asList("test", 2, 3, 2, "test"),true),
                Arguments.of(Arrays.asList(new Foo(1), 2, 3, 2, new Foo(1)),true),
                Arguments.of(Arrays.asList("test", 2,3,2,2,3, 2, "test"),true)
        );
    }

    @ParameterizedTest
    @MethodSource("createArguments3")
    public void testPalindrome3(List<?> list,Object expected) {
        Assertions.assertEquals(expected, palendrom.isPalendrom3(list));
    }

    public static Stream<Arguments> createArguments3() {
        return Stream.of(
                Arguments.of(Arrays.asList(1, 2, 3),false),
                Arguments.of(Arrays.asList(1, 2, 3, 2, 1),true),
                Arguments.of(Collections.emptyList(),false),
                Arguments.of(Arrays.asList(null,1,null),true),
                Arguments.of(Arrays.asList("test", 2, 3, 2, "test"),true),
                Arguments.of(Arrays.asList(new Foo(1), 2, 3, 2, new Foo(1)),true),
                Arguments.of(Arrays.asList("test", 2,3,2,2,3, 2, "test"),true)
        );
    }

}