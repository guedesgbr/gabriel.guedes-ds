import java.util.Scanner;
public class exercício9
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Digite o primeiro número:");
	    int n1 = sc.nextInt();
	    
	    System.out.println("Digite o segundo número:");
	    int n2 = sc.nextInt();
	    
	    if (n1 % n2 == 0){
	        System.out.println("É múltiplo");
	        
	    }else{
	        System.out.println("Não é múltiplo");
	    }
	}
}