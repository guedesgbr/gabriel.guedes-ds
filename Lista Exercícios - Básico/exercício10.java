import java.util.Scanner;

public class exercício10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        System.out.print("Quantas vezes repetir? ");
        int vezes = sc.nextInt();

        for (int i = 0; i < vezes; i++) {
            System.out.println(frase);
        }
    }
}