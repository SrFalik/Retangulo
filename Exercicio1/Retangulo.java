package Exercicio1;

public class Retangulo {

    public double Width;
    public double Height;

    public double Area() {
        return Width * Height;
    }
    public double Perimeter() {
        return 2*Width + 2*Height;
    }
    public double Diagonal() {
        return Math.sqrt(Math.pow(Width, 2) + Math.pow(Height, 2));
    }
}
