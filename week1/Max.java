package week1;
public class Max {
    public static int max(int[] m) {
        int max = 0;
        for (int n : m) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        System.out.println(max(numbers));
    }
}
