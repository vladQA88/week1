package Task12;
import java.util.Scanner;
public class task12 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Пожалуйста, введите страку с пробелами: ");
    String row = in.nextLine();
    String[] LostSpace=row.split(" ");
        System.out.println("А пробелы пропали: ");
           for (String s : LostSpace) System.out.print(s);
}
}
