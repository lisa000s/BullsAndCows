import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char[] array = str.toCharArray();
        StringBuilder sb = new StringBuilder(array.length*2);
        for (char c : array) {
            sb.append(c).append(c);
        }
        System.out.println(sb);

    }
}