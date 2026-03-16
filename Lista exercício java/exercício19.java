import java.util.Scanner;
public class exercício19
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int menor;
	    System.out.println("Digite o primeiro número: ");
	    int numero1 = sc.nextInt();
	    
	    System.out.println("Digite o segundo número: ");
	    int numero2 = sc.nextInt();
	    
	    System.out.println("Digite o terceiro número: ");
	    int numero3 = sc.nextInt();
	    
	    if(numero1 <= numero2 && numero1 <= numero3){
	        menor = numero1;
	    }
	    else if (numero2 <= numero1 && numero2 <= numero3){
	        menor = numero2;
	        
	    }else{
	        menor = numero3;
	    }
	    System.out.println("O menor número é: "+ menor);
	}
}