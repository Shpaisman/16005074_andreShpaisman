package enums;

public enum FormaPgto {
    DINHEIRO(1), DEBITO(2);//, CREDITO(3), VALE_ALIMENTACAO(4), VALE_REFEICAO(5);

    private final int valor;
    FormaPgto(int formaDePgto){
        valor = formaDePgto;
    }
    public int getValor() {
        return valor;
    }
}