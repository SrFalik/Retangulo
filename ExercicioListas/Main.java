package ExercicioListas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Quarto[] vect = new Quarto[10];
        for(int contador = 0; contador < n; contador++) {
            sc.nextLine();
            String nome = sc.nextLine();
            String email = sc.nextLine();
            int id = sc.nextInt();
            vect[id] = new Quarto(nome, email, id);
        }

        for (Quarto quarto : vect) {
            if (quarto != null) {
                System.out.println(quarto);
            }
        }

        sc.close();
    }
}
