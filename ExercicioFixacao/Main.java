package ExercicioFixacao;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double price = sc.nextDouble();
        double dollars = sc.nextDouble();


        System.out.println(CurrencyConverter.Converter(price, dollars));

        sc.close();
    }
}
