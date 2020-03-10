import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) throws Exception {
        int soma = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero para ter seus algarismos somados");
        int numero = sc.nextInt();
        sc.close();

        while(numero > 0){
            soma +=(numero%10);
            numero /= 10;
            
        }
        
        System.out.println("A soma dos algarismos é: " + soma);
        }


    }
