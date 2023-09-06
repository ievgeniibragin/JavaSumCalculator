package JavaSumCalculator;

import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt(); // Read the user's input

        // Ask the user for the second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt(); // Read the user's input

        // Calculate the sum
        int sum = num1 + num2;

        // Display the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        // Examples of different data types in mathematical operations
        byte aByte = 10;
        short aShort = 200;
        long aLong = 1234567890123L;
        float aFloat = 3.14f;
        double aDouble = 2.71828;
        char aChar = 'X';
        boolean aBoolean = true;

        // Perform mathematical operations using different data types
        int byteResult = num1 + aByte;
        int shortResult = num1 + aShort;
        long longResult = num1 + aLong;
        float floatResult = num1 + aFloat;
        double doubleResult = num1 + aDouble;

        // Display the results of mathematical operations
        System.out.println("Mathematical operations with different data types:");
        System.out.println("num1 + aByte = " + byteResult);
        System.out.println("num1 + aShort = " + shortResult);
        System.out.println("num1 + aLong = " + longResult);
        System.out.println("num1 + aFloat = " + floatResult);
        System.out.println("num1 + aDouble = " + doubleResult);
        System.out.println("num1 + aDouble = " + doubleResult);
        System.out.println("num1 + aDouble = " + doubleResult);
        // Close the scanner to free up resources
        // Close
        // vishlo
        scanner.close();
    }
}
