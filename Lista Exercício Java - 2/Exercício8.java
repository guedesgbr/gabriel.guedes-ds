import java.util.Scanner;
public class Exercício8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o Salário: ");
        float salario = scanner.nextFloat();

        System.out.println("Informe o Valor da Parcela: ");
        int parcela = scanner.nextInt();

        float calculo = (salario * 30) / 100;

        if (parcela > calculo) {
            System.out.println("A autorização de empréstimo autorizada.");
        }
        else{
            System.out.println("A autorização de empréstimo negada.");
        }
    }
}