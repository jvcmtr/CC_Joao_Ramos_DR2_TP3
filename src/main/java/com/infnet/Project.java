package com.infnet;

import java.util.List;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Project{
    private int id;
    private String nome;
    private String descricao;
    private List<Sprint> sprints;

    public void adicionarSprint(Sprint newSprint){
        sprints.add(newSprint);
    }

    public void listarSprints(){
        System.out.println("\n\n__________________________________________________________________________");
        System.out.println("\t == Sprints do projeto " + nome +" ===\n");
        for (Sprint sprint : sprints) {
            System.out.println("# Sprint : " + sprint.getNome());
        }
    }

    public void removerSprint(int id){
        int idx = -1;
        for (int i = 0; i < sprints.size(); i++) {
            if (sprints.get(i).getId() == id){
                idx = i;
                break;
            }
        }

        if(idx != -1){
            sprints.remove(idx);
        }
    }
}