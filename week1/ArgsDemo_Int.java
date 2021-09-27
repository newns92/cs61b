package week1;
public class ArgsDemo_Int {
    public static void main(String[] args) {
        // System.out.println(args[0]);

        //** Sum up the CLI arguments */
        int n = args.length;
        int i = 0;
        int sum = 0;
        while (i < n) {
            sum = sum + Integer.parseInt(args[i]);
            i++;
        }
        System.out.println(sum);
    }
}
