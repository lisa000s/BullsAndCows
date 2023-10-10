import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        String city2 = city.replace(" ", "").toLowerCase();
        System.out.println(city2.endsWith("burg"));
    }
}
