package ExercicioExemplo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("INSIRA A LARGURA DO TERRENO: ");
            double largura = sc.nextDouble();
            System.out.print("DIGITE O COMPRIMENTO DO TERRENO: ");
            double comprimento = sc.nextDouble();
            System.out.print("DIGITE O VALOR DO METRO QUADRADO: ");
            double metro = sc.nextDouble();
            Terreno terreno = new Terreno(largura, comprimento, metro);
            System.out.println("Area = " + terreno.calculaArea());
            System.out.println("Preco = " + terreno.calculaPreco());
            sc.close();
        }
}
