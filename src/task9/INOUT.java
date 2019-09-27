package task9;
import java.util.Scanner;

public class INOUT {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int x = in.nextInt();
        int mass[] = new int[x];
        for (int i = 0; i < x; i++ ) {
            System.out.println("Введите " +(i+1)+ " элемент массива");
            mass[i] = in.nextInt();
        }
        System.out.println("Ваш массив x 2: ");
        for (int i = 0; i < x; i++ ){
            System.out.print((mass[i] * 2)+ ", ");
        }
    }
}
