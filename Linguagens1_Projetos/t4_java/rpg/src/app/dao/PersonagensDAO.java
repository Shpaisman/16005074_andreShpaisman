package app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import app.model.Personagem;
import app.utils.Constants;

public class PersonagensDAO {
    
    
    private Connection connection;
    public PersonagensDAO(String myConnection){
        try {
            connection = DriverManager.getConnection(myConnection);
            connection.setAutoCommit(false);
        } catch (SQLException e) {
            e.printStackTrace();
            connection = null;
        }
    }

    public boolean insertPersonagem(Personagem personagem){
        PreparedStatement comandoSQL;
        try {
            comandoSQL = connection.prepareStatement(Constants.getInsert(Constants.TABELA_PERSONAGENS, 12));
            comandoSQL.setString(1, personagem.nome);            

        }
    }
}
