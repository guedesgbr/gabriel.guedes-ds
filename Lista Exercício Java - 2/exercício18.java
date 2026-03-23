import java.util.Scanner;
public class exercício18
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Digite a quantidade de segundos:");
	    int segundos = sc.nextInt();
	    
	    int horas = segundos / 3600;
	    int minutos = (segundos % 3600) / 60;
	    int segundosRestantes = segundos % 60;
	    
	    System.out.println("O tempo convertido é:");
	    System.out.println("Horas: " + horas);
	    System.out.println("Minutos: " + minutos);
	    System.out.println("Segundos restantes: " + segundosRestantes);
	}
}