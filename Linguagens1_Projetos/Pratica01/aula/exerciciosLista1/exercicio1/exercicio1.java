package app;
import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System. in);
      
        
        System.out.print("Digite seu RA:  ");     
        String inputRA = scanner. nextLine();
    
        System.out.print("Digite seu nome:  ");
        String inputNome = scanner. nextLine();  

        System.out.print("Digite seu telefone:  ");
        String inputTel = scanner. nextLine();

        System.out.print("Digite seu email:  ");
        String inputEmail = scanner. nextLine();

        System.out.print("Digite sua idade:  ");
        String inputIdade = scanner. nextLine();

        System.out.println("RA: " + (inputRA));
        System.out.println("Nome: " + (inputNome));   
        System.out.println("Telefone: " + (inputTel));
        System.out.println("email: " + (inputEmail));
        System.out.println("idade: " + (inputIdade)); 
        
    }
}