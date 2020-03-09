package Exemplo1;

public class Conta{
    //atributos
    public int numero;
    public String titular, cpf;
    public double saldo;
    //MÉTODOS
    
    boolean sacar(double valor){
        if (this.saldo<valor){
            return false;
        }
        else{
            this.saldo -= valor;
            return true;
        }
    }
    
    boolean depositar(double valor){
        this.saldo += valor;
        return true;
    }

    void visualizarSaldo(){
        System.out.println("Saldo: " + this.saldo);
    }
    
    boolean transferirDinheiro(Conta destino, double valor){
    if (sacar(valor)){
        destino.depositar(valor);
        return true;
    }else
        return false;        
    }}

    
