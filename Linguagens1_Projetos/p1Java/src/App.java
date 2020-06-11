import java.util.Scanner;

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
        while (run) {
            System.out.println("Pizzaria o Rato que Ri:");
            System.out.println("1 - Nova venda");
            System.out.println("2 - Verificar Pedidos");
            System.out.println("3 - Alterar Pedidos");
            System.out.println("0 - Sair");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:

                    break;
                case 2:

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
}
