import java.util.Scanner;
public class exercício13
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Digite a nota: ");
	    int nota = sc.nextInt();
	    
	    if(0 <= nota && nota <= 10){
	        System.out.println("Essa nota é válida.");
	    }else{
	        System.out.println("Essa nota é inválida.");
	    }
	}
}