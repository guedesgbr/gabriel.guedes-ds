import java.util.Scanner;
public class exercício12
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Digite o valor em reais:");
	    double valorReais = sc.nextDouble();
	    
	    System.out.println("Digite a cotação do dólar:");
	    double cotacaoDolar = sc.nextDouble();
	    
	    double valorDolares = valorReais / cotacaoDolar;
	    
	    System.out.println("O valor em dólares é: " + valorDolares);
	}
}