import java.util.Scanner;
public class Exercício1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um Número: ");
        int numero = scanner.nextInt();

        int dobro = numero * 2;
        int triplo = numero * 3;

        System.out.println("O dobro do número informado é igual a " + dobro + ". Já o triplo do mesmo é igual a " + triplo + ".");
    }
}