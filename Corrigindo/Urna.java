package Corrigindo;

import java.util.ArrayList;
import java.util.Scanner;

public class Urna {
    private static Iterable<String> arrayList;

    public static void main(String[] args) {
        ArrayList<Candidato> lista = new ArrayList<Candidato>();
        Scanner console = new Scanner(System.in);

        do {
            System.out.println("  ====CADASTRAMENTO DOS CANDITADOS===   ");
            System.out.println("1. CADASTRAR DO CANDIDATO:   ");
            System.out.println("2. LISTAR CANDIDATOS:     ");
            System.out.println(" ESCOLHA UMA OPCAO   ");
            int opcao = console.nextInt();

            if (opcao == 1) {
                System.out.println("INFORME O NOME DO CANDIDATO");
                String nome = console.next();
                System.out.println("INFORME A SIGLA DO PARTIDO");
                String sigla = console.next();
                System.out.println("INFORME O NUMERO DO CANDIDATO");
                String numero = console.next();

                Candidato candidatoa = new Candidato(nome, sigla, numero);
                lista.add(candidatoa);

            } else if (opcao == 2) {
                for (Candidato i : lista) {
                    System.out.println(i);
                }
                break;
            }
        } while (true);
    }
}