import java.util.Scanner;
public class Exercício5
    
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		 
		 System.out.print("Digite com um número de 1 a 7: ");
		 int num = sc1.nextInt();
		 
		 switch(num) {
		 
		     case 1:
		         System.out.println("Segunda Feira!");
		         break;
		     case 2:
		         System.out.println("Terça Feira!");
		         break;
		     case 3:
		         System.out.println("Quarta Feira!");
		         break;
		     case 4:
		         System.out.println("Quinta Feira!");
		         break;
		     case 5:
		         System.out.println("Sexta Feira!");
		         break;
		     case 6:
		         System.out.println("Sabádo!");
		         break;
		      case 7:
		          System.out.println("Domingo!");
		          break;
		      default:
		          System.out.println("Dia da Semana invalido!");
    	          break;	 
		 }
	}
}