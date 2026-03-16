import java.util.Scanner;
public class exercício5
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Digite o salário:");
	    double salário = sc.nextDouble();
	    
	    if (salário < 2000){
	        salário = salário + (salário * 0.10);
	        
	    }else if (salário <= 4000){
	        salário = salário + (salário * 0.07);
	        
	    }else{
	        salário = salário + (salário * 0.05);
	    }
	    
	    System.out.println("Salário final: " + salário);
	}
}