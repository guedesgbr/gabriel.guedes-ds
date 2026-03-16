import java.util.Scanner;
public class exercício18
{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de kWh utilizados:");
        double kwh = sc.nextDouble();

        double valor;

        if (kwh < 100) {
            valor = kwh * 0.20;
        } else {
            valor = kwh * 0.25;
        }

        System.out.println("Valor a pagar: R$ " + valor);
    }
}