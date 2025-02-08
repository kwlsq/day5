package org.vincent.numbers;

import java.util.ArrayList;

public class OddOrEven {
    public static int[] evenNumberFilter(int[] inputArray) {
        if(inputArray.length==0){
            throw new IllegalArgumentException("Input can't be an empty array");
        }

        ArrayList<Integer> filteredArray = new ArrayList<>();
        for (int j : inputArray) {
            if (j % 2 == 0) {
                filteredArray.add(j);
            }
        }
        return filteredArray.stream().mapToInt(i -> i).toArray();
    }
}
