package Partido;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner bigode = new Scanner(System.in);
        int n = bigode.nextInt();
        Integrantes[] partido = new Integrantes[n];

        for(int contador = 0; contador < partido.length; contador++) {

            String nome = bigode.next();
            String dataNasc = bigode.next();
            Double verba = bigode.nextDouble();
            Double tempoTvMin = bigode.nextDouble();
            partido[contador] = new Integrantes(contador + 1, nome, dataNasc, verba, tempoTvMin);
        }

        for (Integrantes integrantes : partido) {
            System.out.println(integrantes);
        }

        bigode.close();

    }
}
