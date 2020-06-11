import java.util.Scanner;

import controller.Orders;
import enums.Estado;
import enums.FormaPgto;
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
        while (run) {
            System.out.println("Pizzaria o Rato que Ri:");
            System.out.println("1 - Nova venda");
            System.out.println("2 - Verificar Pedidos");
            System.out.println("3 - Alterar Pedidos");
            System.out.println("0 - Sair");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    Pedido p = novoPedido();
                    orders.addListaPedidos(p);
                    break;
                case 2:
                    orders.ApresentarPedidos();
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 0:
                    run = false;
                default:
                    break;
            }
            System.out.println();
        }
    }



    public static Pedido novoPedido() {
        
        System.out.println("DESCRICAO");
        String descricao = sc.next();
        System.out.println("VALOR");
        double valor = sc.nextInt();
        Orders orders = new Orders();
        orders.definirFormaDePgto();
        
        return new Pedido("IMPLEMENTAR ID " ,descricao, valor, orders.getfPgto());

    }
   
}
