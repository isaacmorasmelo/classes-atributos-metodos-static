import entities.Bar;

import java.util.Locale;
import java.util.Scanner;

public class bill {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Sexo: ");
        Bar.gender = sc.next().charAt(0);

        System.out.print("Quantidade de cervejas: ");
        Bar.beer = sc.nextInt();

        System.out.print("Quantidade de refrigerantes: ");
        Bar.softDrink = sc.nextInt();

        System.out.print("Quantidade de espetinhos: ");
        Bar.barbecue = sc.nextInt();

        System.out.println("RELATÓRIO: ");

        System.out.printf("Consumo = R$ %.2f\n",Bar.feeding());


        if (Bar.feeding()<=30) {
            System.out.println("Couvert = R$" + Bar.cover());
        } else {
            System.out.println("Incento de Couvert");
        }

        System.out.printf("Ingresso = R$ %.2f",Bar.ticket());
        System.out.println();
        System.out.printf("Valor a Pagar = R$ %.2f", Bar.total());
    }
}
