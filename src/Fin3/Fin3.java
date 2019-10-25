package Fin3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Fin3 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#####.##");
        System.out.println("Введите текущий курс:");
        System.out.print("Курс доллара = ");
        double Kurse=in.nextFloat();
        System.out.println("Введите количество рублей:");
        double RuR=in.nextDouble();
        double Dollar = RuR / Kurse;
        System.out.println("Итого: "+ df.format(Dollar)+" долларов.");
    }
}
