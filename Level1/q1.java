<<<<<<< HEAD
public class q1 (
    public static void main(String[] args) {

        int birthYear = 2000;
        int currentYear = 2024;

        int age = currentYear - birthYear;

        System.out.println("Harry's age in 2024 is " + age);
=======
// Question: Divide 14 pens among 3 students

import java.util.Scanner;

// Question: Basic Calculator Program
public class q1_BasicCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking user inputs
        System.out.print("Enter first number: ");
        float number1 = sc.nextFloat();

        System.out.print("Enter second number: ");
        float number2 = sc.nextFloat();

        // Arithmetic operations
        float addition = number1 + number2;
        float subtraction = number1 - number2;
        float multiplication = number1 * number2;
        float division = number1 / number2;

        // Printing results
        System.out.println("Addition = " + addition);
        System.out.println("Subtraction = " + subtraction);
        System.out.println("Multiplication = " + multiplication);
        System.out.println("Division = " + division);

        sc.close();
>>>>>>> a2cffe0 (Added Level2 Question1)
    }
}