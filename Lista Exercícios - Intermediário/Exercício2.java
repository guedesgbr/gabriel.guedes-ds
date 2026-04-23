import java.util.Scanner;

public class Exercício2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu CPF: ");
        String cpf = sc.nextLine();

        if (cpf.length() == 14 &&
            cpf.charAt(3) == '.' &&
            cpf.charAt(7) == '.' &&
            cpf.charAt(11) == '-') {

            System.out.println("Formato válido");
        } else {
            System.out.println("Formato inválido");
        }

        sc.close();
    }
}