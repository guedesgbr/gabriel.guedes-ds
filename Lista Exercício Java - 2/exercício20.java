import java.util.Scanner;
public class exercício20
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Digite o valor da venda:");
	    double valorVenda = sc.nextDouble();
	    
	    double comissao;
	    
	    if (valorVenda < 1000){
	        comissao = valorVenda * 0.04;
	        
	    }else if (valorVenda <= 5000){
	        comissao = valorVenda * 0.06;
	        
	    }else{
	        comissao = valorVenda * 0.08;
	    }
	    
	    System.out.println("O valor da comissão é: " + comissao);
	}
}