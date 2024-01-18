package entities;

public class CurrencyConverter {

    public static double valorDolar;
    public static double dolaresComprados;
    public static double multiplicacaoDosDois;
    public static double valorIOF;
    public static double v;

    public static void valorPago(){
        multiplicacaoDosDois = valorDolar * dolaresComprados;
    }

    public static void impostoIOF(){
        valorIOF = multiplicacaoDosDois * 0.06;
    }

    public static void valorParaPagar(){
        v = valorIOF + multiplicacaoDosDois;
    }
}
