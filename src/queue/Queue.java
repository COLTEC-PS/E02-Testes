package queue;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Queue<Trem> {

    private List<Trem> lista;
    private int primeiro;

    public Queue() {
        this.lista = new ArrayList<Trem>();
        this.primeiro = lista.indexOf(0);
    }

    public boolean estaVazia() {
        return this.lista.isEmpty();
    }

    public void enfileirar(Trem trem) {
        this.lista.add(trem);
        primeiro = lista.indexOf(0);
    }

    public Trem desenfileirar() throws EmptyStackException {
        if (this.estaVazia()) {
            throw new EmptyStackException();
        } else {
            Trem trem = lista.remove(primeiro-1);
            primeiro = lista.indexOf(0);
            return trem;
        }
    }

    public int tamanho() {
        return this.lista.size();
    }

    public List<Trem> getLista() {
        return lista;
    }

    public void setLista(List<Trem> lista) {
        this.lista = lista;
    }

    public int getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(int primeiro) {
        this.primeiro = primeiro;
    }
}
