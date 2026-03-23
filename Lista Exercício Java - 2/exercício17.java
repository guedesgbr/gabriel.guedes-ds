import java.util.Scanner;
public class exercício17
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Digite o primeiro número:");
	    double numero1 = sc.nextDouble();
	    
	    System.out.println("Digite o segundo número:");
	    double numero2 = sc.nextDouble();
	    
	    if (numero1 > 0 && numero2 > 0){
	        System.out.println("A soma dos números é: " + (numero1 + numero2));
	        
	    }else{
	        System.out.println("Valores inválidos");
	    }
	}
}