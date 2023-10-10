import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        while (scanner.nextInt() != 0) {
            result += 1;
        }
        System.out.print(result);
    }
}
