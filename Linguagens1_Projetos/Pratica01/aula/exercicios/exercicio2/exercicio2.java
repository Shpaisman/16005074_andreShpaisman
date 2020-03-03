package app;
import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System. in);

        System.out.print("Digite seu nome1:  ");     
        String inputNome_1 = scanner.nextLine();
    
        System.out.print("Digite seu nome2:  ");
        String inputNome_2 = scanner.nextLine();  

        System.out.print("Digite sua idade_1:  ");
        Integer inputIdade_1 = scanner.nextInt();

        System.out.print("Digite sua idade_2:  ");
        Integer inputIdade_2 = scanner.nextInt();
  
        System.out.println("diferença =  " + (Math.abs(inputIdade_1 - inputIdade_2)));
       
        
    }
}