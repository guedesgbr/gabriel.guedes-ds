import java.util.Scanner;

public class exercício10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int estoque = 10;
        int opcao;

        do {
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Remover produto");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    estoque++;
                    break;
                case 2:
                    estoque--;
                    break;
            }

            System.out.println("Estoque atual: " + estoque);

        } while (opcao != 0);
    }
}