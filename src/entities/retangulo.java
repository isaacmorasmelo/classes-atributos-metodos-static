package entities;

public class retangulo {
        public static double largura;
        public static double altura;

        public static double area(double largura, double altura){
            return largura * altura;
        }

        public static double perimetro(double largura,double altura){
            return largura * 2 + altura * 2;
        }

        public static double diagonal(){
            return Math.sqrt((largura*largura)+(altura*altura));
        }
}
