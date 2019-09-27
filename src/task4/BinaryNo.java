package task4;

import java.util.Scanner;

public class BinaryNo {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.print("Введите бинарное число: ");
       int x;
       String y = in.nextLine();
       x = Integer.parseInt(y, 2);
        System.out.println("Ваше число в десятичном формате: " + x);
    }
}
