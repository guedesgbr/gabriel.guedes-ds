import java.util.Scanner;

public class exercício7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double total = 0;
        int opcao;

        do {
            System.out.print("Digite o preço do produto: ");
            double preco = entrada.nextDouble();
            total += preco;

            System.out.print("Digite 1 para continuar ou 0 para parar: ");
            opcao = entrada.nextInt();

        } while (opcao != 0);

        System.out.println("Total da compra: " + total);
    }
}