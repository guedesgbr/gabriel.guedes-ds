import java.util.Scanner;
public class exercício4
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Nota 1:");
	    double n1 = sc.nextDouble();
	    
	    System.out.println("Nota 2:");
	    double n2 = sc.nextDouble();
	    
	    System.out.println("Nota 3:");
	    double n3 = sc.nextDouble();
	    
	    double média = (n1 + n2 + n3) / 3;
	    
	    if (média >= 7){
	        System.out.println("Aprovado");
	        
	    }else if (média >= 5){
	        System.out.println("Recuperação");
	        
	    }else{
	        System.out.println("Reprovado");
	    }
	}
}