import java.util.Scanner;

public class Exercício4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor: ");
        int v = sc.nextInt();

        System.out.println("100: " + v / 100);
        v %= 100;

        System.out.println("50: " + v / 50);
        v %= 50;

        System.out.println("20: " + v / 20);
        v %= 20;

        System.out.println("10: " + v / 10);
        v %= 10;

        System.out.println("5: " + v / 5);
        v %= 5;

        System.out.println("2: " + v / 2);
        v %= 2;

        System.out.println("1: " + v);
        
        sc.close();
    }
}