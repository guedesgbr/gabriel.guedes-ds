import java.util.Scanner;
public class Exercício9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o Valor do Salário Bruto: ");
        float salarioBruto = scanner.nextFloat();

        if (salarioBruto < 2000) {
            float desconto8 = salarioBruto - (salarioBruto * 8) / 100;
            System.out.println("O salário líquido é de R$" + desconto8 + " .");
        }
        else if (salarioBruto >= 2000 && salarioBruto <= 3000) {
            float desconto9 = salarioBruto - (salarioBruto * 9) / 100;
            System.out.println("O salário líquido é de R$" + desconto9 + " .");
        }
        else {
            float desconto11 = salarioBruto - (salarioBruto * 11) / 100;
            System.out.println("O salário líquido é de R$" + desconto11 + " .");
        }
    }
}