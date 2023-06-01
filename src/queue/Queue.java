package queue;

import java.util.LinkedList;

public class Queue<T> {

    private LinkedList<T> elementos;

    public Queue() {
        this.elementos = new LinkedList<>();
    }

    public boolean estaVazia() {
        return elementos.isEmpty();
    }

    public int tamanho() {
        return elementos.size();
    }

    public void enfileirar(T elemento) {
        elementos.add(elemento);
    }

    public T desenfileirar() throws Exception {
        if (estaVazia()) {
            throw new Exception("A fila está vazia.");
        }

        return elementos.poll();
    }
}
