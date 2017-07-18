package com.cdhorn;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Please enter two numbers (separated by a space):");
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();    // get the entire line after the prompt
        String[] numbers = input.split(" ");

        double operand1 = Double.parseDouble(numbers[0]);
        double operand2 = Double.parseDouble(numbers[1]);

        double sum = operand1 + operand2;

        double difference = operand1 - operand2;

        double multiplication = operand1 * operand2;

        double division = operand1 / operand2;

        double remainder = operand1 % operand2;

        showResults(operand1, operand2, sum, difference, multiplication, division, remainder);

    }

        public static void showResults(double x, double y, double z, double a, double b, double c, double d) {
            System.out.println("The sum of " + x + " and " + y+ " is: " + z);
            System.out.println("The difference of " + x + " minus " + y + " is: " + a);
            System.out.println(x + " times " + y + " equals " + b);
            System.out.println(x + " divided by " + y + " equals " + c );
            System.out.println(x + " divided by " + y + " leaves you with a remainder of " + d);
            }

    }

