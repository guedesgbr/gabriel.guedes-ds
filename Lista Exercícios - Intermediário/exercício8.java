import java.util.Scanner;

public class exercício8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int secreto = 7;
        int palpite;

        do {
            System.out.print("Digite seu palpite: ");
            palpite = entrada.nextInt();

            if (palpite < secreto) {
                System.out.println("O número é maior");
            } else if (palpite > secreto) {
                System.out.println("O número é menor");
            }

        } while (palpite != secreto);

        System.out.println("Acertou!");
    }
}