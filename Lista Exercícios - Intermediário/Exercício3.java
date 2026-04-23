import java.util.Scanner;

public class Exercício3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tentativas = 0;

        while (tentativas < 3) {
            System.out.print("Usuário: ");
            String u = sc.nextLine();

            System.out.print("Senha: ");
            String s = sc.nextLine();

            if (u.equals("admin") && s.equals("123")) {
                System.out.println("Login OK");
                return;
            }

            tentativas++;
            System.out.println("Erro!");
        }

        System.out.println("Bloqueado");
        sc.close();
    }
}