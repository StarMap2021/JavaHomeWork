package com.pb.kovalova.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        int value;
        Scanner in = new Scanner(System.in);

        System.out.println("Введите значение переменной");
        value = in.nextInt();

        if (value >= 0 && value <= 14) {
            System.out.print("Значение находится в промежутке  [0 - 14]");
        } else if (value >= 15 && value <= 35) {
            System.out.println("Значение находится в промежутке  [15 - 35]");
        } else if (value >= 36 && value <= 50) {
            System.out.println("Значение находится в промежутке  [36 - 50]");
        } else if (value >= 51 && value <= 100) {
            System.out.println("Значение находится в промежутке  [51 - 100]");
        } else {
            System.out.println("Значение " + value + " находится в неизвестном промежутке");
        }
    }

}
