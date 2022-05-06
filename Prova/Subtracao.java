package Prova;

public class Subtracao {

    private Double a, b;

    public Subtracao(Double a, Double b) {
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
    public double Subtrair() {
        return a - b;
    }
}
