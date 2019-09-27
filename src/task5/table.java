package task5;

import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число, котороые вы хотите умножить: ");
        int x = in.nextInt();
        System.out.println("Таблица умножения вашего числа: ");
        System.out.println(x + "* 1 = " + x*1);
        System.out.println(x + "* 2 = " + x*2);
        System.out.println(x + "* 3 = " + x*3);
        System.out.println(x + "* 4 = " + x*4);
        System.out.println(x + "* 5 = " + x*5);
        System.out.println(x + "* 6 = " + x*6);
        System.out.println(x + "* 7 = " + x*7);
        System.out.println(x + "* 8 = " + x*8);
        System.out.println(x + "* 9 = " + x*9);
        System.out.println(x + "* 10 = " + x*10);
        System.out.println("Запишите, чтобы не потерять вашу таблицу умножения числа " +x);
    }
}
