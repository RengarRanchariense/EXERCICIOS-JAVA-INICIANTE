import java.util.Scanner;

public class Perimetro {
    static double pi = 3.14;
    static double raio;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o raio: ");
        raio = sc.nextDouble();

        circ(raio);

        sc.close();
        
    }

    public static void circ(double raio){
        double per = 2*pi *raio;
        double are = 2 * (Math.pow(pi, 2));

        System.out.println("Area da circu: " + are);
        System.out.println("Perimetro: " + per);
    }
}
