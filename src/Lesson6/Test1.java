package Lesson6;

import java.util.Scanner;

public class Test1 {

        public class Solution {
            public static void main(String[] args) {

                /*Напишем программу, которая будет считывать с клавиатуры возраст.
                  Если возраст от 20 до 60 (включительно), то выводить ничего не нужно,
                  иначе - вывести фразу "можно не работать".
                  Сделать это можно (и нужно!) с помощью только одного оператора if без else.
                  Подсказка : используй логический оператор "||"*/

                Scanner sc = new Scanner(System.in);
                int age = sc.nextInt();
                if ((age<20)||(age>60)){
                    System.out.println("можно не работать");
                }


            }
        }
}