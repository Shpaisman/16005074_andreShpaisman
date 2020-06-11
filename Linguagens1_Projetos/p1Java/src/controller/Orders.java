package controller;

import java.util.ArrayList;
import java.util.Scanner;

import enums.FormaPgto;
import models.Pedido;

public class Orders {
    final static Scanner sc = new Scanner(System.in);
    public ArrayList<Pedido> listaPedidos = new ArrayList<Pedido>();
    private FormaPgto fPgto;

    public void addListaPedidos(Pedido pedido) {
        this.listaPedidos.add(pedido);
    }

    public ArrayList<Pedido> getListaPedidos() {
        return listaPedidos;
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
}