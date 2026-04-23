import java.util.Scanner;

public class Exercício1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soma = 0, num, maior = 0, menor = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite seu Número: ");
            num = sc.nextInt();

            soma += num;

            if (i == 1) {
                maior = menor = num;
            } else {
                if (num > maior) maior = num;
                if (num < menor) menor = num;
            }
        }

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + (soma / 5.0));
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);

        sc.close();
    }
}