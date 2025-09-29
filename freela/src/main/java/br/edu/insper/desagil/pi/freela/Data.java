package br.edu.insper.desagil.pi.freela;

import java.util.HashMap;
import java.util.Map;

public class Data extends Momento {
    private int ano;
    private int mes;
    private int dia;
    private Map<Integer, Integer> limite;
    public Data(int ano,int mes,int dia){
        this.ano = 1970;
        this.mes= 1;
        this.dia = 1;
        Map<Integer, Integer> limite = new HashMap<>();
        limite.put(1, 31);
        limite.put(2, 28);
        limite.put(3, 31);
        limite.put(4, 30);
        limite.put(5, 31);
        limite.put(6, 30);
        limite.put(7, 31);
        limite.put(8, 31);
        limite.put(9, 30);
        limite.put(10, 31);
        limite.put(11, 30);
        limite.put(12, 31);
        this.limite = limite;

    }

    public int getDia() {
        return dia;
    }

    public int getMes(){
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public void atualiza(int novoAno, int novoMes, int novoDia) {
        this.ano= novoAno;
        this.mes=novoMes;
        this.dia=novoDia;

    }

    @Override
    public int minutos(){
        return minutos;

    }
}
