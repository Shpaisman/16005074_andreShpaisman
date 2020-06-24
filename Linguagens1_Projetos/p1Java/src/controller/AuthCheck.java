package controller;

import java.util.Scanner;

import interfaces.AuthInterface;
import models.Usuarios;

public class AuthCheck implements AuthInterface {
    Scanner sc = new Scanner(System.in);

    
    /** 
     * @param senha
     * @return boolean
     */
    public boolean conferirSenha(String senha) {
        Usuarios user = new Usuarios();
        
        if (senha.equals(user.getSenha())) {
            return true;

        } else
            System.out.println("Senha incorreta");
            return false;

    }
}