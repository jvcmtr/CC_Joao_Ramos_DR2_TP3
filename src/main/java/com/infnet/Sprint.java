package com.infnet;

import java.time.LocalDate;
import java.util.List;

import lombok.Getter;

@Getter
public class Sprint{
    private int id;
    private String nome;
    private LocalDate dataDeInicio;
    private LocalDate dataDeTermino;
    private List<Task> tarefas;

    public Sprint( int id, String nome, LocalDate dataDeInicio, LocalDate dataDeTermino, List<Task> tarefas ){
        if(nome.length() == 0){
            throw new IllegalArgumentException("Uma sprint deve possuir um nome valido");
        }

        if(dataDeInicio.toEpochDay() > dataDeTermino.toEpochDay()){
            throw new IllegalArgumentException("A data de inicio da sprint não pode ser superior a data de termino");
        }
        
        this.id = id;
        this.nome = nome;
        this.dataDeInicio = dataDeInicio;
        this.dataDeTermino = dataDeTermino;
        this.tarefas = tarefas;
    }


    public void adicionarTarefa(Task tarefa){
        tarefas.add(tarefa);
    }

    public void listarTarefas(){
        System.out.println("\n\n__________________________________________________________________________");
        System.out.println("\t == Tarefas da sprint " + nome +" ===\n");
        for (Task tarefa : tarefas){
            System.out.print(" # Tarefa : ");
            tarefa.exibirDetalhes() ;
            System.out.println();
        }
    }

    public void removerTarefa(int id){
        int idx = -1;
        for (int i = 0; i < tarefas.size(); i++) {
            if (tarefas.get(i).equals(i)){
                idx = i;
                break;
            }
        }

        if(idx != -1){
            tarefas.remove(idx);
        }
    }
}
