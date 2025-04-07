package com.infnet;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class User{
    private String nome;
    private String email;
    private ECargo cargo;

    public boolean atualizarEmail(String email){
        if(!email.contains("@")){
            return false;
        }

        if(email.contains(" ")){
            return false;
        }

        this.email = email;
        return true;
    }   

    private void definirCargo(ECargo cargo){
        this.cargo = cargo;
    }

    private void exibirDetalhes(){
        System.err.println(nome);
        System.out.println("\tE-mail : " + email + "\n\tCargo : " + cargo);
    }

}