package br.edu.insper.desagil.pi.tocha;

import java.util.ArrayList;
import java.util.List;

public class Sequencia {
    private List<Filtro> filtros;

    public Sequencia() {
        this.filtros = new ArrayList<>();
    }

    public void adiciona(Filtro filtro) {
        filtros.add(filtro);
    }

    public void remove(int indice) {
        filtros.remove(indice);
    }


    public Imagem processa(Imagem imagem) {
        for (Filtro filtro : filtros) {
            imagem = filtro.processa(imagem);
        }
        return imagem;
    }
}
