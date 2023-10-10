import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nuts = scanner.nextInt();
        int sq = scanner.nextInt();
        System.out.println(sq / nuts);
    }
}
