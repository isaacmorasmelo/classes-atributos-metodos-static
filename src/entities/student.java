package entities;

public class student {
    public String name;
    public double nota1;
    public double nota2;
    public double nota3;
    public double ab;
    public double ba;

    public double Ab() {
        return this.ab = nota1 + nota2 + nota3;
    }
    public double Ba(){
        return this.ba = (ab-60)*(-1);
    }

    public void nota1b() {

        if (ab >= 60.0) {
            System.out.printf("Nota final: %.2f\n", ab);
            System.out.println("PASS");
        }else {
        System.out.printf("NOTA FINAL = %.2f\n", ab);
        System.out.println("FAILED");
        System.out.printf("FALTARAM %.2f PONTOS", ba);
        }
    }
}
