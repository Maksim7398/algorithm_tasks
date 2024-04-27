package org.example;

import java.util.List;

public class Palendrom {

    public boolean isPalendrom(final List<String> list) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (String s : list) {
            sb.append(s);
        }
        char[] charArray = sb.toString().toCharArray();
        for (int i = charArray.length - 1; i >= 0; i--) {
            sb2.append(charArray[i]);
        }
        return sb.toString().contains(sb2.toString());
    }
}
