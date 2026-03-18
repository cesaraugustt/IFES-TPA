package main.lista;

import java.util.ArrayList;

import main.colecao.IColecao;

public class ListaEncadeadaArrayList<T> implements IColecao<T>{   
    private final ArrayList<T> lista = new ArrayList<T>();
    
    @Override
    public void adicionar(T novoValor) {
        lista.add(novoValor);
    }

    @Override
    public T pesquisar(T valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pesquisar'");
    }

    @Override
    public boolean remover(T valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remover'");
    }

    @Override
    public int quantidadeNos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'quantidadeNos'");
    }

}