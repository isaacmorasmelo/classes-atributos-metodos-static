import entities.CurrencyConverter;
import java.util.Locale;
import java.util.Scanner;

public class cambio {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
//        CurrencyConverter CurrencyConverter = new CurrencyConverter();

        System.out.println("Qual o valor do dólar?");
        CurrencyConverter.valorDolar = sc.nextDouble();

        System.out.println("Quantos dólares serão comprados?");
        CurrencyConverter.dolaresComprados = sc.nextDouble();

        CurrencyConverter.valorPago();
        CurrencyConverter.impostoIOF();
        CurrencyConverter.valorParaPagar();
        System.out.print("Valor a ser pago em reais = "+ CurrencyConverter.v);

    }
}
