package Task16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class task16 {
    public static void main(String[] args) {
        String s;
        Scanner in= new Scanner(System.in);
        System.out.println("Введите имя файла: (testo.txt)");
        String name = in.nextLine();
        try {
            try (BufferedReader BR = new BufferedReader(new FileReader("C:\\Users\\user\\IdeaProjects\\week1\\src\\Task16\\" + name))) {
                try {
                    while ((s = BR.readLine()) != null) {
                        System.out.println(s);
                    }
                } finally {
                    BR.close();
                }
            }
        } catch (IOException exc) {
            System.out.println("Ошибка ввода/вывода: "+ exc);
        }
    }
}
