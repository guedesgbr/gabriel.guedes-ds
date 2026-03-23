import java.util.Scanner;
public class exercício13
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Digite o peso:");
	    double peso = sc.nextDouble();
	    
	    System.out.println("Digite a altura:");
	    double altura = sc.nextDouble();
	    
	    double imc = peso / (altura * altura);
	    
	    if (imc < 18.5){
	        System.out.println("Classificação: Abaixo do peso");
	        
	    }else if (imc < 25){
	        System.out.println("Classificação: Peso normal");
	        
	    }else{
	        System.out.println("Classificação: Acima do peso");
	    }
	}
}