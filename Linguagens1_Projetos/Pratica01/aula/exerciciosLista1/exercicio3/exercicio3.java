import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) throws Exception {
        
        String nomeAuth, senhaAuth, inputNome, inputSenha;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu usuario para cadastrar:  ");     
        inputNome = sc.nextLine();
        
        System.out.print("Digite sua senha para cadastrar:  ");
        inputSenha = sc.nextLine();
        
        

        do{
            System.out.print("Digite seu usuario para autenticar:  ");     
            nomeAuth = sc.nextLine();

            System.out.print("Digite sua senha para autenticar:  ");
            senhaAuth = sc.nextLine();
        }
        while ((!inputNome.equals(nomeAuth) || !inputSenha.equals(senhaAuth)));
       
        sc.close();
    }
}