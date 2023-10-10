import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        int nbr = scanner.nextInt();
        boolean contains = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == nbr) {
                contains = true;
            }
        }
        System.out.println(contains);
    }
}