package Lesson6;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double a = sc1.nextDouble();
        System.out.print("Введите второе число: ");
        double b = sc1.nextDouble();
        System.out.print("Введите оператор: ");
        char c = sc1.next().charAt(0);
        double result;
        if (c == '+'){
            result = a + b;
            System.out.println("Результат: " + result);
        } else if (c == '-') {
            result = a - b;
            System.out.println("Результат: " + result);
        } else if (c == '*') {
            result = a * b;
            System.out.println("Результат: " + result);
        } else if (c == '/') {
            result = a / b;
            System.out.println("Результат: " + result);
        }
    }
}
