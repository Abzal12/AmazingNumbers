package numbers;

public class Errors {

    static boolean errorTwoParsPlusProperties(String[] numArr) {

        boolean error = true;
        switch (numArr.length) {
            case 3 -> {
                if (!HelpSearching.checkForForthElement(Properties.propertyNames, numArr[2])) {

                    String text = String.format("The property [%s] is wrong.\n" + Properties.availableProperties, numArr[2].toUpperCase());
                } else  {

                    error = false;
                }
            }
            case 4 -> {
                if (!HelpSearching.checkForForthElement(Properties.propertyNames, numArr[2])
                        && !HelpSearching.checkForForthElement(Properties.propertyNames, numArr[3])) {

                    System.out.printf("The properties [%s, %s] are wrong.\n" + Properties.availableProperties,
                            numArr[2].toUpperCase(), numArr[3].toUpperCase());
                } else if (!HelpSearching.checkForForthElement(Properties.propertyNames, numArr[2])) {

                    System.out.printf("The property [%s] is wrong.\n" + Properties.availableProperties, numArr[2].toUpperCase());
                } else if (!HelpSearching.checkForForthElement(Properties.propertyNames, numArr[3])) {

                    System.out.printf("The property [%s] is wrong.\n" + Properties.availableProperties, numArr[3].toUpperCase());
                } else {

                    error = false;
                }
            }
            case 5 -> {
                if (!HelpSearching.checkForForthElement(Properties.propertyNames, numArr[2])
                        && !HelpSearching.checkForForthElement(Properties.propertyNames, numArr[3])
                        && !HelpSearching.checkForForthElement(Properties.propertyNames, numArr[4])) {

                    System.out.printf("The properties [%s, %s, %s] are wrong.\n" + Properties.availableProperties,
                            numArr[2].toUpperCase(), numArr[3].toUpperCase(), numArr[4].toUpperCase());
                } else if (!HelpSearching.checkForForthElement(Properties.propertyNames, numArr[2])) {

                    System.out.printf("The property [%s] is wrong.\n" + Properties.availableProperties, numArr[2].toUpperCase());
                } else if (!HelpSearching.checkForForthElement(Properties.propertyNames, numArr[3])) {

                    System.out.printf("The property [%s] is wrong.\n" + Properties.availableProperties, numArr[3].toUpperCase());
                } else if (!HelpSearching.checkForForthElement(Properties.propertyNames, numArr[4])) {

                    System.out.printf("The property [%s] is wrong.\n" + Properties.availableProperties, numArr[4].toUpperCase());
                } else {

                    error = false;
                }
            }
            case 6 -> {
                if (!HelpSearching.checkForForthElement(Properties.propertyNames, numArr[2])
                        && !HelpSearching.checkForForthElement(Properties.propertyNames, numArr[3])
                        && !HelpSearching.checkForForthElement(Properties.propertyNames, numArr[4])
                        && !HelpSearching.checkForForthElement(Properties.propertyNames, numArr[5])) {

                    System.out.printf("The properties [%s, %s, %s, %s] are wrong.\n" + Properties.availableProperties,
                            numArr[2].toUpperCase(), numArr[3].toUpperCase(), numArr[4].toUpperCase(),
                            numArr[5].toUpperCase());
                } else if (!HelpSearching.checkForForthElement(Properties.propertyNames, numArr[2])) {

                    System.out.printf("The property [%s] is wrong.\n" + Properties.availableProperties, numArr[2].toUpperCase());
                } else if (!HelpSearching.checkForForthElement(Properties.propertyNames, numArr[3])) {

                    System.out.printf("The property [%s] is wrong.\n" + Properties.availableProperties, numArr[3].toUpperCase());
                } else if (!HelpSearching.checkForForthElement(Properties.propertyNames, numArr[4])) {

                    System.out.printf("The property [%s] is wrong.\n" + Properties.availableProperties, numArr[4].toUpperCase());
                } else if (!HelpSearching.checkForForthElement(Properties.propertyNames, numArr[5])) {

                    System.out.printf("The property [%s] is wrong.\n" + Properties.availableProperties, numArr[5].toUpperCase());
                } else {

                    error = false;
                }
            }
            case 7 -> {
                if (!HelpSearching.checkForForthElement(Properties.propertyNames, numArr[2])
                        && !HelpSearching.checkForForthElement(Properties.propertyNames, numArr[3])
                        && !HelpSearching.checkForForthElement(Properties.propertyNames, numArr[4])
                        && !HelpSearching.checkForForthElement(Properties.propertyNames, numArr[5])
                        && !HelpSearching.checkForForthElement(Properties.propertyNames, numArr[6])) {

                    System.out.printf("The properties [%s, %s, %s, %s] are wrong.\n" + Properties.availableProperties,
                            numArr[2].toUpperCase(), numArr[3].toUpperCase(), numArr[4].toUpperCase(),
                            numArr[5].toUpperCase(), numArr[6].toUpperCase());
                } else if (!HelpSearching.checkForForthElement(Properties.propertyNames, numArr[2])) {

                    System.out.printf("The property [%s] is wrong.\n" + Properties.availableProperties, numArr[2].toUpperCase());
                } else if (!HelpSearching.checkForForthElement(Properties.propertyNames, numArr[3])) {

                    System.out.printf("The property [%s] is wrong.\n" + Properties.availableProperties, numArr[3].toUpperCase());
                } else if (!HelpSearching.checkForForthElement(Properties.propertyNames, numArr[4])) {

                    System.out.printf("The property [%s] is wrong.\n" + Properties.availableProperties, numArr[4].toUpperCase());
                } else if (!HelpSearching.checkForForthElement(Properties.propertyNames, numArr[5])) {

                    System.out.printf("The property [%s] is wrong.\n" + Properties.availableProperties, numArr[5].toUpperCase());
                } else if (!HelpSearching.checkForForthElement(Properties.propertyNames, numArr[6])) {

                    System.out.printf("The property [%s] is wrong.\n" + Properties.availableProperties, numArr[6].toUpperCase());
                } else {

                    error = false;
                }
            }
            case 8 -> {
                if (!HelpSearching.checkForForthElement(Properties.propertyNames, numArr[2])
                        && !HelpSearching.checkForForthElement(Properties.propertyNames, numArr[3])
                        && !HelpSearching.checkForForthElement(Properties.propertyNames, numArr[4])
                        && !HelpSearching.checkForForthElement(Properties.propertyNames, numArr[5])
                        && !HelpSearching.checkForForthElement(Properties.propertyNames, numArr[6])
                        && !HelpSearching.checkForForthElement(Properties.propertyNames, numArr[7])) {

                    System.out.printf("The properties [%s, %s, %s, %s] are wrong.\n" + Properties.availableProperties,
                            numArr[2].toUpperCase(), numArr[3].toUpperCase(), numArr[4].toUpperCase(),
                            numArr[5].toUpperCase(), numArr[6].toUpperCase(), numArr[7].toUpperCase());
                } else if (!HelpSearching.checkForForthElement(Properties.propertyNames, numArr[2])) {

                    System.out.printf("The property [%s] is wrong.\n" + Properties.availableProperties, numArr[2].toUpperCase());
                } else if (!HelpSearching.checkForForthElement(Properties.propertyNames, numArr[3])) {

                    System.out.printf("The property [%s] is wrong.\n" + Properties.availableProperties, numArr[3].toUpperCase());
                } else if (!HelpSearching.checkForForthElement(Properties.propertyNames, numArr[4])) {

                    System.out.printf("The property [%s] is wrong.\n" + Properties.availableProperties, numArr[4].toUpperCase());
                } else if (!HelpSearching.checkForForthElement(Properties.propertyNames, numArr[5])) {

                    System.out.printf("The property [%s] is wrong.\n" + Properties.availableProperties, numArr[5].toUpperCase());
                } else if (!HelpSearching.checkForForthElement(Properties.propertyNames, numArr[6])) {

                    System.out.printf("The property [%s] is wrong.\n" + Properties.availableProperties, numArr[6].toUpperCase());
                } else if (!HelpSearching.checkForForthElement(Properties.propertyNames, numArr[7])) {

                    System.out.printf("The property [%s] is wrong.\n" + Properties.availableProperties, numArr[7].toUpperCase());
                } else {

                    error = false;
                }
            }
            case 9 -> {
                if (!HelpSearching.checkForForthElement(Properties.propertyNames, numArr[2])
                        && !HelpSearching.checkForForthElement(Properties.propertyNames, numArr[3])
                        && !HelpSearching.checkForForthElement(Properties.propertyNames, numArr[4])
                        && !HelpSearching.checkForForthElement(Properties.propertyNames, numArr[5])
                        && !HelpSearching.checkForForthElement(Properties.propertyNames, numArr[6])
                        && !HelpSearching.checkForForthElement(Properties.propertyNames, numArr[7])
                        && !HelpSearching.checkForForthElement(Properties.propertyNames, numArr[8])) {

                    System.out.printf("The properties [%s, %s, %s, %s] are wrong.\n" + Properties.availableProperties,
                            numArr[2].toUpperCase(), numArr[3].toUpperCase(), numArr[4].toUpperCase(),
                            numArr[5].toUpperCase(), numArr[6].toUpperCase(), numArr[7].toUpperCase(),
                            numArr[8].toUpperCase());
                } else if (!HelpSearching.checkForForthElement(Properties.propertyNames, numArr[2])) {

                    System.out.printf("The property [%s] is wrong.\n" + Properties.availableProperties, numArr[2].toUpperCase());
                } else if (!HelpSearching.checkForForthElement(Properties.propertyNames, numArr[3])) {

                    System.out.printf("The property [%s] is wrong.\n" + Properties.availableProperties, numArr[3].toUpperCase());
                } else if (!HelpSearching.checkForForthElement(Properties.propertyNames, numArr[4])) {

                    System.out.printf("The property [%s] is wrong.\n" + Properties.availableProperties, numArr[4].toUpperCase());
                } else if (!HelpSearching.checkForForthElement(Properties.propertyNames, numArr[5])) {

                    System.out.printf("The property [%s] is wrong.\n" + Properties.availableProperties, numArr[5].toUpperCase());
                } else if (!HelpSearching.checkForForthElement(Properties.propertyNames, numArr[6])) {

                    System.out.printf("The property [%s] is wrong.\n" + Properties.availableProperties, numArr[6].toUpperCase());
                } else if (!HelpSearching.checkForForthElement(Properties.propertyNames, numArr[7])) {

                    System.out.printf("The property [%s] is wrong.\n" + Properties.availableProperties, numArr[7].toUpperCase());
                } else if (!HelpSearching.checkForForthElement(Properties.propertyNames, numArr[8])) {

                    System.out.printf("The property [%s] is wrong.\n" + Properties.availableProperties, numArr[8].toUpperCase());
                } else {

                    error = false;
                }
            }
            case 10 -> {
                if (!HelpSearching.checkForForthElement(Properties.propertyNames, numArr[2])
                        && !HelpSearching.checkForForthElement(Properties.propertyNames, numArr[3])
                        && !HelpSearching.checkForForthElement(Properties.propertyNames, numArr[4])
                        && !HelpSearching.checkForForthElement(Properties.propertyNames, numArr[5])
                        && !HelpSearching.checkForForthElement(Properties.propertyNames, numArr[6])
                        && !HelpSearching.checkForForthElement(Properties.propertyNames, numArr[7])
                        && !HelpSearching.checkForForthElement(Properties.propertyNames, numArr[8])
                        && !HelpSearching.checkForForthElement(Properties.propertyNames, numArr[9])) {

                    System.out.printf("The properties [%s, %s, %s, %s] are wrong.\n" + Properties.availableProperties,
                            numArr[2].toUpperCase(), numArr[3].toUpperCase(), numArr[4].toUpperCase(),
                            numArr[5].toUpperCase(), numArr[6].toUpperCase(), numArr[7].toUpperCase(),
                            numArr[8].toUpperCase(), numArr[9].toUpperCase());
                } else if (!HelpSearching.checkForForthElement(Properties.propertyNames, numArr[2])) {

                    System.out.printf("The property [%s] is wrong.\n" + Properties.availableProperties, numArr[2].toUpperCase());
                } else if (!HelpSearching.checkForForthElement(Properties.propertyNames, numArr[3])) {

                    System.out.printf("The property [%s] is wrong.\n" + Properties.availableProperties, numArr[3].toUpperCase());
                } else if (!HelpSearching.checkForForthElement(Properties.propertyNames, numArr[4])) {

                    System.out.printf("The property [%s] is wrong.\n" + Properties.availableProperties, numArr[4].toUpperCase());
                } else if (!HelpSearching.checkForForthElement(Properties.propertyNames, numArr[5])) {

                    System.out.printf("The property [%s] is wrong.\n" + Properties.availableProperties, numArr[5].toUpperCase());
                } else if (!HelpSearching.checkForForthElement(Properties.propertyNames, numArr[6])) {

                    System.out.printf("The property [%s] is wrong.\n" + Properties.availableProperties, numArr[6].toUpperCase());
                } else if (!HelpSearching.checkForForthElement(Properties.propertyNames, numArr[7])) {

                    System.out.printf("The property [%s] is wrong.\n" + Properties.availableProperties, numArr[7].toUpperCase());
                } else if (!HelpSearching.checkForForthElement(Properties.propertyNames, numArr[8])) {

                    System.out.printf("The property [%s] is wrong.\n" + Properties.availableProperties, numArr[8].toUpperCase());
                } else if (!HelpSearching.checkForForthElement(Properties.propertyNames, numArr[9])) {

                    System.out.printf("The property [%s] is wrong.\n" + Properties.availableProperties, numArr[9].toUpperCase());
                } else {

                    error = false;
                }
            }
            case 11 -> {
                if (!HelpSearching.checkForForthElement(Properties.propertyNames, numArr[2])
                        && !HelpSearching.checkForForthElement(Properties.propertyNames, numArr[3])
                        && !HelpSearching.checkForForthElement(Properties.propertyNames, numArr[4])
                        && !HelpSearching.checkForForthElement(Properties.propertyNames, numArr[5])
                        && !HelpSearching.checkForForthElement(Properties.propertyNames, numArr[6])
                        && !HelpSearching.checkForForthElement(Properties.propertyNames, numArr[7])
                        && !HelpSearching.checkForForthElement(Properties.propertyNames, numArr[8])
                        && !HelpSearching.checkForForthElement(Properties.propertyNames, numArr[9])
                        && !HelpSearching.checkForForthElement(Properties.propertyNames, numArr[10])) {

                    System.out.printf("The properties [%s, %s, %s, %s] are wrong.\n" + Properties.availableProperties,
                            numArr[2].toUpperCase(), numArr[3].toUpperCase(), numArr[4].toUpperCase(),
                            numArr[5].toUpperCase(), numArr[6].toUpperCase(), numArr[7].toUpperCase(),
                            numArr[8].toUpperCase(), numArr[9].toUpperCase(), numArr[10].toUpperCase());
                } else if (!HelpSearching.checkForForthElement(Properties.propertyNames, numArr[2])) {

                    System.out.printf("The property [%s] is wrong.\n" + Properties.availableProperties, numArr[2].toUpperCase());
                } else if (!HelpSearching.checkForForthElement(Properties.propertyNames, numArr[3])) {

                    System.out.printf("The property [%s] is wrong.\n" + Properties.availableProperties, numArr[3].toUpperCase());
                } else if (!HelpSearching.checkForForthElement(Properties.propertyNames, numArr[4])) {

                    System.out.printf("The property [%s] is wrong.\n" + Properties.availableProperties, numArr[4].toUpperCase());
                } else if (!HelpSearching.checkForForthElement(Properties.propertyNames, numArr[5])) {

                    System.out.printf("The property [%s] is wrong.\n" + Properties.availableProperties, numArr[5].toUpperCase());
                } else if (!HelpSearching.checkForForthElement(Properties.propertyNames, numArr[6])) {

                    System.out.printf("The property [%s] is wrong.\n" + Properties.availableProperties, numArr[6].toUpperCase());
                } else if (!HelpSearching.checkForForthElement(Properties.propertyNames, numArr[7])) {

                    System.out.printf("The property [%s] is wrong.\n" + Properties.availableProperties, numArr[7].toUpperCase());
                } else if (!HelpSearching.checkForForthElement(Properties.propertyNames, numArr[8])) {

                    System.out.printf("The property [%s] is wrong.\n" + Properties.availableProperties, numArr[8].toUpperCase());
                } else if (!HelpSearching.checkForForthElement(Properties.propertyNames, numArr[9])) {

                    System.out.printf("The property [%s] is wrong.\n" + Properties.availableProperties, numArr[9].toUpperCase());
                } else if (!HelpSearching.checkForForthElement(Properties.propertyNames, numArr[10])) {

                    System.out.printf("The property [%s] is wrong.\n" + Properties.availableProperties, numArr[10].toUpperCase());
                } else {

                    error = false;
                }
            }
            case 12 -> {
                if (!HelpSearching.checkForForthElement(Properties.propertyNames, numArr[2])
                        && !HelpSearching.checkForForthElement(Properties.propertyNames, numArr[3])
                        && !HelpSearching.checkForForthElement(Properties.propertyNames, numArr[4])
                        && !HelpSearching.checkForForthElement(Properties.propertyNames, numArr[5])
                        && !HelpSearching.checkForForthElement(Properties.propertyNames, numArr[6])
                        && !HelpSearching.checkForForthElement(Properties.propertyNames, numArr[7])
                        && !HelpSearching.checkForForthElement(Properties.propertyNames, numArr[8])
                        && !HelpSearching.checkForForthElement(Properties.propertyNames, numArr[9])
                        && !HelpSearching.checkForForthElement(Properties.propertyNames, numArr[10])
                        && !HelpSearching.checkForForthElement(Properties.propertyNames, numArr[11])) {

                    System.out.printf("The properties [%s, %s, %s, %s] are wrong.\n" + Properties.availableProperties,
                            numArr[2].toUpperCase(), numArr[3].toUpperCase(), numArr[4].toUpperCase(),
                            numArr[5].toUpperCase(), numArr[6].toUpperCase(), numArr[7].toUpperCase(),
                            numArr[8].toUpperCase(), numArr[9].toUpperCase(), numArr[10].toUpperCase(),
                            numArr[11].toUpperCase());
                } else if (!HelpSearching.checkForForthElement(Properties.propertyNames, numArr[2])) {

                    System.out.printf("The property [%s] is wrong.\n" + Properties.availableProperties, numArr[2].toUpperCase());
                } else if (!HelpSearching.checkForForthElement(Properties.propertyNames, numArr[3])) {

                    System.out.printf("The property [%s] is wrong.\n" + Properties.availableProperties, numArr[3].toUpperCase());
                } else if (!HelpSearching.checkForForthElement(Properties.propertyNames, numArr[4])) {

                    System.out.printf("The property [%s] is wrong.\n" + Properties.availableProperties, numArr[4].toUpperCase());
                } else if (!HelpSearching.checkForForthElement(Properties.propertyNames, numArr[5])) {

                    System.out.printf("The property [%s] is wrong.\n" + Properties.availableProperties, numArr[5].toUpperCase());
                } else if (!HelpSearching.checkForForthElement(Properties.propertyNames, numArr[6])) {

                    System.out.printf("The property [%s] is wrong.\n" + Properties.availableProperties, numArr[6].toUpperCase());
                } else if (!HelpSearching.checkForForthElement(Properties.propertyNames, numArr[7])) {

                    System.out.printf("The property [%s] is wrong.\n" + Properties.availableProperties, numArr[7].toUpperCase());
                } else if (!HelpSearching.checkForForthElement(Properties.propertyNames, numArr[8])) {

                    System.out.printf("The property [%s] is wrong.\n" + Properties.availableProperties, numArr[8].toUpperCase());
                } else if (!HelpSearching.checkForForthElement(Properties.propertyNames, numArr[9])) {

                    System.out.printf("The property [%s] is wrong.\n" + Properties.availableProperties, numArr[9].toUpperCase());
                } else if (!HelpSearching.checkForForthElement(Properties.propertyNames, numArr[10])) {

                    System.out.printf("The property [%s] is wrong.\n" + Properties.availableProperties, numArr[10].toUpperCase());
                } else if (!HelpSearching.checkForForthElement(Properties.propertyNames, numArr[11])) {

                    System.out.printf("The property [%s] is wrong.\n" + Properties.availableProperties, numArr[11].toUpperCase());
                } else {

                    error = false;
                }
            }
        }
        return error;
    }
    static boolean errorMutuality(String[] numArr) {

        boolean errorMutuality = true;
        if (contains(numArr, "even") && contains(numArr, "odd")) {

            System.out.println("The request contains mutually exclusive properties: [EVEN, ODD]\n" +
                    "There are no numbers with these properties.");
        } else if (contains(numArr, "square") && contains(numArr, "sunny")) {

            System.out.println("The request contains mutually exclusive properties: [SQUARE, SUNNY]\n" +
                    "There are no numbers with these properties.");
        } else if (contains(numArr, "spy") && contains(numArr, "duck")) {

            System.out.println("The request contains mutually exclusive properties: [SPY, DUCK]\n" +
                    "There are no numbers with these properties.");
        } else if (contains(numArr, "happy") && contains(numArr, "sad")) {

            System.out.println("The request contains mutually exclusive properties: [HAPPY, SAD]\n" +
                    "There are no numbers with these properties.");
        } else {

            errorMutuality = false;
        }
        return errorMutuality;
    }
    static boolean contains(String[] numArr, String str) {

        boolean contains = false;

        for (int i = 2; i < numArr.length; i++) {

            if (numArr[i].equals(str)) {

                contains = true;
                break;
            }
        }
        return contains;
    }
    static boolean errorNaturalNum(String[] numArr) {

        boolean error = true;
        if (!numArr[0].matches("[0-9]+")) {

            System.out.println("The first parameter should be a natural number or zero.");
        } else if (!numArr[1].matches("[0-9]+")) {

            System.out.println("The second parameter should be a natural number");
        } else {

            error = false;
        }
        return error;
    }
}
