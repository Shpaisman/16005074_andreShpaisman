import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) throws Exception {
        int soma = 0, produto = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("valor inicial: ");
        int inicial = input.nextInt();
        System.out.println("valor final: ");
        int fim = input.nextInt();
        
        if (inicial < fim){
            for(int i = inicial; i < fim+1; i++){
                soma += i;
                produto = produto * i;
                
            }

        }
        System.out.println("A soma eh " + soma + " e o produto eh " + produto);
    }
}