package entities;

public class funcionarios {
    public String Name;
    public double GrossSalary;
    public double Tax;

    public double NetSalary(){
        GrossSalary = GrossSalary - Tax;
    }

    public double IncreaseSalary(double percentage){
        GrossSalary += GrossSalary*(percentage/100);
    }

    public String toString(){
        return Name + ", " + GrossSalary;
    }
}
