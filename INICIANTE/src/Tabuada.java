import java.util.Scanner;

public class Tabuada {
    static int x;// numero para calculo
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero: ");
        x = sc.nextInt();
        tabu(x);
        


        sc.close();// fim scanner
    }//fim da main

    public static void tabu(int x){
        for(int i = 1; i<=10; i++){
            System.out.println(x + " * " + i + " = " + x * i);
        }
    }
}//fim da classe
