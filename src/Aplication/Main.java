package Aplication;

import Util.CurrencyConverter;

import java.util.Scanner;

import static Util.CurrencyConverter.valorComIOF;
import static Util.CurrencyConverter.valorReais;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        System.out.print("Digite a cotação atual do dólar: ");
        double cotacaoDolar = scanner.nextDouble();

        System.out.print("Digite o valor em dólares: ");
        double valorDolar = scanner.nextDouble();

        double valorReaisSemIOF = valorReais(valorDolar, cotacaoDolar);

        double valorReaisComIOF = valorComIOF(valorReaisSemIOF);


        System.out.printf("O valor em reais com IOF é: R$ %.2f%n", valorReaisComIOF);

        scanner.close();
    }
}