package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String nome, genero, descricao;
        Integer escolha;

        
        

        System.out.println("Informe nick:");
        String nick;
        nick = sc.nextLine();
        
        Usuario usuario = new Usuario(nick, "senha", "email");
        
        System.out.println("Informe nome, genero, descricao do jogo:");
        nome = sc.nextLine();
        genero = sc.nextLine();
        descricao = sc.nextLine();

        Jogo jogo = new Jogo(nome, genero, descricao);
        System.out.println("J1 :" + jogo.getInfo());

        Conta conta = new Conta(usuario);
        conta.addJogo(jogo);
        System.out.println("Dados da conta do " + usuario.getNick() + ": " + conta.getInfo());
        

        Sistema sys = new Sistema();
        sys.addConta(conta);
        sys.addJogo(jogo);
        System.out.println("Contas criadas: " + sys.getInfo());

                
        System.out.println("1- add conta.  2- add jogo na conta. 4- Sair.");
        escolha = sc.nextInt();

        switch (escolha) {
            case 1:
                
                sys.addConta(conta);
                System.out.println("Contas criadas: " + sys.getInfo());
                break;
            case 2:
                conta.addJogo(jogo);
                System.out.println("Jogo :" + jogo.getInfo());
            default: 
                break;
        }
    
        
        sc.close();
    } 
    
}
