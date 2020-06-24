package models;

public class Usuarios {
    private String nome;
    private String email;
    private String senha = "1";// ALTERAR DEPOIS "123456";
    
    public String getSenha() {
        return senha;
    }
}