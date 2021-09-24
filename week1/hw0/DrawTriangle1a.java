package week1;
public class DrawTriangle1a {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            int j = 0;
            while(j <= i) {
                System.out.print('*');
                j++;
            }
            System.out.println();
        }
    }    
}
