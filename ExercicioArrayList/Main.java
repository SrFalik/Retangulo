package ExercicioArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Funcionarios funcionarios = null;
        List<Funcionarios> list= new ArrayList<>();
        int id;
        String nome;
        double salario;
        for (int i = 0; i < n; i++) {
            id = sc.nextInt();
            nome = sc.next();
            salario = sc.nextDouble();
            funcionarios = new Funcionarios(id, nome, salario);
            list.add(funcionarios);
        }
        System.out.println("add salario de algm ai");
        int idFunc = sc.nextInt();
        System.out.println("qto tu quer add zé?");
        double porcent = sc.nextDouble();

        Funcionarios func = list.stream().filter(x -> x.getId() == idFunc).findFirst().orElse(null);
        if (func == null) {
            System.out.println("Id não existe, chapa");
        } else {
            func.aumentarSalario(porcent);
            for (Funcionarios cebola : list) {
                System.out.println(cebola);
            }
        }
    }
}
