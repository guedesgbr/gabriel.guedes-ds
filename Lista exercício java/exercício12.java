import java.util.Scanner;
public class exercício12
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Digite o primeiro numero: ");
	    double n1 = sc.nextDouble();
	    
	    System.out.println("Digite o segundo numero: ");
	    double n2 = sc.nextDouble();
	    
	    System.out.println("Digite o operador (+ - * /): ");
	    char operador = sc.next().charAt(0);
	    
	    double resultado = 0;
	    
	    if(operador == '+'){
	        resultado = n1 + n2;
	    }
	    else if(operador == '-'){
	        resultado = n1 - n2;
	    }
	    else if(operador == '*'){
	        resultado = n1 * n2;
	    }
	    else if(operador == '/'){
	        resultado = n1 / n2;
	    }
	    
	    System.out.println("Resultado: " + resultado);
	}
}