package app;

import java.util.ArrayList;

public class Sistema {
    private ArrayList<Conta> contas;
    private ArrayList<Jogo> jogos;
   

    public Sistema() {
        contas = new ArrayList<>();
        jogos = new ArrayList<>();
    }

    public void addConta(Conta conta){
        contas.add(conta);
    }

    public void addJogo(Jogo jogo){
        jogos.add(jogo);
    }
    /**
     * @return the contas
     */
    public ArrayList<Conta> getContas() {
        return contas;
    }
    /**
     * @return the jogos
     */
    public ArrayList<Jogo> getJogos() {
        return jogos;
    }

    public String getInfo(){
        String resposta = "";
        resposta = String.format("{Contas:[", this.contas);
        for(Conta conta : contas) {
            resposta += conta.getInfo() + ",";
        }
        resposta += "]}";
        return resposta;
        
    }
}