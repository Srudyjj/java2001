package com.lesson3;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int firstNumber = getNumberFromUser("Введите первое число: ");
        int secondNumber = getNumberFromUser("Введите второе число: ");
        System.out.println("Сумма чисел: " + sumNumbers(firstNumber, secondNumber));
    }

    private static int sumNumbers(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    private static int getNumberFromUser(String message) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print(message);
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Значение \"" + scanner.next() + "\" введено не верно!");
            }
        } while (true);
    }
}
