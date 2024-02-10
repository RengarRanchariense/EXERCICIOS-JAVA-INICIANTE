import java.util.Scanner;

public class Operacoes {
    static int x;
    static int y;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        x = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        y = sc.nextInt();

        operac(x, y);

        sc.close();
    }

    public static void operac(int x, int y){
        int add = x + y;
        int mult = x * y;
        int sub = x - y;
        int div = x / y;
        int rest = x % y;

        System.out.println(x + " + " + y + " = " + add);
        System.out.println(x + " * " + y + " = " + mult);
        System.out.println(x + " - " + y + " = " + sub);
        System.out.println(x + " / " + y + " = " + div);
        System.out.println(x + " % " + y + " = " + rest);
    }
}
