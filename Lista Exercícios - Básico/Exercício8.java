import java.util.Scanner;
public class Exercício8
{
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        
           int senha = 1234 ;
           int tent ;
        
        for (int i = 1 ; i<3 ; i++)
        {
            System.out.print("Entre com a senha: ");
            tent = sc1.nextInt();
            
            if (tent != senha)
            {
                System.out.println("Senha Incorreta, tente novamente.");
            }
            else {
                System.out.print("Senha correta!");
                System.exit(0);
            }
        }
    }
}