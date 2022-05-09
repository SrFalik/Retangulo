package ArrayListTeste;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cliente cliente = null;
        Locale.setDefault(Locale.US);
        List<Cliente> list = new ArrayList<>();
        int id;
        String nome;
        int idade;
        int tel;
        do {
            id = sc.nextInt();
            if (id < 0) {
                break;
            } else {
                nome = sc.next();
                idade = sc.nextInt();
                tel = sc.nextInt();
                cliente = new Cliente(id, nome, idade, tel);
                list.add(cliente);
            }
        } while (true);

        for (Cliente x : list) {
            System.out.println(x);
        }

    }
}
