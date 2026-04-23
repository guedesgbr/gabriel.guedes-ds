import java.util.Scanner;
public class Exercício4
{
    
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Digite um numero para saber a tabuada dele: ");
		int num = sc1.nextInt();
		
		for (int i = 1 ; i<=10 ; i++)
		{
		    int resul = num*i;
		    System.out.println(num + " x " + i + " = " + resul);
		}
	    
	    
		
	}
}