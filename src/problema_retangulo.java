import java.util.Locale;
import java.util.Scanner;
import entities.retangulo;

import static entities.retangulo.altura;
import static entities.retangulo.largura;

public class problema_retangulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com a largura e altura do retângulo: ");
        largura = sc.nextDouble();
        altura = sc.nextDouble();

        System.out.println("Area: " + retangulo.area(largura,altura));
        System.out.println("Perimetro: " + retangulo.perimetro(largura,altura));
        System.out.println("diagonal: " + retangulo.diagonal());

    }
}
