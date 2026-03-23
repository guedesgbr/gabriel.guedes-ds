import java.util.Scanner;
public class exercício15
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Digite o preço do produto:");
	    double precoProduto = sc.nextDouble();
	    
	    if (precoProduto < 50){
	        precoProduto = precoProduto * 0.95;
	        
	    }else if (precoProduto <= 100){
	        precoProduto = precoProduto * 0.90;
	        
	    }else{
	        precoProduto = precoProduto * 0.85;
	    }
	    
	    System.out.println("O preço final do produto é: " + precoProduto);
	}
}