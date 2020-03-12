package app;

/**
 * Jogo
 */
public class Jogo {

    String pedra = "Pedra";
    String papel = "Papel";
    String tesoura = "Tesoura";
    

    public void partida(Jogador p1, Jogador p2) {
        
        if(p1.jogada.equalsIgnoreCase(pedra) && p2.jogada.equalsIgnoreCase(papel)) {
            System.out.println(p2.nome + " Venceu!");
        }
        else if(p1.jogada.equalsIgnoreCase(papel) && p2.jogada.equalsIgnoreCase(tesoura)) {
            System.out.println(p2.nome + " Venceu!");
        }
        else if(p1.jogada.equalsIgnoreCase(tesoura) && p2.jogada.equalsIgnoreCase(pedra)) {
            System.out.println(p2.nome + " Venceu!");
        }
        else if(p1.jogada.equalsIgnoreCase(pedra) && p2.jogada.equalsIgnoreCase(tesoura)) {
            System.out.println(p1.nome + " Venceu!");
        }
        else if(p1.jogada.equalsIgnoreCase(papel) && p2.jogada.equalsIgnoreCase(pedra)) {
            System.out.println(p1.nome + " Venceu!");
        }
        else if(p1.jogada.equalsIgnoreCase(tesoura) && p2.jogada.equalsIgnoreCase(papel)) {
            System.out.println(p1.nome + " Venceu!");
        }
        else
            System.out.println("empate");

    }
   
}