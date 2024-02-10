import java.util.Scanner;

public class Product {
    static int x;
    static int y;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        x = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        y = sc.nextInt();

        resultado(x, y);

        sc.close();
    }

    public static void resultado(int x, int y){
        int resultado = x * y;

        System.out.println(x + " x " + y + " = " + resultado);

    }
}
