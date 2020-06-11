package controller;

import java.util.ArrayList;

import enums.FormaPgto;
import models.Pedido;

public class Orders {
    
    public ArrayList<Pedido> listaPedidos = new ArrayList<Pedido>();
    public ArrayList<FormaPgto> fPgtos = new ArrayList<FormaPgto>();


    public void addListaPedidos(Pedido pedido){
        this.listaPedidos.add(pedido);
    }

    public ArrayList<Pedido> getListaPedidos(){
        return listaPedidos;
    }

    public void ApresentarPedidos(){
        for(Pedido pedido : listaPedidos){
            pedido.Apresentacao();
        }

    
    }
}