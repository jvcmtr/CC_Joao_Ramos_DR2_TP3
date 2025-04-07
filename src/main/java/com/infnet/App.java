package com.infnet;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
        User eu = new User(0,"joao cicero", "joao.ramos@al.infnet.edu.br", ECargo.ESTAGIARIO, 24, new BigDecimal(999999));
        String loremIpsum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc lacus metus, gravida vitae tellus vitae, facilisis tincidunt dolor. Suspendisse maximus, eros eu bibendum fringilla, ligula lorem posuere neque, id molestie felis mauris a diam. Duis nec erat vitae tellus tempor malesuada. Suspendisse finibus finibus turpis, in egestas ipsum suscipit sagittis";
        List<Task> tarefas = new ArrayList<Task>();
        tarefas.add(
            new Task(0, "TP1", loremIpsum, eu, EStatus.DONE)
        );
        tarefas.add(
            new Task(1, "TP2", loremIpsum, eu, EStatus.DONE)
        );
        tarefas.add(
            new Task(2, "TP3", loremIpsum, eu, EStatus.IN_PROGRESS)
        );
        tarefas.add(
            new Task(3, "Assessment AT", loremIpsum, eu, EStatus.TODO)
        );

        Sprint sprint = new Sprint(0, "Clean Code e Boas Praticas", LocalDate.of(2025, 1, 21), LocalDate.of(2025, 4, 8), tarefas);

        List<Sprint> list = new ArrayList<Sprint>();
        list.add(sprint);
        list.add(sprint);
        list.add(sprint);

        Project projeto = new Project(0, "DR2", "Clean Code e Boas Praticas", list );
        
        projeto.listarSprints();
        sprint.listarTarefas();
    }
}
