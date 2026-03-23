import java.util.Scanner;
public class Exercício7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a Distância do Trajeto (km): ");
        double distancia = scanner.nextDouble();

        System.out.println("Informe a Velocidade Média (km/h): ");
        double velocidadeM = scanner.nextDouble();

        double tempoEstimado = distancia / velocidadeM; 

        System.out.println("O tempo estimado de viagem é igual a " + tempoEstimado + " horas.");
    }
}