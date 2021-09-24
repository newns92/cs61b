package week1;
public class DrawTriangle1b {
    public static void drawTriangle(int n) {
        for (int i = 0; i < n; i++) {
            int j = 0;
            while(j <= i) {
                System.out.print('*');
                j++;
            }
            System.out.println();
        }
    }    

    public static void main(String[] args) {
        // drawTriangle(10);
        drawTriangle(Integer.parseInt(args[0])); // take in user CLI argument
    }
}
