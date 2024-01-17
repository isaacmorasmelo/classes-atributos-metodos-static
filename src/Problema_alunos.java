import java.util.Locale;
import java.util.Scanner;
import entities.student;

public class Problema_alunos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        student student = new student();

        student.name = sc.nextLine();
        student.nota1 = sc.nextDouble();
        student.nota2 = sc.nextDouble();
        student.nota3 = sc.nextDouble();

        student.Ab();
        student.Ba();
        student.nota1b();

    }
}
