package com.pb.kovalova.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        int b;
        String sign;

        System.out.println("Введите первое число");
        a = in.nextInt();

        System.out.println("Введите второе число");
        b = in.nextInt();

        System.out.println("Введите арифметический знак");
        sign = in.next();

        switch (sign) {
            case "+":
                System.out.println("Результат: " + (a + b));
                break;
            case "-":
                System.out.println("Результат: " + (a - b));
                break;
            case "*":
                System.out.println("Результат: " + (a * b));
                break;
            case "/":
                if (b == 0) {
                    System.out.print("Деление на 0 запрещено");
                } else {
                    System.out.println("Результат: " + (a / b));
                }
                break;
            default:
                System.out.println("Арифметический знак введён не корректно");
        }
    }
}