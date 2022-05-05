package Exercicio1;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Retangulo retangulo = new Retangulo();
        Scanner sc = new Scanner(System.in);
        retangulo.Height = sc.nextDouble();
        retangulo.Width = sc.nextDouble();
        System.out.println(retangulo.Area());
        System.out.println(retangulo.Perimeter());
        System.out.println(retangulo.Diagonal());
        sc.close();
    }
}