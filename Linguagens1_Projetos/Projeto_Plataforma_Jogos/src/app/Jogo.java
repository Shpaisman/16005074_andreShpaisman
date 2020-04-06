package app;

public class Jogo {
    private String genero;
    private String nome;
    private Boolean multiplayer;
    private Boolean online;
    private String descricao;


    public Jogo(String genero, String nome, String descricao) {
        this.genero = genero;
        this.nome = nome;
        this.descricao = descricao;
        multiplayer = false;
        online = false;
        
    }

    /**
     * @return the multiplayer
     */
    public Boolean getMultiplayer() {
        return multiplayer;
    }

    /**
     * @param multiplayer the multiplayer to set
     */
    public void setMultiplayer(Boolean multiplayer) {
        this.multiplayer = multiplayer;
    }
    /**
     * @return the online
     */
    public Boolean getOnline() {
        return online;
    }
    /**
     * @param online the online to set
     */
    public void setOnline(Boolean online) {
        this.online = online;
    }
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }
    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }
    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }
    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }
    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getInfo(){
        return String.format("{nome:%s, genero:%s, descricao:%s}", this.genero, this.nome,  this.descricao);
        //aqui daria para usar o getNome / get... em vez do this.
    }
}