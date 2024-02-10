import java.util.Scanner;

public class Retangulo {
    static double largura;
    static double altura;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Altura: ");
        altura = sc.nextDouble();

        System.out.println("Largura: ");
        largura = sc.nextDouble();

        retan(largura, altura);

        sc.close();

        
    }

    public static void retan(double largura, double altura){
        double area = largura * altura;
        double peri = 2 * (largura + altura);

        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + peri);
    }
}
