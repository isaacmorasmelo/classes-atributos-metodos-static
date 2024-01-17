import java.util.Locale;
import java.util.Scanner;
import entities.funcionarios;

public class problema_funcionarios {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        funcionarios funcionarios = new funcionarios();

        System.out.print("Nome: ");
        funcionarios.Name = sc.nextLine();

        System.out.print("Salário bruto: ");
        funcionarios.GrossSalary = sc.nextDouble();

        System.out.print("Imposto: ");
        funcionarios.Tax = sc.nextDouble();

        funcionarios.netSalary();
        System.out.println("Funcionário: " + funcionarios.toString());

        System.out.println("Qual a porcentagem para aumentar o salário? ");
        double L = sc.nextDouble();
        funcionarios.IncreaseSalary(L);

        System.out.println("Dados atualizados: " + funcionarios.toString());
    }
}
