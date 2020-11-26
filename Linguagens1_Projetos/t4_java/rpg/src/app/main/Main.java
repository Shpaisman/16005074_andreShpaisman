package app.main;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import app.dao.PersonagensDAO;
import app.model.Personagem;


public class Main {
    private PersonagensDAO personagensDAO;
    private List<Personagem> personagensList;

    public Main() {
        personagensList = new ArrayList<>();
    }

    static Scanner sc = new Scanner(System.in);

    public void run() {
        do {
            menu();
            int opt = sc.nextInt();
            int id;
            Personagem resultPersonagem;
            switch (opt) {
                case 1:
                    String nome, raca, profissao;
                    int mana, ataque, ataqueMagico, defesa, defesaMagica, velocidade, destreza, xp, lvl;
                    System.out.println("Informe: ");
                    System.out.println("Nome: ");
                    nome = sc.next();
                    System.out.println("Raça: ");
                    raca = sc.next();
                    System.out.println("Profissão: ");
                    profissao = sc.next();
                    System.out.println("Mana: ");
                    mana = sc.nextInt();
                    System.out.println("Ataque: " );
                    ataque = sc.nextInt();
                    System.out.println("Ataque Magico: ");
                    ataqueMagico = sc.nextInt();
                    System.out.println("Defesa: ");
                    defesa = sc.nextInt();
                    System.out.println("Defesa Magica: ");
                    defesaMagica = sc.nextInt();
                    System.out.println("Velocidade: ");
                    velocidade = sc.nextInt();
                    System.out.println("Destreza: ");
                    destreza = sc.nextInt();
                    System.out.println("Experciência: ");
                    xp = sc.nextInt();
                    System.out.println("Level: ");
                    lvl = sc.nextInt();

                    Personagem personagem = new Personagem(nome, raca, profissao, mana, ataque, ataqueMagico, defesa,
                            defesaMagica, velocidade, destreza, xp, lvl);

                    PersonagensDAO.getInstance().insertPersonagem(personagem);
                    break;
                case 2:
                  
                    break;

                case 3:
                    personagensList = PersonagensDAO.getInstance().getAllPersonagens();
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
