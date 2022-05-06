package ExercicioEdgar1;

public class Pessoa {
    private String nome;
    private int anoNascimento;
    private double altura;

    public Pessoa(String nome, int anoNascimento, double altura) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calculaIdade() {
        return 2022 - anoNascimento;
    }

}
