import java.util.Scanner;

public class Media {
    static double x;
    static double y;
    static double z;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Primeiro número: ");
        x = sc.nextDouble();
        System.out.println("Digite o segundo número:");
        y = sc.nextDouble();
        System.out.println("Terceiro numero:");
        z = sc.nextDouble();

        media(x, y, z);

        sc.close();
    }

    public static void media(Double x, Double y, Double z){

        String resultado = String.format("%.2f", (x + y +z)/ 3);
        System.out.println("A média dos número digitados é:" + resultado);
    }
}