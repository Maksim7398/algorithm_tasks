package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Palendrom {

    public boolean isPalendrom(final List<String> list) {
        if (list.isEmpty()) {
            return false;
        }
        List<String> reverseList = new ArrayList<>(list);
        Collections.reverse(reverseList);
        IntStream.range(0, reverseList.size())
                .forEach(i -> reverseList.set(i, new StringBuilder(reverseList.get(i)).reverse().toString()));
        return reverseList.equals(list);
    }

    public boolean isPalendrom2(List<?> list) {
        if (list.isEmpty()) {
            return false;
        }
        int size = list.size();
        for (int i = 0, j = size-1;;){
            return list.get(i).equals(list.get(j));
        }
    }

    public boolean isPalendrom3(List<?> list) {
        if (list.isEmpty()) {
            return false;
        }
        int size = list.size();
        List<?> reverseList = list.subList(0, size / 2);
        Collections.reverse(reverseList);
        return list.subList((size - (size / 2)), size).equals(reverseList);
    }
}
