//Вычислить n-ое треугольного числа (сумма чисел от 1 до N), n! (произведение числе от 1 до n)
//Программа высчитывает последовательность треуголных чисел от 1 до n
//Программа высчитывает факториал !n

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the N number: ");
        double value = reader.nextDouble();
        System.out.println("The row of triangle numbers is: ");
        double result = triangleRow(value);
        System.out.println();
        System.out.println("The factorial is: ");
        double result2 = factorial(value);

    }

    private static double triangleRow(double k) {
        double res = 0;
        for (int i = 1; i <= k; i++) {
            res = (0.5 * i * (i + 1));
            System.out.println(Math.round(res));
        }
        return res;
    }

    private static double factorial(double l) {
        double res2 = 1;
        for (int j = 2; j <= l; j++) {            //j starts with 2, cuz res2 = 1 and factorial starts with 1*2
            res2 = res2 * j;
        }
        System.out.println(Math.round(res2));
        return res2;
    }

}
