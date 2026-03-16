import java.util.Scanner;
public class exercício2
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Digite o primeiro número:");
	    double n1 = sc.nextDouble();
	    
	    System.out.println("Digite o segundo número:");
	    double n2 = sc.nextDouble();
	    
	    if (n1 > n2){
	        System.out.println("O maior número é: " + n1);
	        
	    }else if (n2 > n1){
	        System.out.println("O maior número é: " + n2);
	        
	    }else{
	        System.out.println("Os números são iguais");
	    }
	}
}