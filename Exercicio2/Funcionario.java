package Exercicio2;

public class Funcionario {
    public String nome;
    public double salario;
    public double taxa;

    public void increaseSalary(double porcento) {
        double aux = porcento/100 + 1;
        salario *= aux;
    }

    public double netSalary() {
        return salario - taxa;
    }

    @Override
    public String toString() {
        return "Funcionario" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                ", taxa=" + taxa;
    }
}
