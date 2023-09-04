package numbers;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
// Попробовать каждые введеные цифры = объекты
        // в зависимости от количество параметров сделать Method overloading
        // в каждом объекте сделать чек на возможные ошибки
        String number = null;
        System.out.println("Welcome to Amazing Numbers!");
        Properties.printInstruction();
        Scanner scanner = new Scanner(System.in);
        doWhilePart(number, scanner);
    }
    
    static void doWhilePart(String number, Scanner scanner) {

        do {
            System.out.print("\nEnter a request: ");
            number = scanner.nextLine();
            if (!number.contains(" ")) {
                if (number.equals("")) {

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

                Properties.onlyOneParNum(number);
            } else {
                String[] numArr = number.split(" ");
                if (numArr.length == 2) {

                    if (!numArr[0].matches("[0-9]+")) {

                        System.out.println("The first parameter should be a natural number or zero.");
                        continue;
                    } else if (!numArr[1].matches("[0-9]+")) {

                        System.out.println("The second parameter should be a natural number");
                        continue;
                    }
                    Properties.onlyTwoParNum(numArr);
                } else if (numArr.length == 3) {

                    if (!numArr[0].matches("[0-9]+")) {

                        System.out.println("The first parameter should be a natural number or zero.");
                        continue;
                    } else if (!numArr[1].matches("[0-9]+")) {

                        System.out.println("The second parameter should be a natural number");
                        continue;
                    } else {

                        String text = String.format("The property [%s] is wrong.\n" + Properties.availableProperties, numArr[2].toUpperCase());
                        String numArr2Up = numArr[2].toLowerCase();
                        for (String s : Properties.propertyNames) {

                            if (numArr2Up.equals(s)) {

                                Properties.twoNumSearchOneWord(numArr);
                                text = "";
                                break;
                            }

                        }
                        System.out.print(text);
                    }
                } else if (numArr.length == 4) {

                    if (!numArr[0].matches("[0-9]+")) {

                        System.out.println("The first parameter should be a natural number or zero.");
                        continue;
                    } else if (!numArr[1].matches("[0-9]+")) {

                        System.out.println("The second parameter should be a natural number");
                        continue;
                    } else {

                        if (!HelpSearching.checkForForthElement(Properties.propertyNames, numArr[2]) && !HelpSearching.checkForForthElement(Properties.propertyNames, numArr[3])) {

                            System.out.printf("The properties [%s, %s] are wrong.\n" + Properties.availableProperties, numArr[2].toUpperCase(), numArr[3].toUpperCase());
                        } else if (!HelpSearching.checkForForthElement(Properties.propertyNames, numArr[2])) {

                            System.out.printf("The property [%s] is wrong.\n" + Properties.availableProperties, numArr[2].toUpperCase());
                        } else if (!HelpSearching.checkForForthElement(Properties.propertyNames, numArr[3])) {

                            System.out.printf("The property [%s] is wrong.\n" + Properties.availableProperties, numArr[3].toUpperCase());
                        }

                        if (("even".equalsIgnoreCase(numArr[2]) && "odd".equalsIgnoreCase(numArr[3])) ||
                                ("odd".equalsIgnoreCase(numArr[2]) && "even".equalsIgnoreCase(numArr[3])) ||
                                ("square".equalsIgnoreCase(numArr[2]) && "sunny".equalsIgnoreCase(numArr[3])) ||
                                ("sunny".equalsIgnoreCase(numArr[2]) && "square".equalsIgnoreCase(numArr[3])) ||
                                ("spy".equalsIgnoreCase(numArr[2]) && "duck".equalsIgnoreCase(numArr[3])) ||
                                ("duck".equalsIgnoreCase(numArr[2]) && "spy".equalsIgnoreCase(numArr[3]))) {

                            String textMutuality = String.format("The request contains mutually exclusive properties: [%s, %s]\n" +
                                    "There are no numbers with these properties.\n", numArr[2].toUpperCase(), numArr[3].toUpperCase());
                            System.out.println(textMutuality);
                            continue;
                        }

                        String numArr2Up = numArr[2].toLowerCase();
                        String numArr3Up = numArr[3].toLowerCase();
                        boolean result1 = false;
                        boolean result2 = false;
                        for (String s : Properties.propertyNames) {
                            if (numArr2Up.equals(s)) {
                                result1 = true;
                                break;
                            }
                        }

                        for (String s : Properties.propertyNames) {
                            if (numArr3Up.equals(s)) {
                                result2 = true;
                                break;
                            }
                        }

                        if (result1 && result2) {
                            Properties.twoNumSearchTwoWord(numArr);
                        }
                    }
                } else if (numArr.length == 5) {


                }
            }
        } while (!number.equals("0"));
    }
}