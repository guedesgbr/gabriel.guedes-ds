import java.util.Scanner;
public class Exercício5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a Idade: ");
        int idade = scanner.nextInt();

        if (idade > 18) {
            System.out.println("O indivíduo já é maior de idade (+18).");
        }
        else {
            System.out.println("O indivíduo é menor de idade (-18).");
        }
    }
}