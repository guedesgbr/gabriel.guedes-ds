import java.util.Scanner;
public class exercício7
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Temperatura em Celsius:");
	    double c = sc.nextDouble();
	    
	    double f = (c * 9/5) + 32;
	    
	    System.out.println("Temperatura em Fahrenheit: " + f);
	}
}