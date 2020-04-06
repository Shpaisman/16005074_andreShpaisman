package app;

public class Conta {
    private Usuarios user;
    private double saldo;
    private int idConta;
    private static int contagemDeContas = 0;

    public Conta(Usuarios user, double saldo) {
        this.user = user;
        contagemDeContas += 1; 
        this.idConta = contagemDeContas;
        this.saldo = saldo;
    }

    
    public void addSaldo(double valor){
        this.saldo += valor;
    }
    
    public void lessSaldo(double valor){
            this.saldo -= valor;      
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }
    
    /**
     * @return the idConta
     */
    public int getIdConta() {
        return idConta;
    }

    /**
     * @return the user
     */
    public Usuarios getUser() {
        return user;
    }
    }
