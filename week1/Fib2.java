package week1;

public class Fib2 {
    /** Method to more efficiently do the Fibonacci sequence with less recursion
     * @@n = number of times to run the sequence
     * @@k = the element we start at = 0
     * @@f0 = the 1st Fibonacci number, 0
     * @@f1 = the 2nd Fibonacci number, 1
     */
    private static int fib2(int n, int k, int f0, int f1) {
        if (n == k) { // if we've reached the number we're looking for
            return f0;
        }
        else { // if we haven't reached the number we're looking for, must keep building up/onward
            return fib2(n, 
                        k + 1, // increase the element
                        f1, // the n - 2 number
                        f0 + f1); // the n - 1 number
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(fib2(i, 0, 0, 1)); // always starting at the 0th element with the 1st 2 Fibonacci numbers, 0 and 1
        }
        
    }
}