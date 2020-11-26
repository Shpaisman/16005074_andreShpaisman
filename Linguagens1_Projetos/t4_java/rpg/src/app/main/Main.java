package app.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import app.dao.PersonagensDAO;
import app.model.Personagem;
import app.utils.Constants;

public class Main {
    private PersonagensDAO personagensDAO;
    private List<Personagem> personagensList;

    public Main() {
        personagensDAO = new PersonagensDAO(Constants.URL_MEU_BANCO);
        personagensList = new ArrayList<>();
    }

    static Scanner sc = new Scanner(System.in);

    public void run() {
        do {
            menu();
            int opt = sc.nextInt();
            switch (opt) {
                case 1:
                    String nome, raca, profissao;
                    int mana, ataque, ataqueMagico, defesa, defesaMagica, velocidade, destreza, xp, lvl;
                    System.out.println("Informe: ");
                    nome = sc.next();
                    raca = sc.next();
                    profissao = sc.next();
                    mana = sc.nextInt();
                    ataque = sc.nextInt();
                    ataqueMagico = sc.nextInt();
                    defesa = sc.nextInt();
                    defesaMagica = sc.nextInt();
                    velocidade = sc.nextInt();
                    destreza = sc.nextInt();
                    xp = sc.nextInt();
                    lvl = sc.nextInt();

                    Personagem personagem = new Personagem(nome, raca, profissao, mana, ataque, ataqueMagico, defesa,
                            defesaMagica, velocidade, destreza, xp, lvl);
                    personagensDAO.insertPersonagem(personagem);
                    break;
                case 2:
                  
                    break;

                case 3:
                    personagensList = personagensDAO.getAllPersonagens();
                    for (Personagem p : personagensList) {
                        System.out.println("ID: " + p.id);
                        System.out.println("Nome: " + p.nome);
                        System.out.println("Raça: " + p.raca);
                        System.out.println("Profissão: " + p.profissao);
                        System.out.println("Mana: " + p.mana);
                        System.out.println("Ataque: " + p.ataque);
                        System.out.println("Ataque Magico: " + p.ataqueMagico);
                        System.out.println("Defesa: " + p.defesa);
                        System.out.println("Defesa Magica: " + p.defesaMagica);
                        System.out.println("Velocidade: " + p.velocidade);
                        System.out.println("Destreza: " + p.destreza);
                        System.out.println("Experciência: " + p.xp);
                        System.out.println("Level: " + p.lvl);
                        System.out.println("");

                    }
                    break;

                default:
                    break;
            }
        } while (true);

    }

    public void menu() {
        System.out.println("1. Criar personagem");
        System.out.println("2. Alterar personagem existente");
        System.out.println("3. Consultar os personagens existentes");
        System.out.println("4. Deletar personagem");
    }

}
