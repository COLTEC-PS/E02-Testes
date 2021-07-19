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

    public void enfileirar(Trem x) {
        fila.add(x);
    }

    public Trem desenfileirar() throws Exception {
        if (estaVazia()) {
            throw new Exception();
        }
        return fila.poll();
    }

    public int tamanho() {
        return fila.size();
    }

}
