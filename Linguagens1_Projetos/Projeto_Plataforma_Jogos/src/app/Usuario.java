package app;
// Andre Shpaisman 16.00507-4
public class Usuario {
    private String nick;
    private String password;
    private String email;


    public Usuario(String nick,String password,String email){
        this.nick = nick;
        this.password = password;
        this.email = email;
    }

    public Boolean verficarSenha(String senha){
        return(senha.equals(password));
    }
    /**
     * @return the nick
     */
    public String getNick() {
        return nick;
    }
    
}