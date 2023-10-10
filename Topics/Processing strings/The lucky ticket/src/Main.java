import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ticket = scanner.next();
        int str1 = 0;
        int str2 = 0;
        for (int i = 0; i < 3; i++) {
            str1 += Integer.parseInt(String.valueOf(ticket.charAt(i)));
        }
        for (int i = 3; i < ticket.length(); i++) {
            str2 += Integer.parseInt(String.valueOf(ticket.charAt(i)));
        }
        if (str1 == str2) {
            System.out.println("Lucky");
        } else {
            System.out.println("Regular");
        }
    }
}