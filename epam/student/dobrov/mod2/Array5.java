package by.epam.student.dobrov.mod2;

import java.util.Scanner;

/*
Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.

-создания массива с рандомными  числами
-определить если число больше индекса выводим на печать
 */
public class Array5 {
    public static void main(String[] args) {
        Scanner br = new Scanner(System.in);

        System.out.println("Введите длину массива : ");
        int arrLenght = br.nextInt();

        int mass[] = new int[arrLenght];

        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * 10);
            System.out.println(i + ": " + mass[i] + " ");


        }
        System.out.println();

        for (int i = 0; i < mass.length; i++) {
            if (mass[i] > i) {
                System.out.println(i + ": " + mass[i] + " ");
            }

        }
    }

}

