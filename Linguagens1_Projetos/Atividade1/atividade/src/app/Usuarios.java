//Andre Shpaisman 16.00507-4

package app;

public class Usuarios {
    private String nome;
    private String senha;
    private String email;
    

    public Usuarios(String nome, String senha, String email) {
    this.nome = nome;
    this.senha = senha;
    this.email = email;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

}