package com.lesson4;

import java.util.Scanner;

public class MinAbs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the numbers: ");
        String[] numbers = scanner.nextLine().split(" ");
        int min = abs(Integer.parseInt(numbers[0]));
        for (int i = 1; i < numbers.length; i++) {
            int current = abs(Integer.parseInt(numbers[i]));
            min = (min > current) ? current : min;
        }
        System.out.println("Min: " + min);
    }

    public static int abs(int number) {
        return number < 0 ? number * -1 : number;
    }
}
