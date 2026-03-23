import java.util.Scanner;
public class Exercício4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o Preço do Produto: ");
        double preco = scanner.nextDouble();

        double impostoE = preco + (preco * 5)/100;
        double impostoF = preco + (preco * 7)/100;
        double total = impostoE + impostoF; 

        System.out.println("O preço total é igual a R$" + total + ".");
    }
}