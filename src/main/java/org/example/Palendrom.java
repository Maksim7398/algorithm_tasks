package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Palendrom {

    public boolean isPalendrom(final List<String> list) {
        if (list.isEmpty()){
            return false;
        }
        List<String> objects = new ArrayList<>(list);
        Collections.reverse(objects);
        IntStream.range(0, objects.size())
                .forEach(i -> objects.set(i, new StringBuilder(objects.get(i)).reverse().toString()));
        return objects.equals(list);
    }

    public boolean isPalendrom2(List<?> list) {
        if (list.isEmpty()){
            return false;
        }
        List<?> objects = new ArrayList<>(list);
        Collections.reverse(list);
        return objects.equals(list);
    }

}
