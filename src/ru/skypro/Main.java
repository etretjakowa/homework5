package ru.skypro;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //int[] arr = generateRandomArray();

        // public static int[] generateRandomArray() {
        //   java.util.Random random = new java.util.Random();
        Random random = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 200_000;
        }
        System.out.println("arr:" + Arrays.toString(arr));
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");

        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int value = arr[i];
            if (value < min) {
                min = value;
            } else if (value > max) {
                max = value;
            }
        }
        System.out.println("Минимальная сумма трат за месяц составила " + min + " рублей. Максимальная сумма трат за месяц" +
                " составила " + max + " рублей.");
        System.out.println("Средняя сумма трат за месяц составила " + sum / (float) arr.length + " рублей");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

    }

}
