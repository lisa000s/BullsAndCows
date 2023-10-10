import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        str1 = str1.replaceAll("\\s", "");
        //System.out.println(str1);
        //System.out.println(str2);
        str2 = str2.replaceAll("\\s", "");

        System.out.println(str1.equals(str2));
    }
}