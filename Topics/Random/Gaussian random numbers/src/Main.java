import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        double m = scanner.nextDouble();
        for (int i = k; ; i++) {
            Random random = new Random(i);
            int j = 0;
            for (; j < n; j++) {
                double randomNumber = random.nextGaussian();
                if (randomNumber > m) {
                    break;
                }
            }
            if (j == n) {
                System.out.println(i);
                break;
            }
        }
    }
}