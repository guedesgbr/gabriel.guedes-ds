import java.util.Scanner;

public class exercício15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String resposta = "";

        while (!resposta.equalsIgnoreCase("sim")) {
            System.out.print("Digite 'sim' para continuar: ");
            resposta = sc.nextLine();
        }

        System.out.println("Resposta aceita");
    }
}