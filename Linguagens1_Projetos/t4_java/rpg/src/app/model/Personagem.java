package app.model;

public class Personagem {

    String nome;
    String raca;
    String profissao;
    int mana;
    int ataque;
    int ataqueMagico;
    int defesa;
    int defesaMagica;
    int velocidade;
    int destreza;
    int xp;
    int lvl;
    
	public Personagem(String nome, String raca, String profissao, int mana, int ataque, int ataqueMagico, int defesa,
			int defesaMagica, int velocidade, int destreza, int xp, int lvl) {
		this.nome = nome;
		this.raca = raca;
		this.profissao = profissao;
		this.mana = mana;
		this.ataque = ataque;
		this.ataqueMagico = ataqueMagico;
		this.defesa = defesa;
		this.defesaMagica = defesaMagica;
		this.velocidade = velocidade;
		this.destreza = destreza;
		this.xp = xp;
		this.lvl = lvl;
	}
    
    
}