package edu.mirea.example;

public class Main {
    public static void main(String[] args) {
        int[] values = {7, 14, 21, 28, 35};
        long total = 0;

        for (int value : values) {
            total += value;
        }

        double mean = (double) total / values.length;
        System.out.printf("Сумма элементов: %d%n", total);
        System.out.printf("Среднее значение: %.2f%n", mean);
    }
}
