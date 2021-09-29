package com.company;

/** An SLList is a list of integers which hides the detail that there exists a null link from user
 * The empty SLList is just the sentinel node */
public class SLList_Sentinel {
    // nested class
    private static class IntNode {

        public int item;
        public IntNode next;

        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }

    // Instance variables
    /* The first item (if it exists) is at sentinel.next */
    private IntNode sentinel;
    private int size; // used to calculate size much faster than the method below

    /** Constructor creates an empty SLList */
    public SLList_Sentinel() {
        sentinel = new IntNode(0, null); // i could be anything, we don't care about it
        size = 0;
    }

    public SLList_Sentinel(int x) {
        sentinel = new IntNode(0, null); // i could be anything, we don't care about it
        sentinel.next = new IntNode(x, null); // this points to the data we want
        size = 1;
    }

    /** Adds x to front of the SLList */
    public void addFirst(int x) {
        // "first" pointer should be a NEW IntNode
        sentinel.next = new IntNode(x, sentinel.next);
        size += 1;
    }

    /** Adds x to end of the SLList iteratively */
    public void addLast(int x) {

        size += 1;

        // common to create a pointer variable
        IntNode p = sentinel;

        // Scan p to the end of the list
        while (p.next != null) {
            p = p.next;
        }

        // when at final node in SLList, add item x
        p.next = new IntNode(x, null);

    }

    /** Returns the first item in the list */
    public int getFirst() {
        return sentinel.next.item;
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        /* Creates a list of one integer, namely: 15 */
        SLList_Sentinel L = new SLList_Sentinel(15);
        L.addFirst(10);
        L.addFirst(5);
        L.addLast(20);
        System.out.println(L.getFirst());
        System.out.println(L.size());
        // System.out.println(L.sizePrivate());

        SLList_Sentinel L2 = new SLList_Sentinel();
        L2.addLast(20);
        System.out.println(L2.getFirst());
        System.out.println(L2.size());

    }
}
