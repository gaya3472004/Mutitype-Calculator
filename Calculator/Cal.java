import java.util.Scanner;

public class Cal {

    public static void main(String a[]) {
        Scanner oc = new Scanner(System.in);
        boolean continueProgram = true;

        while (continueProgram) {
            System.out.println("Welcome to the Simple Calculator");
            System.out.println("Which type of value you want to enter?");
            System.out.println("1.Integer");
            System.out.println("2.Float");
            System.out.println("3.Double");
            System.out.println("4.Long");
            System.out.println("5.Exit");

            int v = oc.nextInt();
            switch (v) {
                case 1:
                    System.out.println("Enter two Integer values");
                    int inta = getValidint(oc, "Enter the first integer (ex. 12):");
                    int intb = getValidint(oc, "Enter the second integer (89):");
                    System.out.println("Valid Integers are " + inta + " and " + intb);
                    performCalc(inta, intb);
                    break;
                case 2:
                    System.out.println("Enter two Float values");
                    float f1 = getValidfloat(oc, "Enter the first float value (ex. 2.20):");
                    float f2 = getValidfloat(oc, "Enter the second float value (6.7):");
                    System.out.println("Valid Float values are " + f1 + " and " + f2);
                    performCalc(f1, f2);
                    break;
                case 3:
                    System.out.println("Enter two Double values");
                    double d1 = getValiddouble(oc, "Enter the first double value (ex. 4325.88766):");
                    double d2 = getValiddouble(oc, "Enter the second double value (23.6543):");
                    System.out.println("Valid Double values are " + d1 + " and " + d2);
                    performCalc(d1, d2);
                    break;
                case 4:
                    System.out.println("Enter two Long values");
                    long l1 = getValidlong(oc, "Enter the first long value (ex. 1234546336784):");
                    long l2 = getValidlong(oc, "Enter the second long value (ex. 54268776656):");
                    System.out.println("Valid Long values are " + l1 + " and " + l2);
                    performCalc(l1, l2);
                    break;
                case 5:
                    continueProgram = false;
                    System.out.println("Exiting the program. Thank you for using the calculator!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

            if (continueProgram) {
                // Ask if the user wants to enter another datatype or perform another operation
                System.out.println("Do you want to perform operations on another data type? (yes/no)");
                String response = oc.next();
                if (response.equalsIgnoreCase("no")) {
                    continueProgram = false;
                    System.out.println("Thank you for using the calculator! Goodbye.");
                }
            }
        }
    }

    // Validate Integer Input
    public static int getValidint(Scanner oc, String prompt) {
        while (true) {
            System.out.println(prompt);
            if (oc.hasNextInt()) {
                return oc.nextInt();
            } else {
                System.out.println("Invalid input! Please enter a valid integer.");
                oc.next(); // Consume the invalid input
            }
        }
    }

    // Validate Float Input
    public static float getValidfloat(Scanner oc, String prompt) {
        while (true) {
            System.out.println(prompt);
            if (oc.hasNextFloat()) {
                return oc.nextFloat();
            } else {
                System.out.println("Invalid input! Please enter a valid float value.");
                oc.next(); // Consume the invalid input
            }
        }
    }

    // Validate Double Input
    public static double getValiddouble(Scanner oc, String prompt) {
        while (true) {
            System.out.println(prompt);
            if (oc.hasNextDouble()) {
                return oc.nextDouble();
            } else {
                System.out.println("Invalid input! Please enter a valid double value.");
                oc.next(); // Consume the invalid input
            }
        }
    }

    // Validate Long Input
    public static long getValidlong(Scanner oc, String prompt) {
        while (true) {
            System.out.println(prompt);
            if (oc.hasNextLong()) {
                return oc.nextLong();
            } else {
                System.out.println("Invalid input! Please enter a valid long value.");
                oc.next(); // Consume the invalid input
            }
        }
    }

    // Perform calculations for integers
    public static void performCalc(int a, int b) {
        Scanner ss = new Scanner(System.in);
        boolean continueCalc = true;

        while (continueCalc) {
            System.out.println("Enter the operation to perform (+, -, *, /):");
            char ch = ss.nextLine().charAt(0);
            switch (ch) {
                case '+':
                    System.out.println("Addition of two Integers is " + (a + b));
                    break;
                case '-':
                    System.out.println("Subtraction of two Integers is " + (a - b));
                    break;
                case '*':
                    System.out.println("Multiplication of two Integers is " + (a * b));
                    break;
                case '/':
                    if (b != 0) {
                        System.out.println("Division of two Integers is " + (a / b));
                    } else {
                        System.out.println("Division by zero is not allowed!");
                    }
                    break;
                default:
                    System.out.println("Invalid operation");
                    continue;
            }

            // Ask if the user wants to perform another operation
            System.out.println("Do you want to perform another operation on the same data type? (yes/no):");
            String answer = ss.nextLine();
            if (!answer.equalsIgnoreCase("yes")) {
                continueCalc = false;
            }
        }
    }

    // Perform calculations for floats
    public static void performCalc(float a, float b) {
        Scanner ss = new Scanner(System.in);
        boolean continueCalc = true;

        while (continueCalc) {
            System.out.println("Enter the operation to perform (+, -, *, /):");
            char ch = ss.nextLine().charAt(0);
            switch (ch) {
                case '+':
                    System.out.println("Addition of two Floats is " + (a + b));
                    break;
                case '-':
                    System.out.println("Subtraction of two Floats is " + (a - b));
                    break;
                case '*':
                    System.out.println("Multiplication of two Floats is " + (a * b));
                    break;
                case '/':
                    if (b != 0) {
                        System.out.println("Division of two Floats is " + (a / b));
                    } else {
                        System.out.println("Division by zero is not allowed!");
                    }
                    break;
                default:
                    System.out.println("Invalid operation");
                    continue;
            }

            // Ask if the user wants to perform another operation
            System.out.println("Do you want to perform another operation on the same data type? (yes/no):");
            String answer = ss.nextLine();
            if (!answer.equalsIgnoreCase("yes")) {
                continueCalc = false;
            }
        }
    }

    // Perform calculations for doubles
    public static void performCalc(double a, double b) {
        Scanner ss = new Scanner(System.in);
        boolean continueCalc = true;

        while (continueCalc) {
            System.out.println("Enter the operation to perform (+, -, *, /):");
            char ch = ss.nextLine().charAt(0);
            switch (ch) {
                case '+':
                    System.out.println("Addition of two Doubles is " + (a + b));
                    break;
                case '-':
                    System.out.println("Subtraction of two Doubles is " + (a - b));
                    break;
                case '*':
                    System.out.println("Multiplication of two Doubles is " + (a * b));
                    break;
                case '/':
                    if (b != 0) {
                        System.out.println("Division of two Doubles is " + (a / b));
                    } else {
                        System.out.println("Division by zero is not allowed!");
                    }
                    break;
                default:
                    System.out.println("Invalid operation");
                    continue;
            }

            // Ask if the user wants to perform another operation
            System.out.println("Do you want to perform another operation on the same data type? (yes/no):");
            String answer = ss.nextLine();
            if (!answer.equalsIgnoreCase("yes")) {
                continueCalc = false;
            }
        }
    }

    // Perform calculations for long values
    public static void performCalc(long a, long b) {
        Scanner ss = new Scanner(System.in);
        boolean continueCalc = true;

        while (continueCalc) {
            System.out.println("Enter the operation to perform (+, -, *, /):");
            char ch = ss.nextLine().charAt(0);
            switch (ch) {
                case '+':
                    System.out.println("Addition of two Longs is " + (a + b));
                    break;
                case '-':
                    System.out.println("Subtraction of two Longs is " + (a - b));
                    break;
                case '*':
                    System.out.println("Multiplication of two Longs is " + (a * b));
                    break;
                case '/':
                    if (b != 0) {
                        System.out.println("Division of two Longs is " + (a / b));
                    } else {
                        System.out.println("Division by zero is not allowed!");
                    }
                    break;
                default:
                    System.out.println("Invalid operation");
                    continue;
            }

            // Ask if the user wants to perform another operation
            System.out.println("Do you want to perform another operation on the same data type? (yes/no):");
            String answer = ss.nextLine();
            if (!answer.equalsIgnoreCase("yes")) {
                continueCalc = false;
            }
        }
    }
}
