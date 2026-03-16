import java.util.Scanner;
public class exercício3
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Digite um número:");
	    double numero = sc.nextDouble();
	    
	    if (numero > 0){
	        System.out.println("Número positivo");
	        
	    }else if (numero < 0){
	        System.out.println("Número negativo");
	        
	    }else{
	        System.out.println("Número zero");
	    }
	}
}