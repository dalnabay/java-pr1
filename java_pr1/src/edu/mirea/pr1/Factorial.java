package edu.mirea.pr1;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public static BigInteger factorial(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Факториал определен для целых неотрицательных чисел");
        }
        BigInteger product = BigInteger.ONE;
        int factor = value;
        while (factor > 1) {
            product = product.multiply(BigInteger.valueOf(factor));
            factor--;
        }
        return product;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Число для вычисления факториала: ");
        int value = input.nextInt();
        if (value < 0) {
            System.out.println("Отрицательное число не подходит");
            return;
        }
        System.out.println(value + "! = " + factorial(value));
    }
}
