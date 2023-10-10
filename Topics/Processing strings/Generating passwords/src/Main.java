import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int n = scanner.nextInt();
        char[] arrABC = new char[a + b + c];
        char[] arrABCN = new char[n];
        StringBuilder str = new StringBuilder();
        //build a + b + c array
        for (int i = 0; i < a; i++) {
            arrABC[i] = 'A';
            for (int j = 1; j < a - 1; j++) {
                arrABC[j] = 'B';
            }
        }
        for (int i = a; i < a + b; i++) {
            arrABC[i] = 'a';
            for (int j = a + 1; j < (a + b); j++) {
                arrABC[j] = 'b';
            }
        }
        for (int i = a + b; i < a + b + c; i++) {
            arrABC[i] = '1';
            for (int j = a + b + 1; j < (a + b + c) - 1; j++) {
                arrABC[j] = '2';
            }
        }
        //if a + b + c < n, create new array and keep inserting a + b + c chars until array length = n
        for (int i = 0, j = 0; i < n && j < arrABC.length; i++, j++) {
            arrABCN[i] = arrABC[j];
            if (j == arrABC.length - 1) {
                j = -1;
            }
        }
        //swap repeated chars
        for (int i = 0; i < arrABCN.length - 1; i++) {
            if (arrABCN[i] == arrABCN[i + 1]) {
                if (Character.isUpperCase(arrABCN[i])) {
                    if (arrABCN[i] == 'A') {
                        arrABCN[i + 1] = 'B';
                    } else {
                        arrABCN[i + 1] = 'A';
                    }
                } else if (Character.isLowerCase(arrABCN[i])) {
                    if (arrABCN[i] == 'a') {
                        arrABCN[i + 1] = 'b';
                    } else {
                        arrABCN[i + 1] = 'a';
                    }
                } else {
                    if (arrABCN[i] == '1') {
                        arrABCN[i + 1] = '2';
                    } else {
                        arrABCN[i + 1] = '1';
                    }
                }
            }
        }
        str.append(arrABCN);
        System.out.print(str);
    }
}