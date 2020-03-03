package app;
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System. in);
        

        System.out.print("Digite seu usuario para cadastrar:  ");     
        String inputNome = scanner.nextLine();

        System.out.print("Digite sua senha para cadastrar:  ");
        Integer inputSenha = scanner.nextInt();

        do{
            System.out.print("Digite seu usuario para autenticar:  ");     
            String nomeAuth = scanner.nextLine();

            System.out.print("Digite sua senha para autenticar:  ");
            Integer senhaAuth = scanner.nextInt();
        }
        while ((inputNome != nomeAuth) && (inputSenha != senhaAuth));
       
        
    }
}