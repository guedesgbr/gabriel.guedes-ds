import java.util.Scanner;

public class exercício6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[6];

        for (int i = 0; i < 6; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = entrada.nextInt();
        }

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                System.out.println(numero + " é par");
            } else {
                System.out.println(numero + " é ímpar");
            }
        }
    }
}