package main.lista;

import main.colecao.IColecao;

public class ListaEncadeada<T> implements IColecao<T>{
    private No<T> primeiro;
    private No<T> ultimo;
    private int quantidade;

    public ListaEncadeada() {
        this.primeiro = null;
        this.ultimo = null;
        this.quantidade = 0;
    }

    @Override
    public void adicionar(T novoValor) {
        No<T> novoNo = new No<>(novoValor);
        if (primeiro == null) {
            this.primeiro = novoNo;
        } else {
            this.ultimo.setProx(novoNo);
        }
        this.ultimo = novoNo;
        this.quantidade++;
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