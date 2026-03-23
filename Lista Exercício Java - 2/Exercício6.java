import java.util.Scanner;
public class Exercício6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um Número: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número informado é par.");
        }
        else {
            System.out.println("O número informado é ímpar.");
        }

        if (numero % 5 == 0) {
            System.out.println("O número informado é divisível por 5.");
        }
        else {
            System.out.println("O número informado não é divisível por 5.");
        }
    }
}