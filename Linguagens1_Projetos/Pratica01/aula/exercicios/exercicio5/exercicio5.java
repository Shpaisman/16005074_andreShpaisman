import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) throws Exception {
        
        int t1 = 0, t2 = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("digite o numero termos na sequencia: ");
        int numero = input.nextInt();
        System.out.print("primeiros " + numero + " termos: ");

        for (int i = 1; i <= numero; ++i)
        {
            System.out.print(t1 + " ");

            int soma = t1 + t2;
            t1 = t2;
            t2 = soma;
        }
       
        
    }
}