import java.util.Scanner;

public class exercício5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = entrada.nextLine();

        String[] palavras = frase.split(" ");

        System.out.println("Quantidade de palavras: " + palavras.length);
    }
}