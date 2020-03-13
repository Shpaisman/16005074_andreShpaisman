package app;

import java.util.Scanner;

/**
 * App
 */
public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Jogador p1 = new Jogador();
        Jogador p2 = new Jogador();
        int decisao;

        
        
    System.out.println("1- normal; 2- nerd");
    decisao = sc.nextInt();
    
    if(decisao == 1){
        System.out.println("modo casual selecionado. Suas opcoes sao pedra, papel e tesoura.");
        p1.criarNomeJogador();
        p2.criarNomeJogador();
        Jogo partida = new Jogo();
        partida.partida(p1, p2);
    }
    else if(decisao == 2){
        System.out.println("Voce escolheu jogar o modo nerd, suas opcoes de jogada sao: pedra, papel, tesoura, lizard e spock");
        p1.criarNomeJogador();
        p2.criarNomeJogador();
        Jogo2spock partida = new Jogo2spock();
        partida.partida(p1, p2);
    }
       

    sc.close();
    }
}