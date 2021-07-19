package queue;

import java.util.List;
import java.util.ArrayList;

public class Queue<Trem> {


    private List<Trem> fila;


    public Queue() {
        this.fila = new ArrayList<Trem>();
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
        return fila.get(0);
    }

    public int tamanho() {
        return fila.size();
    }

}
