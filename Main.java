package numbers;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
//        write your code here
        String number;
        System.out.println("Welcome to Amazing Numbers!");
        Properties.printInstruction();
        Scanner scanner = new Scanner(System.in);
        do {

            System.out.print("\nEnter a request: ");
            number = scanner.nextLine();
            if (!number.contains(" ")) {
                if (number.equals("") || number.equals(" ")) {

                    Properties.printInstruction();
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

                Properties.printOneParNumProperties(number);
            } else {
                String[] numArr = number.split(" ");
                if (numArr.length == 2) {

                    if (!numArr[0].matches("[0-9]+")) {

                        System.out.println("The first parameter should be a natural number or zero.");
                        continue;
                    } else if (!numArr[1].matches("[0-9]+")) {

                        System.out.println("second parameter should be a natural number");
                        continue;
                    }
                    Properties.defineTwoParNum(numArr);
                } else if (numArr.length == 3) {

                    if (!numArr[0].matches("[0-9]+")) {

                        System.out.println("The first parameter should be a natural number or zero.");
                        continue;
                    } else if (!numArr[1].matches("[0-9]+")) {

                        System.out.println("second parameter should be a natural number");
                        continue;
                    } else {

                        String[] propertyNames = {"buzz", "duck", "palindromic", "gapful", "spy", "even", "odd"};
                        String text = String.format("The property [%s] is wrong.\n" +
                                "Available properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, EVEN, ODD]", numArr[2].toUpperCase());
                        String numArr2Up = numArr[2].toLowerCase();
                        for (String s : propertyNames) {

                            if (numArr2Up.equals(s)) {

                                Properties.twoNumSearch(numArr);
                                text = "";
                                break;
                            }

                        }
                        System.out.print(text);
                    }
                }
            }
        }while (!number.equals("0"));
    }
}