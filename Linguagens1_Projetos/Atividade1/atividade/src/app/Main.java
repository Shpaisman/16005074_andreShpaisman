package app;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String nome1, nome2, nome3;
        System.out.println("Informe o nome do usuario 1: ");     
        nome1 = sc.nextLine();
        System.out.println("Informe o nome do usuario 2: ");     
        nome2 = sc.nextLine();
        System.out.println("Informe o nome do usuario 3: ");     
        nome3 = sc.nextLine();

        Usuarios user = new Usuarios(nome1, "senha", "email");   
        Usuarios user2 = new Usuarios(nome2, "senha", "email");
        Usuarios user3 = new Usuarios(nome3, "senha", "email");

        Conta conta = new Conta(user, 1000.00);     
        Conta conta2 = new Conta(user2, 250.00);
        Conta conta3 = new Conta(user3, 3000.00);

        System.out.println("Estado Inicial: ");
        System.out.println("Nome do Usuario: " + user.getNome() + " -- Saldo: " + conta.getSaldo());
        System.out.println("Nome do Usuario: " + user2.getNome() + " -- Saldo: " + conta2.getSaldo());
        System.out.println("Nome do Usuario: " + user3.getNome() + " -- Saldo: " + conta3.getSaldo());

        String qrCode = Transacoes.gerarQRcode(conta, 250);
        String[] s = qrCode.split(";");
        double valor = Double.parseDouble(s[2]);

        Transacoes.transferir(conta2, conta, valor);
        Transacoes.transferir(conta3, conta, valor);
        Transacoes.transferir(conta2, conta, valor);
        
        String qrCode2 = Transacoes.gerarQRcode(conta2, 1000);
        String[] s2 = qrCode2.split(";");
        double valor2 = Double.parseDouble(s2[2]);

        Transacoes.transferir(conta3, conta2, valor2);

        System.out.println("Estado Final: ");
        System.out.println("Nome do Usuario: " + user.getNome() + " -- Saldo: " + conta.getSaldo() + " ID: " + conta.getIdConta());
        System.out.println("Nome do Usuario: " + user2.getNome() + " -- Saldo: " + conta2.getSaldo() + " ID: " + conta2.getIdConta());
        System.out.println("Nome do Usuario: " + user3.getNome() + " -- Saldo: " + conta3.getSaldo() + " ID: " + conta3.getIdConta());
        
        
        sc.close();
    }
}