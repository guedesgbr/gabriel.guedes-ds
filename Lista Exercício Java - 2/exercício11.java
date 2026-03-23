import java.util.Scanner;
public class exercício11
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Digite o primeiro número:");
	    int numero1 = sc.nextInt();
	    
	    System.out.println("Digite o segundo número:");
	    int numero2 = sc.nextInt();
	    
	    System.out.println("Digite o terceiro número:");
	    int numero3 = sc.nextInt();
	    
	    if (numero1 > numero2){
	        int aux = numero1;
	        numero1 = numero2;
	        numero2 = aux;
	    }
	    
	    if (numero1 > numero3){
	        int aux = numero1;
	        numero1 = numero3;
	        numero3 = aux;
	    }
	    
	    if (numero2 > numero3){
	        int aux = numero2;
	        numero2 = numero3;
	        numero3 = aux;
	    }
	    
	    System.out.println("Os números em ordem crescente são:");
	    System.out.println(numero1);
	    System.out.println(numero2);
	    System.out.println(numero3);
	}
}