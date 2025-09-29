package br.edu.insper.desagil.pi.freela;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataTest {
    private Data data;
    @BeforeEach
    void setup(){
        data = new Data(1970,1,1);
    }
    @Test
    void constroi(){
        assertEquals(1,data.getDia());
        assertEquals(1,data.getMes());
        assertEquals(1970,data.getAno());
        assertEquals(0,data.minutos());
    }
    void dataBaixa(){
        data.atualiza(0,0,1969);
        assertEquals(1,data.getDia());
        assertEquals(1,data.getMes());
        assertEquals(1970,data.getAno());
        assertEquals(0,data.minutos());
    }
    void deltaAlta(){
        data.atualiza(32,13,2071);
        assertEquals(31,data.getDia());
        assertEquals(12,data.getMes());
        assertEquals(2070,data.getAno());
        assertEquals(53084160,data.minutos());
    }
}
