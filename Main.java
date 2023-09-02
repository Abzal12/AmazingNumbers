package numbers;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//        write your code here
        String number;
        System.out.println("Welcome to Amazing Numbers!");
        printInstruction();
        Scanner scanner = new Scanner(System.in);
        do {

            System.out.print("\nEnter a request: ");
            number = scanner.nextLine();
            if (!number.contains(" ")) {
                if (number.equals("") || number.equals(" ")) {

                    printInstruction();
                    continue;
                }

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
                                "palindromic: %b%n" +
                                "gapful: %b%n", number, isEven(number), isOdd(number),
                        isBuzz(number), isDuck(number), isPalindromic(number), isGapful(number));
            } else {
                String[] numArr = number.split(" ");
                if (!numArr[0].matches("[0-9]+")) {

                    System.out.println("The first parameter should be a natural number or zero.");
                    continue;
                } else if (!numArr[1].matches("[0-9]+")) {

                    System.out.println("second parameter should be a natural number");
                    continue;
                }
                Long firstPar = Long.parseLong(numArr[0]);
                Long secondPar = Long.parseLong(numArr[1]);
                int counter = 1;
                while (counter <= secondPar) {

                    String firstParStr = String.valueOf(firstPar);
                    StringBuilder stringBuilder = new StringBuilder();
                    if (isBuzz(firstParStr)) {

                        stringBuilder.append("buzz, ");
                    }

                    if (isDuck(firstParStr)) {

                        stringBuilder.append("duck, ");
                    }

                    if (isPalindromic(firstParStr)) {

                        stringBuilder.append("palindromic, ");
                    }

                    if (isGapful(firstParStr)) {

                        stringBuilder.append("gapful, ");
                    }

                    if (isEven(firstParStr)) {

                        stringBuilder.append("even, ");
                    }

                    if (isOdd(firstParStr)) {

                        stringBuilder.append("odd, ");
                    }
                    stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                    stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                    System.out.printf("%s is %s%n", firstParStr, stringBuilder);

                    counter++;
                    firstPar += 1;
                }

            }

        } while (!number.equals("0"));


    }

    private static void printInstruction() {

        System.out.println("""

                Supported requests:
                - enter a natural number to know its properties;
                - enter two natural numbers to obtain the properties of the list:
                  * the first parameter represents a starting number;
                  * the second parameter shows how many consecutive numbers are to be processed;
                - separate the parameters with one space;
                - enter 0 to exit.""");
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
        return result;
    }

    private static boolean isGapful(String number) {

        boolean result = false;

        if (number.length() > 2) {

            String firstAndLastNums = String.valueOf(number.charAt(0)) + String.valueOf(number.charAt(number.length() - 1));

            long wholeNum = Long.parseLong(number);
            long firstLastInt = Long.parseLong(firstAndLastNums);

            if (wholeNum % firstLastInt == 0) {

                result = true;
            }
        }
        return result;
    }
}
