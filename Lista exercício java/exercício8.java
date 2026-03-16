import java.util.Scanner;
public class exercício8
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Valor do produto:");
	    double valor = sc.nextDouble();
	    
	    if (valor > 100){
	        valor = valor - (valor * 0.20);
	        
	    }else{
	        valor = valor - (valor * 0.10);
	    }
	    
	    System.out.println("Valor final: " + valor);
	}
}