import java.util.Scanner;
public class Exercício7
    
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
         
        System.out.print("Digite um número e receba os números pares até ele: ");
        int num = sc1.nextInt();
          
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}