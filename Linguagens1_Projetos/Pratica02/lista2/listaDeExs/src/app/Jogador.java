package app;

import java.util.Scanner;

public class Jogador {
    
    String nome;
    String jogada;
    

    Scanner sc = new Scanner(System.in);


    public void criarNomeJogador() {
        
        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.println("Digite sua jogada: ");
        jogada = sc.nextLine();
    }
    

}

