package queue;

import java.util.LinkedList;

public class Queue<Trem> {


    private LinkedList<Trem> fila;


    public Queue() {
        this.fila = new LinkedList<Trem>();
    }

    public boolean estaVazia() {
        return fila.isEmpty();
    }

    public int tamanho() {
        return fila.size();
    }

    public void enfileirar(Trem trem) {
        fila.add(trem);
    }

    public Trem desenfileirar() throws Exception {
        if (estaVazia()) {
            throw new Exception();
        }
        return fila.remove();
    }
}
