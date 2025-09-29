package br.edu.insper.desagil.pi.freela;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;

public class ListaTest {
    private Lista lista;
    Tarefa tarefa1 = mock(Tarefa.class);
    Tarefa tarefa2 = mock(Tarefa.class);

    @BeforeEach
    void setup(){
        lista = new Lista();


    }
    @Test
    void constroi(){
        assertNull(lista.getTarefas());
    }
    @Test
    void adicionaIguais(){
        lista.adiciona(tarefa1);
        lista.adiciona(tarefa1);
        assertEquals(1,lista.getTarefas().size());
    }
    @Test
    void adicionaDiferentes(){
        lista.adiciona(tarefa1);
        lista.adiciona(tarefa2);
        assertEquals(2,lista.getTarefas().size());
    }
}
