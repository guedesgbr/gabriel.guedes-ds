import java.util.Scanner;
public class exercício11
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Digite o ano: ");
	    int ano = sc.nextInt();
	    
	    ano = ano % 4;
	    int ano2 = ano % 400;
	    
	    if (ano == 0){
	        System.out.println("Esse ano é bissexto");
	    }
	    else if (ano2 == 0){
	        System.out.println("Esse ano é bissexto");
	    }else{
	        System.out.println("Esse ano não é bissexto");
	    }
	    
	}
}