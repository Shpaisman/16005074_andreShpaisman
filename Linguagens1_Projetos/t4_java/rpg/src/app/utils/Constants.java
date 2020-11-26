package app.utils;

public class Constants {
    public static final String URL_MEU_BANCO = "jdbc:sqlite:sqlite.db";
    public static final int ID_NULO = -1;
    public static final String TABELA_PERSONAGENS = "personagens";
    public static final String SQL_INSERT_PERSONAGEM = "INSERT INTO "+ TABELA_PERSONAGENS + " VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?);";
    public static final String getInsert(String table, int paramsCount){
        String sqlInsert = "INSERT INTO "+ table + " VALUES (";
        for (int i = 0; i < paramsCount-1; i++) {
            sqlInsert += "?,";
        }
        sqlInsert += "?);";
        return sqlInsert;
    }
    public static final String selectAll(String table){
        return "SELECT * FROM "+table+";";
    }
}
