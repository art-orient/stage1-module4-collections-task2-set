package com.epam.mjc.collections.set;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        TreeSet<Integer> set = new TreeSet<>();
        for (Integer number : sourceList) {
            set.add(number * number);
        }
        return set.subSet(lowerBound, upperBound + 1);
    }
}
