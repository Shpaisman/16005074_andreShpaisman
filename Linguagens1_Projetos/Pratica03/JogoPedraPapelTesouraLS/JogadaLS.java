public class Jogada {
    private String escolha, ganhoDe, percoDe;

    public static final String PEDRA = "pedra";
    public static final String TESOURA = "tesoura";
    public static final String PAPEL = "papel";
    public static final String LIZARD = "lizard";
    public static final String SPOCK = "spock";
    //Construtor do jogada
    public JogadaLS(String opcao){
        if(opcao.equals(this.PEDRA)){
            ganhoDe = this.TESOURA;
            ganhoDe = this.LIZARD;
            percoDe = this.PAPEL;
            percoDe = this.SPOCK;
        } else if(opcao.equals("papel")){
            ganhoDe = "pedra";
            ganhoDe = "spock";
            percoDe = "tesoura";
            percoDe = "lizard";
        }else if(opcao.equals("spock")){
            ganhoDe = "pedra";
            ganhoDe = "tesoura";
            percoDe = "papel";
            percoDe = "lizard";

        }else if(opcao.equals("lizard")){
                ganhoDe = "papel";
                ganhoDe = "spock";
                percoDe = "tesoura";
                percoDe = "pedra";
        }else {
            ganhoDe = "pedra";
            ganhoDe = "spock";
            percoDe = "lizard";
            percoDe = "tesoura";
        }
        escolha = opcao;
    }

    public String getEscolha(){
        return this.escolha;
    }

    public String avaliar(Jogada jogada){
        if(jogada.getEscolha().equals(this.ganhoDe)){
            return "Ganhei!";
        } else if(jogada.getEscolha().equals(this.percoDe)){
            return "Perdi!";
        }
        else{
            return "Empate!";
        }
    }
}
