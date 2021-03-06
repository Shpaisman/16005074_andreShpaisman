import java.util.Scanner;

import controller.AuthCheck;
import controller.Orders;
import enums.Estado;
import models.Pedido;

public class App {

    /**
     * @param args
     * @throws Exception
     */
    final static Scanner sc = new Scanner(System.in);

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Boolean run = true;
        Orders orders = new Orders();
        AuthCheck aCheck = new AuthCheck();

        while (run) {
            System.out.println("Pizzaria o Rato que Ri:");
            System.out.println("1 - Nova venda");
            System.out.println("2 - Verificar Pedidos");
            System.out.println("3 - Alterar Pedidos");
            System.out.println("0 - Sair");
            int menu = sc.nextInt();
            String senha;
            switch (menu) {
                case 1:
                    System.out.println("Insira sua senha: ");
                    senha = sc.next();
                    if (aCheck.conferirSenha(senha) == true) {
                        Pedido p = novoPedido();
                        orders.addListaPedidos(p);
                    } else
                    
                    break;
                case 2:
                    orders.ApresentarPedidos();
                    break;
                case 3:
                    orders.ApresentarPedidos();
                    System.out.println("Insira o id do produto: ");
                    String id = sc.next();
                    orders.alterarEstadoDoPedido(id);
                    break;
                case 0:
                    run = false;
                default:
                    break;
            }
            System.out.println();
        }
    }

    
    /** 
     * @return Pedido
     */
    public static Pedido novoPedido() {
        System.out.println("DESCRICAO");
        String descricao = sc.next();
        System.out.println("VALOR");
        double valor = sc.nextInt();
        Orders orders = new Orders();
        orders.definirFormaDePgto();

        return new Pedido(descricao, valor, orders.getfPgto(), Estado.REALIZADO);

    }

   
}
