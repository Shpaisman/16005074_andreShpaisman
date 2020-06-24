package models;

import java.util.Random;
import java.util.Scanner;

import enums.Estado;
import enums.FormaPgto;
import interfaces.Apresentar;




public class Pedido implements Apresentar{     
    private String descricao;
    private double valor;
    private FormaPgto formaPgto;
    private String idGerado;
    private Estado estado;
    Scanner sc = new Scanner(System.in);
    public Pedido(String descricao, double valor, FormaPgto formaPgto, Estado estado){
        this.idGerado = geradorId();
        this.descricao = descricao;
        this.valor = valor;
        this.formaPgto = formaPgto;
        this.estado = estado;
    }

    
    /** 
     * @return String
     */
    private String geradorId(){
        Random random = new Random();
        String idGerado = "";
        for(int i=0;i<3;i++)
            idGerado += random.nextInt(10);
        return idGerado;
    }

    
    /** 
     * @return Estado
     */
    private Estado getEstado() {
        return estado;
    }

    
    /** 
     * @return String
     */
    public String getIdGerado() {
        return idGerado;
    }


    
    /** 
     * @param estado
     */
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    

    @Override
    public void Apresentacao() {
        System.out.println("id: " + idGerado +" - Descricao: " + descricao + " - Valor: " + valor + " - Forma de Pgto: " + formaPgto + " - Estado do pedido: " + getEstado());
    }




    
}

  

    