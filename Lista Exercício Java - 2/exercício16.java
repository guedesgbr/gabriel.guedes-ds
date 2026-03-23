import java.util.Scanner;
public class exercício16
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Digite um número:");
	    int numero = sc.nextInt();
	    
	    if (numero >= 10 && numero <= 50){
	        System.out.println("O número está dentro do intervalo");
	        
	    }else{
	        System.out.println("O número está fora do intervalo");
	    }
	}
}