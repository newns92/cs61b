package com.company;

import org.junit.Test;
import static org.junit.Assert.*;

/** Tests the Sort class */
public class TestSort_Junit {
    /** Test the Sort.sort method */
    @Test
    public void testSort() {
        String[] input = {"i", "have", "an", "egg"};
        String[] expected = {"an", "egg", "have", "i"};

        Sort.sort(input); // does not return anything

        // org.junit.Assert.assertEquals(expected, input); // deprecated
        assertArrayEquals(expected, input);
    }

    /** Test the Sort.findSmallest method */
    @Test
    public void testFindSmallest() {
        String[] input = {"i", "have", "an", "egg"};
        int expected = 2;

        int actual = Sort.findSmallest(input, 0);
        org.junit.Assert.assertEquals(expected, actual);

        String[] input2 = {"there", "are", "many", "pigs"};
        int expected2 = 2;

        int actual2 = Sort.findSmallest(input2, 2);
        assertEquals(expected2, actual2);
    }

    /** Test the Sort.testSwap method */
    @Test
    public void testSwap() {
        String[] input = {"i", "have", "an", "egg"};
        String[] expected = {"an", "have", "i", "egg"};
        int a = 0;
        int b = 2;

        Sort.swap(input, a, b);
        assertArrayEquals(expected, input);
    }

}
