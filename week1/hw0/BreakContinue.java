package week1.hw0;
public class BreakContinue {
    public static void windowPosSum(int[] a, int n) {
      /* Replaces each element a[i] with the sum of a[i] through a[i + n], but only if a[i] is positive valued. 
      If there are not enough values because we reach the end of the array, we sum only as many values as we have
          Hint 1: Use two for loops.
          Hint 2: Use continue to skip negative values.
          Hint 3: Use break to avoid going over the end of the array.
        */
      for (int i = 0; i < a.length; i++) {
        // System.out.println("Current element: " + a[i]);
        if (a[i] <= 0) {
          continue;
        }
        for (int j = i+1; j <= n+i; j++) {
          // System.out.println("Current element value: " + a[i]);
          if (j >= a.length) {
            break;
          }
          // System.out.println("Add: " + a[j]);
          a[i] += a[j];
        }
      }
    }
  
    public static void main(String[] args) {
      int[] a = {1, 2, -3, 4, 5, 4};
      int n = 3;
      windowPosSum(a, n);
  
      // Should print 4, 8, -3, 13, 9, 4
      System.out.println(java.util.Arrays.toString(a));
    }
  }
  