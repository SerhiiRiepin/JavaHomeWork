package com.pb.riepin.hw3;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] mas = new int[10];
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int positiveNumbersAmount = 0;
        int temp;

        for (int i = 0; i < mas.length; i++) {
            System.out.println("Введите " + (i + 1) + " элемент массива");
            mas[i] = scan.nextInt();
            sum += mas[i];
            if (mas[i] > 0) {
                positiveNumbersAmount++;
            }
        }
        System.out.println("Сумма элеентов массива равна " + sum);
        System.out.println("Количество положительных элементов массива равно " + positiveNumbersAmount);
        for (int ma : mas) {
            System.out.println(ma);
        }
        for (int i =0; i < (mas.length - 1); i++) {
            for (int j = 0; j < (mas.length - 1); j++) {
                if (mas[j] > mas[j + 1]) {
                        temp = mas[j];
                        mas[j] = mas[j + 1];
                        mas[j + 1] = temp;
                }
            }
        }
        System.out.println("Отсортированный массив");
        for (int ma : mas) {
            System.out.println(ma);
        }
    }
}
