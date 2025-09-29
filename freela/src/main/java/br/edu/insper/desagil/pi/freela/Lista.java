package br.edu.insper.desagil.pi.freela;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Lista {
    private List<Tarefa> tarefas;

    public Lista(){

        tarefas = new ArrayList<>();
    }
    public List<Tarefa> getTarefas() {
        return tarefas;
    }
    public void adiciona(Tarefa tarefa){
        for(Tarefa i : tarefas){
                tarefas.add(i);
            }

        }
    }


