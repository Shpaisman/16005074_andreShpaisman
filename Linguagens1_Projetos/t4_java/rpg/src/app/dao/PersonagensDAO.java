package app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import app.model.Personagem;
import app.utils.Constants;

public class PersonagensDAO {
    private Connection connection;

    public PersonagensDAO(String myConnection) {
        try {
            connection = DriverManager.getConnection(myConnection);
            connection.setAutoCommit(false);
        } catch (SQLException e) {
            e.printStackTrace();
            connection = null;
        }
    }

    public boolean insertPersonagem(Personagem personagem) {
        PreparedStatement comandoSQL;
        try {
            comandoSQL = connection.prepareStatement(Constants.getInsert(Constants.TABELA_PERSONAGENS, 13));
            comandoSQL.setString(2, personagem.nome);
            comandoSQL.setString(3, personagem.raca);
            comandoSQL.setString(4, personagem.profissao);
            comandoSQL.setNull(5, Types.INTEGER);
            comandoSQL.setNull(6, Types.INTEGER);
            comandoSQL.setNull(7, Types.INTEGER);
            comandoSQL.setNull(8, Types.INTEGER);
            comandoSQL.setNull(9, Types.INTEGER);
            comandoSQL.setNull(10, Types.INTEGER);
            comandoSQL.setNull(11, Types.INTEGER);
            comandoSQL.setNull(12, Types.INTEGER);
            comandoSQL.setNull(13, Types.INTEGER);
            comandoSQL.setNull(1, Types.INTEGER);
            comandoSQL.executeUpdate();
            connection.commit();

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } catch (NullPointerException e) {
            e.printStackTrace();
            return false;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public List<Personagem> getAllPersonagens() {
        List<Personagem> personagensList = new ArrayList<>();
        try {
            Statement comandoSql = connection.createStatement();
            ResultSet rs = comandoSql.executeQuery(Constants.selectAll(Constants.TABELA_PERSONAGENS));
            while (rs.next()) {
                Personagem personagem = new Personagem(rs.getString("nome"), rs.getString("raca"),
                        rs.getString("profissao"), rs.getInt("mana"), rs.getInt("ataque"), rs.getInt("ataqueMagico"),
                        rs.getInt("defesa"), rs.getInt("defesaMagica"), rs.getInt("velocidade"), rs.getInt("destreza"),
                        rs.getInt("xp"), rs.getInt("lvl"));
                        
                personagem.id = rs.getInt("id");
                personagensList.add(personagem);
            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return personagensList;

    }

}
