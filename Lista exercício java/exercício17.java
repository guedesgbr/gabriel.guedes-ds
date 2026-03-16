import java.util.Scanner;
public class exercício17
{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota:");
        double nota = sc.nextDouble();

        System.out.println("Digite a frequencia (%):");
        double frequencia = sc.nextDouble();

        if (nota >= 7 && frequencia >= 75) {
            System.out.println("Aluno Aprovado.");
        } else {
            System.out.println("Aluno Reprovado.");
        }
    }
}