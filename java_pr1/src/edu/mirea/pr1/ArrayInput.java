package edu.mirea.pr1;

import java.util.Scanner;

public class ArrayInput {
    public static long sumWithWhile(int[] values) {
        long total = 0;
        int position = 0;
        while (position < values.length) {
            total += values[position];
            position++;
        }
        return total;
    }

    public static long sumWithDoWhile(int[] values) {
        if (values.length == 0) {
            return 0;
        }
        long total = 0;
        int position = 0;
        do {
            total += values[position];
            position++;
        } while (position < values.length);
        return total;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Количество элементов: ");
        int count = input.nextInt();
        if (count < 1) {
            System.out.println("Нужно хотя бы одно число");
            return;
        }

        int[] values = new int[count];
        System.out.println("Введите целые числа:");
        for (int position = 0; position < count; position++) {
            values[position] = input.nextInt();
        }

        int smallest = values[0];
        int largest = values[0];
        int position = 1;
        while (position < count) {
            if (values[position] < smallest) {
                smallest = values[position];
            }
            if (values[position] > largest) {
                largest = values[position];
            }
            position++;
        }

        System.out.println("Сумма через while: " + sumWithWhile(values));
        System.out.println("Сумма через do while: " + sumWithDoWhile(values));
        System.out.printf("Минимальное: %d%nМаксимальное: %d%n", smallest, largest);
    }
}
