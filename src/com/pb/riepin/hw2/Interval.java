package com.pb.riepin.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;

        System.out.println("Введите число в интервале от 0 до 100 ");
        num=scan.nextInt();

        if (num >=0 && num<=100) {
            switch ((0 <= num && num <= 14) ? 0 :
                    (15 <= num && num <= 35) ? 1 :
                            (36 <= num && num <= 50) ? 2 : 3) {
                case 0:
                    System.out.println("testing case 0 to 14");
                    break;
                case 1:
                    System.out.println("testing case 15 to 35");
                    break;
                case 2:
                    System.out.println("testing case 36 to 50");
                    break;
                case 3:
                    System.out.println("testing case 51 to 100");
                    break;
            }
        } else {
            System.out.println("Введено число вне диапазона");
        }

    }
}
