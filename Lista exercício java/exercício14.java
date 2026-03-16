import java.util.Scanner;
public class exercício14
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Digite a distância em km: ");
	    double distancia = sc.nextDouble();
	    
	    System.out.println("Digite o consumo médio do carro: ");
	    double consumo = sc.nextDouble();
	    
	    double gasto = distancia / consumo;
	    
	    System.out.println("Litros gastos: "+ gasto);
	    
    }
}