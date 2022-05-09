package Corrigindo;

public class Candidato {
    private String nome, sigla, numero;

    public Candidato(String nome, String sigla, String numero) {
        this.nome = nome;
        this.sigla = sigla;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Candidato{" +
                "nome='" + nome + '\'' +
                ", sigla='" + sigla + '\'' +
                ", numero='" + numero + '\'' +
                '}';
    }
}
