package models;

import java.util.Random;

import controller.Orders;
import enums.FormaPgto;
import interfaces.Apresentar;

//import enums.Estado;
//import enums.FormaPgto;


public class Pedido implements Apresentar{     
    String descricao;
    double valor;
    FormaPgto formaPgto;
    //Estado estado;

    public Pedido(String descricao, double valor, FormaPgto formaPgto){
        this.descricao = descricao;
        this.valor = valor;
        this.formaPgto = formaPgto;
    }
    
    public void escolherFormaDePagamento(){

    }

    @Override
    public void Apresentacao() {
        System.out.println("id: "  +" Descricao: " + descricao + " Valor: " + valor + " Forma de Pgto: " + formaPgto);
    }

}