package com.company;

public class Sort {
    /** Sorts strings destructively */
    public static void sort(String[] x) {
        // This just gets the ball rolling for the private helper method sort(String[] x, int start)
        sort(x, 0);
    }

    /** Sorts x starting at position start */
    private static void sort(String[] x, int start) {
        // base case for the recursive call
        if (start >= x.length) {
            return;
        }

        // Find the smallest item
        int smallestIndex = findSmallest(x, start);

        // Move it to the front
        swap(x, start, smallestIndex);

        // Selection sort the rest using recursion
        sort(x, start + 1);
    }

    // Helper methods
    /** Returns index of the smallest string in x */
    public static int findSmallest(String[] x, int start) {
        int smallestIndex = start;

        for (int i = start; i < x.length; i++) {
            if (x[i].compareTo(x[smallestIndex]) < 0) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    /** Swaps smallest item to the front of the array */
     public static void swap(String[] x, int a, int b) {
         String temp;
         temp = x[b];
         x[b] = x[a];
         x[a] = temp;
     }
}
