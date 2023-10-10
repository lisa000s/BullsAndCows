import java.util.Scanner;

class EvenUpperCase {

    public static String upperEvenLetters(String message) {
        StringBuilder sb = new StringBuilder(message.length());
        char[] arr = message.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                sb.append(Character.toUpperCase(arr[i]));
            } else {
                sb.append(arr[i]);
            }
        }
        return sb.toString();
    }

    // Don't change the code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.next();

        System.out.println(upperEvenLetters(message));
    }
}