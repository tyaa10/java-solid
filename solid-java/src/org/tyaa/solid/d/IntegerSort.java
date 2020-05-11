package org.tyaa.solid.d;

import java.util.List;

public class IntegerSort {
    public static void sort(List<Integer> integers){
        boolean sorted;
        do {
            sorted = true;
            for (int i = 0; i < integers.size() - 1; i++){
                // Compare
                if (integers.get(i) - integers.get(i + 1) > 0){
                    // Swap
                    Integer tempInteger = integers.get(i);
                    integers.set(i, integers.get(i + 1));
                    integers.set(i + 1, tempInteger);
                    sorted = false;
                }
            }
        } while (!sorted);
    }
}
