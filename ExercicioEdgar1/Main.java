package ExercicioEdgar1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = sc.next();
        int ano = sc.nextInt();
        double altura = sc.nextDouble();
        Pessoa pessoa = new Pessoa(nome, ano, altura);
        System.out.println(pessoa.calculaIdade());
    }
}
