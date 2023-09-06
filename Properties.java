package numbers;

import java.util.HashSet;
import java.util.Set;

public class Properties {
    static String[] propertyNames = {"buzz", "duck", "palindromic", "gapful", "spy", "even", "odd", "square", "sunny", "jumping", "happy", "sad",
            "-buzz", "-duck", "-palindromic", "-gapful", "-spy", "-even", "-odd", "-square", "-sunny", "-jumping", "-happy", "-sad"};
    static String availableProperties = "Available properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, EVEN, ODD, SQUARE, SUNNY, JUMPING, HAPPY, SAD]";
    static void printInstruction() {

        System.out.println("""

                Supported requests:
                - enter a natural number to know its properties;
                - enter two natural numbers to obtain the properties of the list:
                  * the first parameter represents a starting number;
                  * the second parameters show how many consecutive numbers are to be processed;
                - two natural numbers and two properties to search for;
                - separate the parameters with one space;
                - enter 0 to exit.""");
    }
    static void onlyOneParNum(String number) {

        System.out.printf("%nProperties of %s%n" +
                        "even: %b%n" +
                        "odd: %b%n" +
                        "buzz: %b%n" +
                        "duck: %b%n" +
                        "palindromic: %b%n" +
                        "gapful: %b%n" +
                        "spy: %b%n" +
                        "square: %b%n" +
                        "sunny: %b%n" +
                        "jumping: %b%n" +
                        "happy: %b%n" +
                        "sad: %b%n", number, isEven(number), isOdd(number),
                isBuzz(number), isDuck(number), isPalindromic(number), isGapful(number), isSpy(number),
                isSquare(number), isSunny(number), isJumping(number), isHappy(number), isSad(number));
    }
    static void onlyTwoParNum(String[] numArr) {

        Long firstPar = Long.parseLong(numArr[0]);
        Long secondPar = Long.parseLong(numArr[1]);
        int counter = 1;
        while (counter <= secondPar) {
            String firstParStr = String.valueOf(firstPar);
            StringBuilder stringBuilder = new StringBuilder();
            sbAndProperties(stringBuilder, firstParStr);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            System.out.printf("%s is %s%n", firstParStr, stringBuilder);
            counter++;
            firstPar += 1;
        }
    }
    static void twoNumSearchOneWord(String[] numArr) {

        Long firstPar = Long.parseLong(numArr[0]);
        Long secondPar = Long.parseLong(numArr[1]);
        int counter = 1;
        while (counter <= secondPar) {
            String firstParStr = String.valueOf(firstPar);
            StringBuilder stringBuilder = new StringBuilder();
            sbAndProperties(stringBuilder, firstParStr);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            if (numArr[2].charAt(0) == '-') {
                String num2 = numArr[2].substring(1);
                if (!HelpSearching.checkForSpecificStringWhileSearching(num2, stringBuilder)) {
                    System.out.printf("%s is %s%n", firstParStr, stringBuilder);
                    counter++;
                }
            } else {
                if (HelpSearching.checkForSpecificStringWhileSearching(numArr[2], stringBuilder)) {
                    System.out.printf("%s is %s%n", firstParStr, stringBuilder);
                    counter++;
                }
            }
            firstPar += 1;
        }
    }
    static void twoNumSearchTwoWord(String[] numArr) {

        Long firstPar = Long.parseLong(numArr[0]);
        Long secondPar = Long.parseLong(numArr[1]);
        int counter = 1;
        while (counter <= secondPar) {
            String firstParStr = String.valueOf(firstPar);
            StringBuilder stringBuilder = new StringBuilder();
            sbAndProperties(stringBuilder, firstParStr);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            if (HelpSearching.checkForSpecificStringWhileSearching(numArr[2], stringBuilder) &&
                    HelpSearching.checkForSpecificStringWhileSearching(numArr[3], stringBuilder)) {
                System.out.printf("%s is %s%n", firstParStr, stringBuilder);
                counter++;
            }
            firstPar += 1;
        }
    }
    static void twoNumSearchThreeWord(String[] numArr) {

        Long firstPar = Long.parseLong(numArr[0]);
        Long secondPar = Long.parseLong(numArr[1]);
        int counter = 1;
        while (counter <= secondPar) {
            String firstParStr = String.valueOf(firstPar);
            StringBuilder stringBuilder = new StringBuilder();
            sbAndProperties(stringBuilder, firstParStr);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            if (HelpSearching.checkForSpecificStringWhileSearching(numArr[2], stringBuilder) &&
                    HelpSearching.checkForSpecificStringWhileSearching(numArr[3], stringBuilder) &&
                    HelpSearching.checkForSpecificStringWhileSearching(numArr[4], stringBuilder)) {
                System.out.printf("%s is %s%n", firstParStr, stringBuilder);
                counter++;
            }
            firstPar += 1;
        }
    }
    static void twoNumSearchFourWord(String[] numArr) {

        Long firstPar = Long.parseLong(numArr[0]);
        Long secondPar = Long.parseLong(numArr[1]);
        int counter = 1;
        while (counter <= secondPar) {
            String firstParStr = String.valueOf(firstPar);
            StringBuilder stringBuilder = new StringBuilder();
            sbAndProperties(stringBuilder, firstParStr);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            if (HelpSearching.checkForSpecificStringWhileSearching(numArr[2], stringBuilder) &&
                    HelpSearching.checkForSpecificStringWhileSearching(numArr[3], stringBuilder) &&
                    HelpSearching.checkForSpecificStringWhileSearching(numArr[4], stringBuilder) &&
                    HelpSearching.checkForSpecificStringWhileSearching(numArr[5], stringBuilder)) {
                System.out.printf("%s is %s%n", firstParStr, stringBuilder);
                counter++;
            }
            firstPar += 1;
        }
    }
    static void twoNumSearchFiveWord(String[] numArr) {

        Long firstPar = Long.parseLong(numArr[0]);
        Long secondPar = Long.parseLong(numArr[1]);
        int counter = 1;
        while (counter <= secondPar) {
            String firstParStr = String.valueOf(firstPar);
            StringBuilder stringBuilder = new StringBuilder();
            sbAndProperties(stringBuilder, firstParStr);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            if (HelpSearching.checkForSpecificStringWhileSearching(numArr[2], stringBuilder) &&
                    HelpSearching.checkForSpecificStringWhileSearching(numArr[3], stringBuilder) &&
                    HelpSearching.checkForSpecificStringWhileSearching(numArr[4], stringBuilder) &&
                    HelpSearching.checkForSpecificStringWhileSearching(numArr[5], stringBuilder) &&
                    HelpSearching.checkForSpecificStringWhileSearching(numArr[6], stringBuilder)) {
                System.out.printf("%s is %s%n", firstParStr, stringBuilder);
                counter++;
            }
            firstPar += 1;
        }
    }
    static void twoNumSearchSixWord(String[] numArr) {

        Long firstPar = Long.parseLong(numArr[0]);
        Long secondPar = Long.parseLong(numArr[1]);
        int counter = 1;
        while (counter <= secondPar) {
            String firstParStr = String.valueOf(firstPar);
            StringBuilder stringBuilder = new StringBuilder();
            sbAndProperties(stringBuilder, firstParStr);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            if (HelpSearching.checkForSpecificStringWhileSearching(numArr[2], stringBuilder) &&
                    HelpSearching.checkForSpecificStringWhileSearching(numArr[3], stringBuilder) &&
                    HelpSearching.checkForSpecificStringWhileSearching(numArr[4], stringBuilder) &&
                    HelpSearching.checkForSpecificStringWhileSearching(numArr[5], stringBuilder) &&
                    HelpSearching.checkForSpecificStringWhileSearching(numArr[6], stringBuilder) &&
                    HelpSearching.checkForSpecificStringWhileSearching(numArr[7], stringBuilder)) {
                System.out.printf("%s is %s%n", firstParStr, stringBuilder);
                counter++;
            }
            firstPar += 1;
        }
    }
    static void twoNumSearchSevenWord(String[] numArr) {

        Long firstPar = Long.parseLong(numArr[0]);
        Long secondPar = Long.parseLong(numArr[1]);
        int counter = 1;
        while (counter <= secondPar) {
            String firstParStr = String.valueOf(firstPar);
            StringBuilder stringBuilder = new StringBuilder();
            sbAndProperties(stringBuilder, firstParStr);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            if (HelpSearching.checkForSpecificStringWhileSearching(numArr[2], stringBuilder) &&
                    HelpSearching.checkForSpecificStringWhileSearching(numArr[3], stringBuilder) &&
                    HelpSearching.checkForSpecificStringWhileSearching(numArr[4], stringBuilder) &&
                    HelpSearching.checkForSpecificStringWhileSearching(numArr[5], stringBuilder) &&
                    HelpSearching.checkForSpecificStringWhileSearching(numArr[6], stringBuilder) &&
                    HelpSearching.checkForSpecificStringWhileSearching(numArr[7], stringBuilder) &&
                    HelpSearching.checkForSpecificStringWhileSearching(numArr[8], stringBuilder)) {
                System.out.printf("%s is %s%n", firstParStr, stringBuilder);
                counter++;
            }
            firstPar += 1;
        }
    }
    static void twoNumSearchEightWord(String[] numArr) {

        Long firstPar = Long.parseLong(numArr[0]);
        Long secondPar = Long.parseLong(numArr[1]);
        int counter = 1;
        while (counter <= secondPar) {
            String firstParStr = String.valueOf(firstPar);
            StringBuilder stringBuilder = new StringBuilder();
            sbAndProperties(stringBuilder, firstParStr);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            if (HelpSearching.checkForSpecificStringWhileSearching(numArr[2], stringBuilder) &&
                    HelpSearching.checkForSpecificStringWhileSearching(numArr[3], stringBuilder) &&
                    HelpSearching.checkForSpecificStringWhileSearching(numArr[4], stringBuilder) &&
                    HelpSearching.checkForSpecificStringWhileSearching(numArr[5], stringBuilder) &&
                    HelpSearching.checkForSpecificStringWhileSearching(numArr[6], stringBuilder) &&
                    HelpSearching.checkForSpecificStringWhileSearching(numArr[7], stringBuilder) &&
                    HelpSearching.checkForSpecificStringWhileSearching(numArr[8], stringBuilder) &&
                    HelpSearching.checkForSpecificStringWhileSearching(numArr[9], stringBuilder)) {
                System.out.printf("%s is %s%n", firstParStr, stringBuilder);
                counter++;
            }
            firstPar += 1;
        }
    }
    static void twoNumSearchNineWord(String[] numArr) {

        Long firstPar = Long.parseLong(numArr[0]);
        Long secondPar = Long.parseLong(numArr[1]);
        int counter = 1;
        while (counter <= secondPar) {
            String firstParStr = String.valueOf(firstPar);
            StringBuilder stringBuilder = new StringBuilder();
            sbAndProperties(stringBuilder, firstParStr);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            if (HelpSearching.checkForSpecificStringWhileSearching(numArr[2], stringBuilder) &&
                    HelpSearching.checkForSpecificStringWhileSearching(numArr[3], stringBuilder) &&
                    HelpSearching.checkForSpecificStringWhileSearching(numArr[4], stringBuilder) &&
                    HelpSearching.checkForSpecificStringWhileSearching(numArr[5], stringBuilder) &&
                    HelpSearching.checkForSpecificStringWhileSearching(numArr[6], stringBuilder) &&
                    HelpSearching.checkForSpecificStringWhileSearching(numArr[7], stringBuilder) &&
                    HelpSearching.checkForSpecificStringWhileSearching(numArr[8], stringBuilder) &&
                    HelpSearching.checkForSpecificStringWhileSearching(numArr[9], stringBuilder) &&
                    HelpSearching.checkForSpecificStringWhileSearching(numArr[10], stringBuilder)) {
                System.out.printf("%s is %s%n", firstParStr, stringBuilder);
                counter++;
            }
            firstPar += 1;
        }
    }
    static void twoNumSearchTenWord(String[] numArr) {

        Long firstPar = Long.parseLong(numArr[0]);
        Long secondPar = Long.parseLong(numArr[1]);
        int counter = 1;
        while (counter <= secondPar) {
            String firstParStr = String.valueOf(firstPar);
            StringBuilder stringBuilder = new StringBuilder();
            sbAndProperties(stringBuilder, firstParStr);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            if (HelpSearching.checkForSpecificStringWhileSearching(numArr[2], stringBuilder) &&
                    HelpSearching.checkForSpecificStringWhileSearching(numArr[3], stringBuilder) &&
                    HelpSearching.checkForSpecificStringWhileSearching(numArr[4], stringBuilder) &&
                    HelpSearching.checkForSpecificStringWhileSearching(numArr[5], stringBuilder) &&
                    HelpSearching.checkForSpecificStringWhileSearching(numArr[6], stringBuilder) &&
                    HelpSearching.checkForSpecificStringWhileSearching(numArr[7], stringBuilder) &&
                    HelpSearching.checkForSpecificStringWhileSearching(numArr[8], stringBuilder) &&
                    HelpSearching.checkForSpecificStringWhileSearching(numArr[9], stringBuilder) &&
                    HelpSearching.checkForSpecificStringWhileSearching(numArr[10], stringBuilder) &&
                    HelpSearching.checkForSpecificStringWhileSearching(numArr[11], stringBuilder)) {
                System.out.printf("%s is %s%n", firstParStr, stringBuilder);
                counter++;
            }
            firstPar += 1;
        }
    }
    static boolean isEven(String number) {

        long evenOddNum = Long.parseLong(number);
        return evenOddNum % 2 == 0;
    }
    static boolean isOdd(String number) {

        long evenOddNum = Long.parseLong(number);
        return evenOddNum % 2 != 0;
    }
    static boolean isBuzz(String number) {

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
    static boolean isDuck(String number) {

        boolean result = false;

        for (int i = 1; i < number.length(); i++) {

            result = number.charAt(i) == '0';
            if (result) {

                break;
            }
        }
        return result;
    }
    static boolean isPalindromic(String number) {

        boolean result = true;
        for (int i = 0; i < number.length() / 2; i++) {

            if (number.charAt(i) != number.charAt(number.length() - 1 - i)) {

                result = false;
                break;
            }
        }
        return result;
    }
    static boolean isGapful(String number) {

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
    static boolean isSpy(String number) {

        int sum = 0;
        int product = 1;
        for (int i = 0; i < number.length(); i++) {

            sum += Integer.parseInt(String.valueOf(number.charAt(i)));
            product *= Integer.parseInt(String.valueOf(number.charAt(i)));
        }

        return sum == product;
    }
    static boolean isSquare(String number) {

        boolean result = false;
        long numInt = Long.parseLong(number);
        long sqrtResult = (long) Math.sqrt(numInt);
        result = sqrtResult * sqrtResult == numInt;
        return result;
    }
    static boolean isSunny(String number) {

        boolean result = false;
        long numLong = Long.parseLong(number);
        long possibleSquareLong = numLong + 1;
        String possibleSquareStr = Long.toString(possibleSquareLong);
        result = isSquare(possibleSquareStr);
        return result;
    }
    static boolean isJumping(String number) {

        boolean result = true;
        for (int i = 0; i < number.length() - 1; i++) {

            int one = Character.getNumericValue(number.charAt(i));
            int two = Character.getNumericValue(number.charAt(i + 1));
            if (!(Math.abs(one - two) == 1)) {

                result = false;
                break;
            }
        }
        return result;
    }
    static boolean isHappy(String number1) {
        int number = Integer.parseInt(number1);
        Set<Integer> digits=new HashSet<Integer>();
        while(digits.add(number))
        {
            int result = 0;
            while(number > 0)
            {
                result += Math.pow(number % 10, 2);
                number = number/10;
            }
            number = result;
        }
        return number == 1;
    }
    static boolean isSad(String number1) {

        {
            int number = Integer.parseInt(number1);
            Set<Integer> digits=new HashSet<Integer>();
            while(digits.add(number))
            {
                int result = 0;
                while(number > 0)
                {
                    result += Math.pow(number % 10, 2);
                    number = number/10;
                }
                number = result;
            }
            return number != 1;
        }
    }
    static void sbAndProperties(StringBuilder stringBuilder, String firstParStr) {

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
        if (isSpy(firstParStr)) {
            stringBuilder.append("spy, ");
        }
        if (isSunny(firstParStr)) {
            stringBuilder.append("sunny, ");
        }
        if (isSquare(firstParStr)) {
            stringBuilder.append("square, ");
        }
        if (isJumping(firstParStr)) {
            stringBuilder.append("jumping, ");
        }
        if (isHappy(firstParStr)) {
            stringBuilder.append("happy, ");
        }
        if (isSad(firstParStr)) {
            stringBuilder.append("sad, ");
        }
    }
}
