package Prova;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        do {
            System.out.println("ESCOLHA UMA OPERAÇÃO");
            System.out.println("1- Soma");
            System.out.println("2- Subtração");
            System.out.println("3- Multiplicação");
            System.out.println("4- Divisão");
            System.out.println("DIGITE QUALQUER OUTRO NÚMERO PARA ACABAR COM O PROGRAMA");
            int i = sc.nextInt();
            if (i == 1) {
                Soma soma = new Soma(a, b);
                System.out.println(soma.Somar());
            } else if (i == 2) {
                Subtracao sub = new Subtracao(a, b);
                System.out.println(sub.Subtrair());
            } else if (i == 3) {
                Multiplicacao mult = new Multiplicacao(a, b);
                System.out.println(mult.Multiplicar());
            } else if (i == 4){
                Divisao div = new Divisao(a, b);
                System.out.println(div.Dividir());
            } else {
                break;
            }
        } while (true);
    }
}
