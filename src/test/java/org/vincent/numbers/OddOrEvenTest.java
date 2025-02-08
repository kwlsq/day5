package org.vincent.numbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddOrEvenTest {

    @Test
    void evenNumberFilter() {
        assertArrayEquals(new int[]{2,4,6,8,10}, OddOrEven.evenNumberFilter(new int[]{ 1,2,3,4,5,6,7,8,9,10}));
        assertArrayEquals(new int[]{2,2,4,4,6,6}, OddOrEven.evenNumberFilter(new int[]{ 1,2,2,4,4,6,7,6,9,3}));
    }
}