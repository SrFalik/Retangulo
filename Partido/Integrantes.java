package Partido;

public class Integrantes {
    private final Integer id;
    private String nome;
    private String dataNasc;
    private Double verba;
    private Double tempoTvMin;

    public Integrantes(Integer id, String nome, String dataNasc, Double verba, Double tempoTvMin) {
        this.id = id;
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.verba = verba;
        this.tempoTvMin = tempoTvMin;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public Double getVerba() {
        return verba;
    }

    public void setVerba(Double verba) {
        this.verba = verba;
    }

    public Double getTempoTvMin() {
        return tempoTvMin;
    }

    public void setTempoTvMin(Double tempoTvMin) {
        this.tempoTvMin = tempoTvMin;
    }

    @Override
    public String toString() {
        return "Integrantes{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", dataNasc='" + dataNasc + '\'' +
                ", verba=" + verba +
                ", tempoTvMin=" + tempoTvMin +
                '}';
    }
}
