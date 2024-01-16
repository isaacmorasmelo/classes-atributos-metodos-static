import java.util.Locale;
import java.util.Scanner;
import entities.funcionarios;

public class problema_funcionarios {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        funcionarios funcionarios = new funcionarios();

        System.out.print("nome: ");
        funcionarios.Name = sc.nextLine();

        System.out.print("Salário Bruto: ");
        funcionarios.GrossSalary = sc.nextDouble();

        System.out.print("imposto: ");
        funcionarios.Tax = sc.nextDouble();

        funcionarios.NetSalary();
        System.out.println("Funcionario: " + funcionarios.toString());

        System.out.println("qual a porcentagem pra aumentar o salário? ");
    }
}
