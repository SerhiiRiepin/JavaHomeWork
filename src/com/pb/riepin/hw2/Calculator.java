package com.pb.riepin.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int operand1;
        int operand2;
        String operator;

        System.out.println("Введите первое число ");
        operand1=scan.nextInt();
        System.out.println("Введите второе число ");
        operand2=scan.nextInt();
        System.out.println("Что будем делать с числами? ");
        operator=scan.next();


        switch (operator) {
            case "+":
                System.out.println(operand1+operand2);
                break;
            case "-":
                System.out.println(operand1-operand2);
                break;
            case "*":
                System.out.println(operand1*operand2);
                break;
            case "/":
                if (operand2==0){
                    System.out.println("Ничего не выйдет, знаменатель равен 0");
                } else {
                    System.out.println(operand1/operand2);
                }
        }


    }
}
