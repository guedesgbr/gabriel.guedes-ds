import java.util.Scanner;

public class exercício16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int a = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int b = sc.nextInt();

        int resultado = 0;
        int contador = 0;

        while (contador < b) {
            resultado += a;
            contador++;
        }

        System.out.println("Resultado: " + resultado);
    }
}