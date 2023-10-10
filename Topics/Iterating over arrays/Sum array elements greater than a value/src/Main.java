import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int sum = 0;
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        //System.out.println(size);
        //System.out.println(Arrays.toString(array));
        int n = scanner.nextInt();
        //System.out.println(n);
        for (int var: array) {
            if (var > n) {
                sum += var;
            }
        }
        System.out.println(sum);
    }
}