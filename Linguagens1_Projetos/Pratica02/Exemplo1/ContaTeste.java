package Exemplo1;

public class ContaTeste {

    public static void main(String[] args) {
        Conta c1;
        
        c1 = new Conta();
        c1.titular = "Ronald";
        System.out.println("Mr. Satan C1: " + c1.titular);
        
        Conta c2 = new Conta();
        c2.titular = "Picolo";
        System.out.println("Titular C2: " + c2.titular);
    
        c1.saldo = 2000;
        c1.visualizarSaldo();
        c1.sacar(300);
        c1.visualizarSaldo();
        c1.transferirDinheiro(c2, 1000);
        c1.visualizarSaldo();
        c2.visualizarSaldo();
    }
}