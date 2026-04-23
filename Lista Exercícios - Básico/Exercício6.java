import java.util.Scanner;
public class Exercício6
{
    
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		 
		  int opcao = -1; 

        while (opcao != 0) {
            System.out.println("--- MENU ---");
            System.out.println("1 - Hamburguer");
            System.out.println("2 - Batata Frita");
            System.out.println("3 - Sorvete");
            System.out.println("Escolha uma opção: ");
            
            opcao = sc1.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Seu Hamburgueruer esta sendo preparado!");
                    break;
                case 2:
                    System.out.println("Sua Batata esta fritando!");
                    break;
                case 3:
                    System.out.println("Estamos pegando seu sorvete!");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
		 }
	}
}