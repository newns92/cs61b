package com.company;

public class IntList {
    /** Lists are able to grow arbitrarily large vs. arrays which are fixed */

    /** This is a trivial implementation of a very basic Linked List */
    // instance variables
    public int first;
    public IntList rest;

    /** Constructor */
    public IntList(int f, IntList r) {
        first = f;
        rest = r;
    }

    /** Return size of the list recursively */
    public int size() {
        // always need BASE CASE for recursion
        if (rest == null) {
            return 1;
        }
        else {
            return 1 + this.rest.size(); // 1 + however big the rest of the list is
        }
    }

    /** Return size of list without recursion */
    public int iterativeSize() {
        // common to create a pointer variable
        IntList p = this;
        int totalSize = 0;

        while (p != null) {
            totalSize++;
            p = p.rest;
        }
        return totalSize;
    }

    /** Method to return the ith element of an IntList */
    public int get(int i) {
        // recursive = needs base case
        if (i == 0) {
            return first;
        }
        else {
            return rest.get(i-1);
        }
    }

    public static void main(String[] args) {
        IntList L = new IntList(15, null);
        L = new IntList(10, L);
        L = new IntList(5, L);

        System.out.println(L.size());
        System.out.println(L.iterativeSize());
        System.out.println(L.get(0));
        System.out.println(L.get(1));
        System.out.println(L.get(2));

//        IntList L = new IntList();
//        L.first = 5;
//        L.rest = null;
//
//        L.rest = new IntList();
//        L.rest.first = 10;
//
//        L.rest.rest = new IntList();
//        L.rest.rest.first = 15;
    }
}