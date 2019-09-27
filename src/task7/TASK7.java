package task7;

import java.util.Scanner;
public class TASK7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число число с клавиатуры: ");
        int number = in.nextInt();
        int X = 25;
        int Y = 35;
        int Z = 45;
        if (number == X ||number == Y || number == Z){
            System.out.println("Данное значение имеется в константах");
        }
            else {
            System.out.println("Такой константы нет!");
        }
    }
}

