package br.edu.insper.desagil.pi.freela;

public abstract class Momento {

    int minAno = 1970;
    int maxAno= 2070;
    int minMes =1;
    int maxMes=12;
    int minDia=1;
    int maxDia= 31;

    public int ajusta(int valor, int minimo, int maximo) {
        if (valor < minimo) {
            return minimo;
        }
        if (valor > maximo) {
            return maximo;
        } else {
            return valor;
        }
    }


    public abstract int minutos();
}
