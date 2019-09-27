package task6;
import java.util.Scanner;
public class SearchAVG {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число 'x': ");
        int x = in.nextInt();
        System.out.print("Введите число 'y': ");
        int y = in.nextInt();
        System.out.print("Введите число 'z': ");
        int z = in.nextInt();
        int h = (x + y + z) / 3;
        System.out.println("Среднее арифметическое число x, y , z: " +h);
        if (h / 2 > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
    }

