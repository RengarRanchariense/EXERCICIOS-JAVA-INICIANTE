import java.util.Scanner;

public class Menor {

    static double x;
    static double y;
    static double z;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        x = sc.nextDouble();
        System.out.print("Digite o segundo numero: ");
        y = sc.nextDouble();
        System.out.print("Digite o terceiro numero: ");
        z = sc.nextDouble();
        ver(x, y, z);

        sc.close();
    }

    public static void ver(double x, double y, double z){
        if(x < y && x < z){
            System.out.println("O menor valor é: " + x);
        }
        else if(y < x && y < z){
            System.out.println("O menor número é: " + y);
        }
        else{
            System.out.println("O menor número é: " + z);
        }
    }
}