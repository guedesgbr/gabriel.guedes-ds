import java.util.Scanner;

public class exercício14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.print("Escolha uma opção: ");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Você escolheu Somar");
                break;
            case 2:
                System.out.println("Você escolheu Subtrair");
                break;
            case 3:
                System.out.println("Você escolheu Multiplicar");
                break;
            case 4:
                System.out.println("Você escolheu Dividir");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}