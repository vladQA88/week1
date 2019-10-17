package Task15;

import java.util.Random;
import java.util.Scanner;

public class task15 {
    public static void main(String[] args) {
        int size;
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        size = in.nextInt();
        int mass[] = new int[size];
        for (int i = 0; i < size; i++) {
            mass[i] = random.nextInt(30);
        }
        System.out.println("Ваш массив:");
        for (int i = 0; i < size; i++) {
            System.out.print(mass[i] + " ");
        }
        for(int i = mass.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++) {
                if (mass[j] > mass[j + 1]) {
                    int tmp = mass[j];
                    mass[j] = mass[j + 1];
                    mass[j + 1] = tmp;
                }

                }
            }
        System.out.println("\nВаш массив отсортирован:");
        for (int a = 0; a < size; a++)
            System.out.print(mass[a] + " ");
        }
    }
