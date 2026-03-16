import java.util.Scanner;
public class exercício20
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("lado 1:");
	    double lado1 = sc.nextDouble();
	    
	    System.out.println("lado 2:");
	    double lado2 = sc.nextDouble();
	    
	    System.out.println("lado 3:");
	    double lado3 = sc.nextDouble();
	    
	    if ((lado1 + lado2) <= lado3 || (lado1 + lado3) <= lado2 || (lado2 + lado3) <= lado1){
	        System.out.println("Não é triangulo");
	        
	    }else if (lado1 == lado2 && lado2 == lado3){
	        System.out.println("Triângulo Equilátero");
	        
	    }else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
	        System.out.println("Triângulo Isóceles");
	        
	    }else{
	        System.out.println("Triângulo Escaleno");
	    }
	}
}