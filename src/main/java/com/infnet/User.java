package com.infnet;

import java.math.BigDecimal;

import lombok.Getter;

@Getter
public class User{
    private final int id;
    private final String nome;
    private final String email;
    private final ECargo cargo;
    private final int idade;
    private final BigDecimal salario;

    public User(int id, String nome, String email, ECargo cargo, int idade, BigDecimal salario){
        validateEmail(email);
        validateIdade(idade);
        validateSalario(salario);

        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cargo = cargo;
        this.idade = idade;
        this.salario = salario;
    }

    public User atualizarEmail(String email){
        validateEmail(email);
        return new User(id, email, email, cargo, idade, salario);
    }   

    private User definirCargo(ECargo cargo){
        return new User(id, email, email, cargo, idade, salario);
    }

    private void exibirDetalhes(){
        System.out.println(nome);
        System.out.println("\tE-mail : " + email + "\n\tCargo : " + cargo);
    }

    private static void validateEmail(String email){

        if(!email.contains("@")){
            throw new IllegalArgumentException("O email do usuario deve conter '@' ");
        }

        if(email.contains(" ") || email.contains("\t")){
            throw new IllegalArgumentException("O email do usuario não pode conter espaços em branco");
        }
    }

    private static void validateSalario(BigDecimal salario){
        if(salario.compareTo( BigDecimal.ZERO ) != 1){
            throw new IllegalArgumentException("O usuario deve ter um salario maior do que zero ");
        }
    }

    private static void validateIdade(int idade){
        if(idade < 18 ){
            throw new IllegalArgumentException("O usuario deve ser maior de idade");
        }
    }
}