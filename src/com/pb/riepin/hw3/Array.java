package com.pb.riepin.hw3;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] mas = new int[10];
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int kol = 0;
        int temp;

        for (int i = 0; i < mas.length; i++) {
            System.out.println("Введите " + (i+1) + " элемент массива");
            mas[i] = scan.nextInt();
            sum += mas[i];
            if (mas[i]>0) {
                kol++;
            }
        }
        System.out.println("Сумма элеентов массива равна " + sum);
        System.out.println("Количество положительных элеентов массива равно " + kol);
        for (int i = 0; i < mas.length; i++) {
            System.out.println(mas[i]);
        }
        for (int i =0; i < (mas.length - 1); i++) {
            for (int j = 0; j < (mas.length - 1); j++) {
                if (mas[j]>mas[j+1]) {
                        temp = mas[j];
                        mas[j] = mas[j + 1];
                        mas[j] = temp;
                }
            }
        }
        System.out.println("Отсортированный массив");
        for (int i = 0; i < mas.length; i++) {
            System.out.println(mas[i]);
        }
    }
}
