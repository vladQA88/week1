package Task13;
import java.util.Scanner;
public class Task13 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Введите первую строку: ");
        String st1 = in.nextLine();
        System.out.println("Введите вторую строку: ");
        String st2 = in.nextLine();
        if(st1.length()==st2.length()){
            System.out.println("Длины ваших строк равны");
        }
        else {
            if(st1.length()>st2.length())
                System.out.println("Первая строка " +st1+ " длинее второй строки");
            else System.out.println("Вторая строка " +st2+ " оказалась длинее первой строки");
        }
    }
}

