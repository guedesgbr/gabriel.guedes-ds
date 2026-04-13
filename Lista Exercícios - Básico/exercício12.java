import java.util.Scanner;

public class exercício12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número inicial: ");
        int inicio = sc.nextInt();

        for (int i = inicio; i >= 0; i--) {
            System.out.println(i);
        }
    }
}