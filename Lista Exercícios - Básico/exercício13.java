import java.util.Scanner;

public class exercício13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int somaPares = 0;
        int somaImpares = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = sc.nextInt();

            if (numero % 2 == 0) {
                somaPares += numero;
            } else {
                somaImpares += numero;
            }
        }

        System.out.println("Soma dos pares: " + somaPares);
        System.out.println("Soma dos ímpares: " + somaImpares);
    }
}