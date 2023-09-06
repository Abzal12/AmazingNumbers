package numbers;

import java.util.Scanner;

public class DoWhileClass {

    static void doWhilePart(String number, Scanner scanner) {

        do {
            System.out.print("\nEnter a request: ");
            number = scanner.nextLine();
            String[] numArr = number.split(" ");
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

                if (numArr.length == 2) {

                    if (Errors.errorNaturalNum(numArr)) {

                        continue;
                    }
                    Properties.onlyTwoParNum(numArr);
                } else if (numArr.length == 3) {

                    if (Errors.errorNaturalNum(numArr)) {

                        continue;
                    } else {

                        if (Errors.errorTwoParsPlusProperties(numArr)) {

                            continue;
                        };
                        String numArr2Up = numArr[2].toLowerCase();
                        for (String s : Properties.propertyNames) {

                            if (numArr2Up.equals(s)) {

                                Properties.twoNumSearchOneWord(numArr);
                            }
                        }
                    }
                }else if (numArr.length == 4) {

                    if (Errors.errorNaturalNum(numArr)) {

                        continue;
                    } else {

                        if (Errors.errorTwoParsPlusProperties(numArr)) {

                            continue;
                        };

                        if (Errors.errorMutuality(numArr)) {

                            continue;
                        }

                        Properties.twoNumSearchTwoWord(numArr);
                    }
                } else if (numArr.length == 5) {

                    if (Errors.errorNaturalNum(numArr)) {

                        continue;
                    } else {

                        if (Errors.errorTwoParsPlusProperties(numArr)) {

                            continue;
                        }

                        if (Errors.errorMutuality(numArr)) {

                            continue;
                        }
                        Properties.twoNumSearchThreeWord(numArr);
                    }
                } else if (numArr.length == 6) {

                    if (Errors.errorNaturalNum(numArr)) {

                        continue;
                    } else {

                        if (Errors.errorTwoParsPlusProperties(numArr)) {

                            continue;
                        }

                        if (Errors.errorMutuality(numArr)) {

                            continue;
                        }
                        Properties.twoNumSearchFourWord(numArr);
                    }
                } else if (numArr.length == 7) {

                    if (Errors.errorNaturalNum(numArr)) {

                        continue;
                    } else {

                        if (Errors.errorTwoParsPlusProperties(numArr)) {

                            continue;
                        }

                        if (Errors.errorMutuality(numArr)) {

                            continue;
                        }
                        Properties.twoNumSearchFiveWord(numArr);
                    }
                } else if (numArr.length == 8) {

                    if (Errors.errorNaturalNum(numArr)) {

                        continue;
                    } else {

                        if (Errors.errorTwoParsPlusProperties(numArr)) {

                            continue;
                        }

                        if (Errors.errorMutuality(numArr)) {

                            continue;
                        }
                        Properties.twoNumSearchSixWord(numArr);
                    }
                } else if (numArr.length == 9) {

                    if (Errors.errorNaturalNum(numArr)) {

                        continue;
                    } else {

                        if (Errors.errorTwoParsPlusProperties(numArr)) {

                            continue;
                        }

                        if (Errors.errorMutuality(numArr)) {

                            continue;
                        }
                        Properties.twoNumSearchSevenWord(numArr);
                    }
                } else if (numArr.length == 10) {

                    if (Errors.errorNaturalNum(numArr)) {

                        continue;
                    } else {

                        if (Errors.errorTwoParsPlusProperties(numArr)) {

                            continue;
                        }

                        if (Errors.errorMutuality(numArr)) {

                            continue;
                        }
                        Properties.twoNumSearchEightWord(numArr);
                    }
                } else if (numArr.length == 11) {

                    if (Errors.errorNaturalNum(numArr)) {

                        continue;
                    } else {

                        if (Errors.errorTwoParsPlusProperties(numArr)) {

                            continue;
                        }

                        if (Errors.errorMutuality(numArr)) {

                            continue;
                        }
                        Properties.twoNumSearchNineWord(numArr);
                    }
                } else if (numArr.length == 12) {

                    if (Errors.errorNaturalNum(numArr)) {

                        continue;
                    } else {

                        if (Errors.errorTwoParsPlusProperties(numArr)) {

                            continue;
                        }

                        if (Errors.errorMutuality(numArr)) {

                            continue;
                        }
                        Properties.twoNumSearchTenWord(numArr);
                    }
                }
            }
        } while (!number.equals("0"));
    }
}
