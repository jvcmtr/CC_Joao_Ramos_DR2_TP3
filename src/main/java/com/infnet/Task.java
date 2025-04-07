package com.infnet;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Task{
    private final int id;
    private final String titulo;
    private final String descricao;    
    private final User responsavel;
    private final EStatus status;

    public Task atribuirResponsavel( User responsavel){
        return new Task(id, titulo, descricao, responsavel, status);
    }
    
    public Task alterarStatus(EStatus status ){
        return new Task(id, titulo, descricao, responsavel, status);
    }
    
    public void exibirDetalhes(){
        System.out.println(titulo.toUpperCase());
        System.out.println(descricao);
        System.out.println("\t status : "+ status.toString().toUpperCase());
        System.out.println("\t Responsavel : "+ responsavel.getNome());
    }

    public boolean equals(Task tarefa){
        return tarefa.id == this.id;
    }
}