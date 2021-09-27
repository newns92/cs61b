package com.company;

/** Tests the Sort class */
public class TestSort {
    /** Test the Sort.sort method */
    public static void testSort() {
        String[] input = {"i", "have", "an", "egg"};
        String[] expected = {"an", "egg", "have", "i"};

        Sort.sort(input); // does not return anything

        for (int i = 0; i < input.length; i++) {
            if (!input[i].equals(expected[i])) {
                System.out.println("Error! Mismatch in position " + i + ", expected: " + expected[i] +
                        ", but got: " + input[i]);
                return;
            }
        }

        // if (input != expected) {
//        if (!java.util.Arrays.equals(input, expected)) {
//             System.out.println("Error! There seems to be a problem with Sort.sort");
//        }
    }


    public static void main(String[] args) {
        testSort();
    }
}
