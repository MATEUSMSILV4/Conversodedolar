package Util;

public class CurrencyConverter {

    public static  double valorReais(double dolar, double cotacao) {
        return cotacao * dolar;
    }

    // Método para calcular o valor em reais com IOF
    public static double valorComIOF(double valorReais) {
        double iof = 0.06;
        return valorReais * (1 + iof);
    }

}
