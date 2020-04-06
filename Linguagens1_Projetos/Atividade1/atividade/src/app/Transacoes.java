package app;

import java.util.Random;

public class Transacoes {


private static int getRandomNumberInRange(int min,int max){
    Random r = new Random();
    return r.nextInt((max-min)+1)+min;
}

public static String gerarQRcode(Conta conta, int valor){ 
    return(conta.getIdConta() + ";" + conta.getUser() + ";" + valor + ";" + getRandomNumberInRange(1000, 9999));
}

public static void transferir(Conta conta, Conta conta2, double valor){
    if(conta.getSaldo() >= valor){
        conta.lessSaldo(valor);
        conta2.addSaldo(valor);
    }
    
    
}
    
}