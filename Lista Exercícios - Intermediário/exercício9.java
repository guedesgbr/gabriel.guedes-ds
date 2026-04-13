import java.util.Scanner;

public class exercício9 {

    static void cadastrar(String nome) {
        System.out.println("Aluno cadastrado: " + nome);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome do aluno 1: ");
        String nome1 = entrada.nextLine();
        cadastrar(nome1);

        System.out.print("Digite o nome do aluno 2: ");
        String nome2 = entrada.nextLine();
        cadastrar(nome2);
    }
}