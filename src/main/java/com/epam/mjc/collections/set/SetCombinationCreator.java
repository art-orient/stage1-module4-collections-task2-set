package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> hs = new HashSet<>(firstSet);
        hs.retainAll(secondSet);
        hs.removeAll(thirdSet);
        Set<String> tmp = new HashSet<>(thirdSet);
        tmp.removeAll(firstSet);
        tmp.removeAll(secondSet);
        hs.addAll(tmp);
        return hs;
    }
}
