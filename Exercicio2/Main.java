package Exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Funcionario joaozinho = new Funcionario();
        Scanner sc = new Scanner(System.in);
        joaozinho.nome = sc.next();
        joaozinho.salario = sc.nextDouble();
        joaozinho.taxa = sc.nextDouble();
        System.out.println(joaozinho);
        joaozinho.increaseSalary(sc.nextDouble());
        System.out.println(joaozinho);
    }
}
