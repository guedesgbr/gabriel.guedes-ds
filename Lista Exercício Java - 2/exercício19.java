import java.util.Scanner;
public class exercício19
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Digite a primeira palavra:");
	    String palavra1 = sc.next();
	    
	    System.out.println("Digite a segunda palavra:");
	    String palavra2 = sc.next();
	    
	    System.out.println("Digite a terceira palavra:");
	    String palavra3 = sc.next();
	    
	    String maiorPalavra = palavra1;
	    
	    if (palavra2.length() > maiorPalavra.length()){
	        maiorPalavra = palavra2;
	    }
	    
	    if (palavra3.length() > maiorPalavra.length()){
	        maiorPalavra = palavra3;
	    }
	    
	    System.out.println("A maior palavra é: " + maiorPalavra);
	}
}