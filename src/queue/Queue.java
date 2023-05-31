package queue;

import java.util.ArrayList;
import java.util.List;

public class Queue<Trem> {

    private List<Trem> fila;
    private int topo;

    public Queue (){
        this.fila = new ArrayList<Trem>();
    }

    public void enfileirar(Trem x) {
        this.fila.add(x);
    }

    public Trem desenfileirar() throws Exception {
        if(this.filaVazia()) {
            throw new Exception();
        }

        Trem item = fila.remove(fila.size() - fila.size());

        return item;
    }

    public boolean filaVazia() {
        return this.fila.isEmpty();
    }

    public int tamanho() {
        return this.fila.size();
    }
}
