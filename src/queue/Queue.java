package queue;

import java.util.ArrayList;

public class Queue<Trem> {

    private ArrayList<Trem> vetor;

    public Queue (){
        this.vetor = new ArrayList<Trem>();
    }

    public void enfileirar(Trem x) {
        this.vetor.add(x);
    }

    public Trem desenfileirar(){
        this.vetor.remove(0);
        return vetor.get(0);
    }

    public boolean estaVazia() {
        return this.vetor.isEmpty();
    }

    public int tamanho() {
        return this.vetor.size();
    }
}
