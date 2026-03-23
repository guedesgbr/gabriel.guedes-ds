import java.util.Scanner;
public class Exercício10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o 1º Número: ");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o 2º Número: ");
        int numero2 = scanner.nextInt();

        int diferencaAbsoluta = Math.abs(numero1 - numero2);

        System.out.println("A diferença absoluta entre os dois número é: " + diferencaAbsoluta + ".");
    }
}