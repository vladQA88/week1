package Task18;

import java.io.*;
import java.util.Scanner;

public class task18 {
    public static void main(String[] args) {
        String s;
        int count = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя файла: (testo.txt)");
        String name = in.nextLine();
        try {
            try (BufferedReader BR = new BufferedReader(new FileReader("C:\\Users\\user\\IdeaProjects\\week1\\src\\Task18\\" + name))) {
                try {
                    while ((s = BR.readLine()) != null) {
                        System.out.println(s);
                        count++;
                    }
                } finally {
                    BR.close();
                }
            }
        } catch (IOException exc) {
            System.out.println("Ошибка ввода/вывода: " + exc);
        }
        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Изменить тект: ");
        try (FileWriter fw = new FileWriter("C:\\Users\\user\\IdeaProjects\\week1\\src\\Task18\\testo.txt")) {
            do {
                s = BR.readLine();
                if (count == 0) break;
                s = s + "\r\n";
                fw.write(s);
                count--;
            } while (count != 0);
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
    }
}
