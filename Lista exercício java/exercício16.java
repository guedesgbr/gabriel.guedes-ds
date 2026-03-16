import java.util.Scanner;
public class exercício16
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Digite seu login:");
	    String login = sc.nextLine();
	    
	    System.out.println("Digite sua senha:");
	    String senha = sc.nextLine();
	    
	    if (login.equals("admin") && senha.equals("1234")){
	        System.out.println("Acesso liberado");
	    }else{
	        System.out.println("acesso negado");
	    }
    }
}