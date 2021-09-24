package week1;
public class HelloNumbers {
    public static void main(String[] args) {
        int x = 0; // x must be declared before it is used, + it must be given a type (type of a variable can never change (STATIC))
        while (x < 10) {
            System.out.print(x + " ");
            x++;
        }

        System.out.println();
        System.out.println(5 + "10");

        int sum = 0;
        x = 0; // reset counter
        // print out cumulative sum
        while (x < 10) {
            sum += x;
            System.out.print(sum + "\n");
            x++;
        }
    }
}