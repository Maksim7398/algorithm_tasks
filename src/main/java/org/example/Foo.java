package org.example;

import java.util.Objects;

public class Foo {

    int number;

    public Foo(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Foo foo = (Foo) o;
        return number == foo.number;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(number);
    }
}
