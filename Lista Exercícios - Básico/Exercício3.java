import java.util.Scanner;
public class Exercício3
    
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
	    
	    int soma=0;
	    int num;
	    System.out.print("Entre com um numero: ");
	    num = sc1.nextInt();
	    
	    while (num!=0)
	    {
	        soma = soma+num;
	        System.out.print("Entre com outro número para ser somado (ou 0 para ver o resultado) ");
	        num = sc1.nextInt();
	    }
	    
	    System.out.println("O valor final é de "+soma);
		
	}
}