package enums;


public enum FormaPgto {
   //DINHEIRO(1), DEBITO(2), CREDITO(3), VALE_ALIMENTACAO(4), VALE_REFEICAO(5);
    DINHEIRO(1), DEBITO(2);

    private final int codigoFormaPgto;
    
    private FormaPgto(int codigoFormaPgto){
        this.codigoFormaPgto = codigoFormaPgto;
    }
    
    

}