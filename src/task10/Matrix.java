package task10;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int x = in.nextInt();
        System.out.print("Введите количество столбцов: ");
        int y = in.nextInt();
        int matrx[][] = new int[x][y];

        for (int i = 0; i < x; i++ ) {
            System.out.println("Введите " +(i+1)+ " строку матрицы ");
            for (int j = 0; j < y; j++ )
            matrx[i][j] = in.nextInt();
        }
        System.out.println("Первая строка матрицы: ");
        for (int j = 0; j < y; j++ ){
            System.out.print((matrx [0][j] * 3)+ " ");
        }
    }
}
