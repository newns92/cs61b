package week1;
public class ArgsDemo_String {
    public static void main(String[] args) {
        // System.out.println(args[0]);

        //** Sum up the CLI arguments */
        String sum = "";
        for (int i = 0; i < args.length; i++) {
            sum = sum + args[i] + " ";
        }
        System.out.println(sum);
    }
}
