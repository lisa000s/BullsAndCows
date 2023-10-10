import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrLength = scanner.nextInt();
        int[] arr = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            arr[i] = scanner.nextInt();
        }
        int count = 0;
        if (arrLength > 2) {
            if (arr[1] - arr[0] == 1 && arr[2] - arr[1] == 1) {
                count++;
            }
            for (int i = 1; i < arrLength - 2; i++) {
                if (arr[i + 1] - arr[i] == 1 && arr[i + 2] - arr[i + 1] == 1) {
                    count++;
                }
            }
        }
        System.out.println(count);
        }
    }