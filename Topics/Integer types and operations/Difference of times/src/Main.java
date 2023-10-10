import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour1 = scanner.nextInt();
        int minute1 = scanner.nextInt();
        int second1 = scanner.nextInt();
        int hour2 = scanner.nextInt();
        int minute2 = scanner.nextInt();
        int second2 = scanner.nextInt();
        int totalSeconds1 = (hour1 * 60 * 60) + (minute1 * 60) + second1;
        int totalSeconds2 = (hour2 * 60 * 60) + (minute2 * 60) + second2;
        int result = totalSeconds2 - totalSeconds1;
        System.out.println(result);
    }
}