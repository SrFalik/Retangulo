package Exercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student joaozinho = new Student();
        Scanner sc = new Scanner(System.in);
        joaozinho.name = sc.next();
        joaozinho.grade1 = sc.nextDouble();
        joaozinho.grade2 = sc.nextDouble();
        joaozinho.grade3 = sc.nextDouble();
        System.out.println(joaozinho.finalGrade());
        System.out.println(joaozinho.passOrNot());
        sc.close();
    }
}
