package controller;

import java.util.Scanner;

import interfaces.AuthInterface;
import models.Usuarios;

public class AuthCheck implements AuthInterface {
    Scanner sc = new Scanner(System.in);

    public boolean conferirSenha(String senha) {
        Usuarios user = new Usuarios();
        
        if (senha.equals(user.getSenha())) {
            return true;
        } else
            return false;

    }
}