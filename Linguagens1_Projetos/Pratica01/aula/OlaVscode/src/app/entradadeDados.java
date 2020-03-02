package app;
import java.util.Scanner;

public class entradadeDados {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String nome;
        System.out.println("Informe seu nome:");
        nome = scanner.nextLine();
        System.out.println("Ola " + nome);
        int n1,n2;
        System.out.println("Informe dois numeros");
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();
        System.out.println("Soma:" + (n1+n2));

    }
}