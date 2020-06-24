package controller;

import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.Scanner;

import enums.Estado;
import enums.FormaPgto;
import models.Pedido;

public class Orders {
    final static Scanner sc = new Scanner(System.in);
    private ArrayList<Pedido> listaPedidos = new ArrayList<Pedido>();
    private FormaPgto fPgto;
    

    public void addListaPedidos(Pedido pedido) {
        this.listaPedidos.add(pedido);
    }

    public void ApresentarPedidos() {
        for (Pedido pedido : listaPedidos) {
            pedido.Apresentacao();
        }
    }

    public void definirFormaDePgto(){
        int codigo;
        System.out.println("Defina a forma de pagamento: ");
        System.out.println("1 - Dinheiro");
        System.out.println("2 - Débito");
        System.out.println("3 - Crédito");
        System.out.println("4 - Vale alimentação");
        System.out.println("5 - Vale Refeição");
        codigo = sc.nextInt();

        switch (codigo) {
            case 1:
            fPgto = FormaPgto.DINHEIRO;
                break;
            case 2:
            fPgto = FormaPgto.DEBITO;
                break;
            case 3:
            fPgto = FormaPgto.CREDITO;
                break;
            case 4:
            fPgto = FormaPgto.VALE_ALIMENTACAO;
                    break;    
            case 5:
            fPgto = FormaPgto.VALE_REFEICAO;
                break;
            default:
                break;
        }
    }
    
    public FormaPgto getfPgto() {
        return fPgto;
    }
  
    public void alterarEstado(String id){
        for(Pedido pedido : listaPedidos){
            if(id.equals(pedido.getIdGerado())){
                int codigo;
                System.out.println("Defina o estado do pedido: ");
                System.out.println("1 - Realizado");
                System.out.println("2 - Preparação");
                System.out.println("3 - Saiu para entrega");
                System.out.println("4 - Entregue");
                System.out.println("5 - Devolvido");
                codigo = sc.nextInt();
                switch (codigo) {
                    case 1:
                    pedido.setEstado(Estado.REALIZADO);
                        break;
                    case 2:
                    pedido.setEstado(Estado.PREPARACAO);
                        break;
                    case 3:
                    pedido.setEstado(Estado.SAIU_PARA_ENTREGA);
                        break;
                    case 4:
                    pedido.setEstado(Estado.ENTREGUE);
                        break;
                    case 5:
                    pedido.setEstado(Estado.DEVOLVIDO);
                        break;
                    default:
                        break;
                }
            }
        }
    }
}