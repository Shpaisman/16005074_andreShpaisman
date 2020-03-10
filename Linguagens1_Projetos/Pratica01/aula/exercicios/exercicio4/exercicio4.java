import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Digite a frase:");   
        Scanner palindromo = new Scanner(System.in);
        
        String str = palindromo.nextLine();
        String reverso = "";
        
        
        for(int i = str.length() - 1; i >= 0; i--)
        {
            reverso = reverso + str.charAt(i);
        }
        
        
        if (reverso.equals(str)){
            System.out.println("Eh um palindromo");
        }
        else{
            System.out.println("Nao eh palindromo");
        }
        palindromo.close();

       
        
    }
}