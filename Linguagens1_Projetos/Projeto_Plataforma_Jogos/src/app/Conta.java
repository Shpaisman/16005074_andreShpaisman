package app;

import java.util.ArrayList;

public class Conta {
    
    private Usuario user;
    private ArrayList<Jogo> jogos;
    private double creditos;



    public Conta(Usuario user) {
        this.user = user;
        creditos = 0.0;
        jogos = new ArrayList<>();
    }
    
    public void addCreditos(double valor){        
        this.creditos += valor;
    }

    public void addJogo(Jogo jogo){
        jogos.add(jogo);
    }

    /**
     * @return the jogos
     */
    public ArrayList<Jogo> getJogos() {
        return jogos;
    }

    /**
     * @return the creditos
     */
    public double getCreditos() {
        return creditos;
    }

    public String getInfo(){
        String resposta = "";
        resposta = String.format("{user: %s,credits: %f,jogos: [", user.getNick(),this.creditos);
        for(Jogo jogo:jogos){
            resposta += jogo.getInfo() + ",";
        }
        resposta += "]}";
        return resposta;
    }
   
}

