package ExercicioExemplo;

public class Terreno {
    private double largura;
    private double comprimento;
    private double metroQuadrado;

    public Terreno(double largura, double comprimento, double metroQuadrado) {
        this.largura = largura;
        this.comprimento = comprimento;
        this.metroQuadrado = metroQuadrado;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getMetroQuadrado() {
        return metroQuadrado;
    }

    public void setMetroQuadrado(double metroQuadrado) {
        this.metroQuadrado = metroQuadrado;
    }

    public double calculaArea() {
        return comprimento * largura;
    }

    public double calculaPreco() {
        return calculaArea() * metroQuadrado;
    }

}
