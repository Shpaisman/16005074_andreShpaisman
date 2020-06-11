package models;
import java.util.Random;

import enums.FormaPgto;
import interfaces.Apresentar;




public class Pedido implements Apresentar{     
    String descricao;
    double valor;
    FormaPgto formaPgto;
    String idGerado;
   

    public Pedido(String id, String descricao, double valor, FormaPgto formaPgto){
        this.idGerado = geradorId();
        this.descricao = descricao;
        this.valor = valor;
        this.formaPgto = formaPgto;
    }

    private String geradorId(){
        Random random = new Random();
        String idGerado = "";
        for(int i=0;i<3;i++)
            idGerado += random.nextInt(10);
        return idGerado;
    }
   
    @Override
    public void Apresentacao() {
        System.out.println("id: " + idGerado +" - Descricao: " + descricao + " - Valor: " + valor + " - Forma de Pgto: " + formaPgto);
    }


    
}

  

    