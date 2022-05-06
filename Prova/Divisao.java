package Prova;

public class Divisao {

    private Double a, b;

    public Divisao(Double a, Double b) {
        this.a = a;
        this.b = b;
    }

    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }
    public double Dividir() {
        return a / b;
    }
}
