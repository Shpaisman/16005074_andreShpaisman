package models;

public class Usuarios {
    private String nome;
    private String email;
    private String senha = "123456";
    
    
    /** 
     * @return String
     */
    public String getSenha() {
        return senha;
    }
}