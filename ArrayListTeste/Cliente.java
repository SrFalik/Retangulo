package ArrayListTeste;

public class Cliente {
    private int id;
    private String nome;
    private int idade;
    private int telefone;

    public Cliente(int id, String nome, int idade, int telefone) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", telefone=" + telefone +
                '}';
    }
}
