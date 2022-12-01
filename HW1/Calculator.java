//Реализовать простой калькулятор

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double number1;
        double number2;
        double answer;
        char operator;

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        number1 = reader.nextDouble();
        System.out.println("Enter the operator + or - or * or /");
        operator = reader.next().charAt(0);
        System.out.println("Enter the second number: ");
        number2 = reader.nextDouble();



        switch (operator) {
            case '+' -> answer = number1 + number2;
            case '-' -> answer = number1 - number2;
            case '*' -> answer = number1 * number2;
            case '/' -> answer = number1 / number2;
            default -> {
                System.out.println("You have entered unsupported operator! Give the correct one.");
                return;  //to initialize answer or with no return, but put a 0 value to answer when initializing
            }
        }
        System.out.printf(number1 + " " + operator + " " + number2 + " = " + Math.round(answer * 100.00)/100.00);
    }
}
