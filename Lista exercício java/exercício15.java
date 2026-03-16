import java.util.Scanner;
public class exercício15
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Digite a sua idade: ");
	    int idade = sc.nextInt();
	    
	    if(idade <= 12){
	        System.out.println("Você é uma criança.");
	    }
	    else if (13 <= idade && idade <= 17){
	        System.out.println("Você é um adolecente.");
	    }
	    else if (18 <= idade && idade <= 59){
	        System.out.println("Você é um adulto.");
	    }else{
	        System.out.println("Você é um idoso.");
	    }
    }
}