package numbers;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//        write your code here
        String number;
        toWelcome();
        Scanner scanner = new Scanner(System.in);
        do {

            System.out.print("\nEnter a request: ");
            number = scanner.nextLine();

            if (!number.matches("[0-9]+")) {

                System.out.println("The first parameter should be a natural number or zero.");
                continue;
            }

            if (number.equals("0")) {

                System.out.println("\nGoodbye!");
                break;
            }

            System.out.printf("%nProperties of %s%n" +
                    "even: %b%n" +
                    "odd: %b%n" +
                    "buzz: %b%n" +
                    "duck: %b%n" +
                    "palindromic: %b%n", number, isEven(number), isOdd(number),
                    isBuzz(number), isDuck(number), isPalindromic(number));
        } while (!number.equals("0"));


    }

    private static void toWelcome() {

        System.out.print("Welcome to Amazing Numbers!\n" +
                "\n" +
                "Supported requests:\n" +
                "- enter a natural number to know its properties;\n" +
                "- enter 0 to exit.\n");
    }
    private static boolean isEven(String number) {

        long evenOddNum = Long.parseLong(number);
        return evenOddNum % 2 == 0;
    }

    private static boolean isOdd(String number) {

        long evenOddNum = Long.parseLong(number);
        return evenOddNum % 2 != 0;
    }

    private static boolean isBuzz(String number) {

        String[] numberArr = number.split("");
        long removedNum = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < numberArr.length; i++) {

            if (!(i == numberArr.length - 1)) {

                stringBuilder.append(numberArr[i]);
            } else {

                removedNum = Integer.parseInt(numberArr[i]);
            }
        }

        long result = removedNum;

        if (!stringBuilder.isEmpty()) {

            long remainingNum = Long.parseLong(stringBuilder.toString());
            result = remainingNum - (removedNum * 2);
        }

        String Buzzness;
        return result % 7 == 0 || removedNum == 7;
    }

    private static boolean isDuck(String number) {

        boolean result = false;

        for (int i = 1; i < number.length(); i++) {

            result = number.charAt(i) == '0';
            if (result) {

                break;
            }
        }
        return result;
    }

    private static boolean isPalindromic(String number) {

        boolean result = true;
        for (int i = 0; i < number.length() / 2; i++) {

            if (number.charAt(i) != number.charAt(number.length() - 1 - i)) {

                result = false;
                break;
            }
        }

        System.out.println();
        return result;
    }
}