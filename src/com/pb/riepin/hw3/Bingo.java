package com.pb.riepin.hw3;

import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = (int) (Math.random() * 100);
        int y;
        int attempt=0;

        System.out.println("Попробуйте угадать число заданное на промежутке 0..100. Для выхода введите отричательне число.");
        while (true) {
            attempt++;
            System.out.println("Попытка №" + attempt +  ". Введите число: ");
            y=scan.nextInt();
            if (y<0) {
                break;
            }
            if (y == x) {
                System.out.println("Примите поздравления, Вы угадали число с " + attempt + " раза");
                break;
            } else if (y>x) {
                System.out.println("Введенное число больше загаданного");
            } else {
                System.out.println("Введенное число меньше чем загаданного");

            }
        }

    }
}
