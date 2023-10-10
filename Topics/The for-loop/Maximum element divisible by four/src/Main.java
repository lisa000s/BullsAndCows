import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nelement = scanner.nextInt();
        int[] numbers = new int[nelement];
        for (int i = 0; i < nelement; i++) {
            numbers[i] = scanner.nextInt();
        }
        //System.out.println(nelement);
        //System.out.println(Arrays.toString(numbers));
        int maxDiv = 0;
        for (int j = 0; j < numbers.length; j++) {
            if (maxDiv < numbers[j] && numbers[j] % 4 ==0) {
                maxDiv = numbers[j];
            }
        }
        System.out.println(maxDiv);
    }
}