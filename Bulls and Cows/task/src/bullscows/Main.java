package bullscows;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void printGrade(int bulls, int cows, String secretCode, String guess) {
        for (int i = 0; i < secretCode.length(); i++) {
            String ch = Character.toString(secretCode.charAt(i));
            if (guess.contains(ch)) {
                cows++;
            }
            if (secretCode.charAt(i) == guess.charAt(i)) {
                bulls++;
                cows--;
            }
        }
        if (secretCode.length() > 0) {
            if ((cows != 0 && bulls != 0) && !secretCode.equals(guess)) {
                System.out.println("Grade: " + bulls + ((bulls > 1) ? " bulls" : " bull") + " and " + cows + ((cows > 1) ? " cows" : " cow"));
            } else if (cows != 0 && bulls == 0) {
                System.out.println("Grade: " + cows + ((cows > 1) ? " cows" : " cow"));
            } else if (cows == 0 && bulls != 0) {
                System.out.println("Grade: " + bulls + ((bulls > 1) ? " bulls" : " bull"));
            } else {
                System.out.println("Grade: None");
            }
        }
    }

    public static void main(String[] args) {
        int cows = 0;
        int bulls = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the length of the secret code:");
        String secretCodeLengthString = scanner.next();
        try {
            Integer.parseInt(secretCodeLengthString);
        } catch (NumberFormatException e) {
            System.out.println("Error: " + secretCodeLengthString + " isn't a valid number.");
            return;
        }
        int secretCodeLength = Integer.parseInt(secretCodeLengthString);
        if (secretCodeLength < 1) {
            System.out.println("Error");
            return;
        }
        System.out.println("Input the number of possible symbols in the code:");
        int numberOfPossibleSymbols = scanner.nextInt();
        if (numberOfPossibleSymbols < secretCodeLength) {
            System.out.println("Error: it's not possible to generate a code with a length of 6 with 5 unique symbols.");
            return;
        }
        if (numberOfPossibleSymbols > 36) {
            System.out.println("Error: maximum number of possible symbols in the code is 36 (0-9, a-z).");
            return;
        }
        String possibleSymbols = "0123456789abcdefghijklmnopqrstuvwxyz";
//        String symbolRange = possibleSymbols.substring(0, numberOfPossibleSymbols);
//        System.out.println(symbolRange);
        String numberRange = "";
        if (numberOfPossibleSymbols > 9) {
            numberRange = "0-9";
        } else {
            numberRange = "0-" + numberOfPossibleSymbols;
        }
//        System.out.println(numberRange);
        StringBuilder alphabetRange = new StringBuilder();
        char[] charRangeArr = possibleSymbols.toCharArray();
        if (numberOfPossibleSymbols > 11) {
            for (int i = 10; i < numberOfPossibleSymbols; i++) {
                alphabetRange.append(charRangeArr[i]);
            }
        }
//        System.out.println(alphabetRange);
        String charRange = "";
        if (alphabetRange.length() != 0) {
            charRange = alphabetRange.substring(0, 1) + "-" + alphabetRange.substring(alphabetRange.length() - 1);
        }
//        System.out.println(charRange);
        if (charRange.equals("")) {
            System.out.println("The secret is prepared: " + "*".repeat(secretCodeLength) + " (" + numberRange + ")");
        } else {
            System.out.println("The secret is prepared: " + "*".repeat(secretCodeLength) + " (" + numberRange + ", " + charRange + ").");
        }
        System.out.println("Okay, let's start a game!");
        StringBuilder secretCodeResult = new StringBuilder(secretCodeLength);
        secretCodeResult = generateCode(secretCodeLength, numberOfPossibleSymbols, possibleSymbols);
        while (secretCodeResult.length() != secretCodeLength) {
            secretCodeResult.append(generateCode(secretCodeLength, numberOfPossibleSymbols, possibleSymbols));
            if (secretCodeResult.length() > secretCodeLength) {
                for (int i = secretCodeResult.length(); i > secretCodeLength; i--) {
                    secretCodeResult.deleteCharAt(i - 1);
                }
            }
        }
        StringBuilder secretCode = transform(secretCodeResult, secretCodeLength);
        int turns = 0;
        boolean guessed = false;
//      System.out.println(secretCode);
        while (!guessed) {
            turns++;
            System.out.println("Turn " + turns + ":");
            String guess = scanner.next();
            printGrade(bulls, cows, String.valueOf(secretCode), guess);
            if (guess.contentEquals(secretCode)) {
                guessed = true;
            }
        }
        System.out.println("Congratulations! You guessed the secret code.");
    }

    public static StringBuilder generateCode(int secretCodeLength, int numberOfPossibleSymbols, String possibleSymbols) {
        StringBuilder secretCodeResult = new StringBuilder(secretCodeLength);
//        int pseudoRandomNumber = (int)(Math.random() * 100 + 1);
//        String pseudoRandomNumberStr = String.valueOf(pseudoRandomNumber);
        Random random = new Random();
        String pseudoRandomNumberStr = "";
        for (int i = 0; i < secretCodeLength; i++) {
            pseudoRandomNumberStr = String.valueOf(possibleSymbols.charAt(random.nextInt(numberOfPossibleSymbols)));
        }
        char[] secretCodeArr = pseudoRandomNumberStr.toCharArray();
        for (int i = secretCodeArr.length - 1; i >= 0; i--) {
            if (!exists(secretCodeResult, secretCodeArr[i])) {
                secretCodeResult.append(secretCodeArr[i]);
            }
        }
        for (int i = 0; i < secretCodeResult.length(); i++) {
//            if (secretCodeResult.charAt(0) == '0') {
//                secretCodeResult.deleteCharAt(0);
//            }
            for (int j = 1; j < secretCodeResult.length(); j++) {
                if (secretCodeArr[i] == secretCodeArr[j]) {
                    secretCodeResult.deleteCharAt(j);
                }
            }
        }
        return secretCodeResult;
    }

    public static boolean exists(StringBuilder secretCodeArr, char val) {
        boolean b = false;
        for (int i = 0; i < secretCodeArr.length(); i++) {
            if (secretCodeArr.charAt(i) == val) {
                b = true;
                break;
            }
        }
        return b;
    }

    public static StringBuilder transform(StringBuilder oldSB, int secretCodeLength) {
        char[] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        StringBuilder sb = new StringBuilder(secretCodeLength);
        for (int i = 0; i < secretCodeLength; i++) {
            if (!exists(sb, oldSB.charAt(i))) {
                sb.append(oldSB.charAt(i));
            }
        }
        for (int i = 0; i < secretCodeLength - sb.length(); i++) {
            if (!exists(sb, digits[i])) {
                sb.append(digits[i]);
            }
        }
        return sb;
    }
}
