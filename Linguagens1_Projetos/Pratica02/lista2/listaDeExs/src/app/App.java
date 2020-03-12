package app;

/**
 * App
 */
public class App {

    public static void main(String[] args) {
        Jogador p1 = new Jogador();
        Jogador p2 = new Jogador();
        p1.criarNomeJogador();
        p2.criarNomeJogador();
        
        Jogo partida = new Jogo();
        partida.partida(p1, p2);
        
    }
}