package com.company;

/** An SLList is a list of integers which hides the terrible truth of the nakedness
 *  within =  hides the detail that there exists a null link from user */
public class SLList {
    // nested class
    private static class IntNode {

        public int item;
        public IntNode next;

        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }

    // instance variables
    private IntNode first;
    private int size; // used to calculate size much faster than the method below

    /** Constructor creates an empty SLList */
    public SLList() {
        first = null;
        size = 0;
    }

    public SLList(int x) {
        first = new IntNode(x, null);
        size = 1;
    }

    /** Adds x to front of the SLList */
    public void addFirst(int x) {
        // "first" pointer should be a NEW IntNode
        first = new IntNode(x, first);
        size += 1;
    }

    /** Adds x to end of the SLList iteratively */
    public void addLast(int x) {

        size += 1;

        // common to create a pointer variable
        IntNode p = first;

        // check for empty list
        if (first == null) {
            first = new IntNode(x, null);
            return;
        }

        // Scan p to the end of the list
        while (p.next != null) {
            p = p.next;
        }

        // when at final node in SLList, add item x
        p.next = new IntNode(x, null);

    }

    /** Returns the first item in the list */
    public int getFirst() {
        return first.item;
    }

//    /** Get size of the SLList */
//    public int size() {
//        // common to create a pointer variable
//        IntNode p = first;
//        int totalSize = 0;
//
//        while (p != null) {
//            totalSize++;
//            p = p.next;
//        }
//        return totalSize;
//    }
//
//    /** Get size of the SLList that starts at IntNode p */
//    private static int sizePrivate(IntNode p) {
//        if (p.next == null) {
//            return 1;
//        }
//        else {
//            return 1 + sizePrivate(p.next);
//        }
//    }
//
//    /** This uses the private static method */
//    public int sizePrivate() {
//        return sizePrivate(first);
//    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        /* Creates a list of one integer, namely: 15 */
        SLList L = new SLList(15);
        L.addFirst(10);
        L.addFirst(5);
        L.addLast(20);
        System.out.println(L.getFirst());
        System.out.println(L.size());
        // System.out.println(L.sizePrivate());

        SLList L2 = new SLList();
        L2.addLast(20);
        System.out.println(L2.getFirst());
        System.out.println(L2.size());

    }
}
