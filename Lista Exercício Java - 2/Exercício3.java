import java.util.Scanner;
public class Exercício3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a 1ª Nota: ");
        float nota1 = scanner.nextFloat();
        
        System.out.println("Informe a 2ª Nota: ");
        float nota2 = scanner.nextFloat();

        System.out.println("Informe a 3ª Nota: ");
        float nota3 = scanner.nextFloat();

        System.out.println("Informe o Peso da 1ª Nota: ");
        float peso1 = scanner.nextFloat();
        
        System.out.println("Informe o Peso da 2ª Nota: ");
        float peso2 = scanner.nextFloat();

        System.out.println("Informe o Peso da 3ª Nota: ");
        float peso3 = scanner.nextFloat();

        float mediaP = (nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3) / (peso1 + peso2 + peso3);

        System.out.println("A média ponderada das notas informadas é igual a " + mediaP + ".");
    }
}