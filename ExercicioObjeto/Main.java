package ExercicioObjeto;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        BankAccount joao;
        int number = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        char yn = sc.next().charAt(0);
        if (yn == 'y') {
            sc.nextLine();
            double inicialDeposit = sc.nextDouble();
            joao = new BankAccount(number, name, inicialDeposit);
        } else {
            joao = new BankAccount(number, name);
        }
        System.out.println(joao);
        joao.deposit(sc.nextDouble());
        System.out.println(joao);
        joao.withdraw(sc.nextDouble());
        System.out.println(joao);

        sc.close();

    }
}
