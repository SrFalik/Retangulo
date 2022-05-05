package ExercicioFixacao;

public class CurrencyConverter {
    public static final Double IOF = 1.06;

    public static double Converter(double price, double dollars) {
        return dollars * IOF * price;
    }

}
