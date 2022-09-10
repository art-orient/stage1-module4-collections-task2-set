package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> hs = new HashSet<>();
        for (Integer number : sourceList) {
            if (number % 2 == 0) {
                do {
                    hs.add(number);
                    number /= 2;
                } while (number % 2 == 0);
                hs.add(number);
            } else {
                hs.add(number);
                hs.add(number * 2);
            }
        }
        return hs;
    }
}
