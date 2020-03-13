package app;

/**
 * Jogo2spock
 */
public class Jogo2spock {

    String pedra = "Pedra";
    String papel = "Papel";
    String tesoura = "Tesoura";
    String lizard = "Lizard";
    String spock = "Spoke";

    public void partida(Jogador p1, Jogador p2) {
        
        if(p1.jogada.equalsIgnoreCase(tesoura) && p2.jogada.equalsIgnoreCase(papel)) {
            System.out.println(p1.nome + " Venceu e cortou " + p2.nome);
        }
        else if(p1.jogada.equalsIgnoreCase(papel) && p2.jogada.equalsIgnoreCase(pedra)) {
            System.out.println(p1.nome + " Venceu e encobriu o " + p2.nome);
        }
        else if(p1.jogada.equalsIgnoreCase(pedra) && p2.jogada.equalsIgnoreCase(lizard)){
            System.out.println(p1.nome + " Venceu e destruiu o " + p2.nome);
        }
        else if(p1.jogada.equalsIgnoreCase(lizard) && p2.jogada.equalsIgnoreCase(spock)){
            System.out.println(p1.nome + " Venceu e envenenou o " + p2.nome);
        }
        else if(p1.jogada.equalsIgnoreCase(spock) && p2.jogada.equalsIgnoreCase(tesoura)){
            System.out.println(p1.nome + " Venceu e esmagou " + p2.nome);
        }
        else if(p1.jogada.equalsIgnoreCase(tesoura) && p2.jogada.equalsIgnoreCase(lizard)){
            System.out.println(p1.nome + " Venceu e decaptou o " + p2.nome);
        }
        else if(p1.jogada.equalsIgnoreCase(lizard) && p2.jogada.equalsIgnoreCase(papel)){
            System.out.println(p1.nome + " Venceu e comeu o " + p2.nome);
        }
        else if(p1.jogada.equalsIgnoreCase(papel) && p2.jogada.equalsIgnoreCase(spock)){
            System.out.println(p1.nome + " Venceu e desaprova do " + p2.nome);
        }
        else if(p1.jogada.equalsIgnoreCase(spock) && p2.jogada.equalsIgnoreCase(pedra)){
            System.out.println(p1.nome + " Venceu e vaporizou " + p2.nome);
        } 
        else if(p1.jogada.equalsIgnoreCase(pedra) && p2.jogada.equalsIgnoreCase(tesoura)){
            System.out.println(p1.nome + " Venceu  " + p2.nome + " como sempre.");
        } 
        else if(p1.jogada.equalsIgnoreCase(p2.jogada)){
            System.out.println("empate");
        }
        else
          System.out.println("Lembre-se que as opcoes sao pedra, papel, tesoura, lizard e spock");

    }
   
}
