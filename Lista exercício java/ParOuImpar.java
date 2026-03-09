import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        System.out.print(" Digite O Número Inteiro: ");
        int numero = new Scanner(System.in).nextInt();

        if (numero % 2 == 0) System.out.println("Esse número é Par");
        else System.out.println("Esse número é Ímpar");
    }
}
