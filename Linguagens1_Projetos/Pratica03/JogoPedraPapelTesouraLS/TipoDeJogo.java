package com.company;


import java.util.Scanner;

public class TipoDeJogo {
    Scanner sc = new Scanner();
    int escolha;
    System.out.println("Informe o nome o tipo de jogo:");
    String escolha = scanner.nextLine();
    
    public void escolhaDoJogo(){
        if(escolha == 1){
        Jogo jogo = new Jogo();
        jogo.jogar();
        }
        else if(escolha == 2){  
            Jogo jogoLS = new JogoLS();
            jogoLS.jogar();
    
        }
    }
    
}