package queue;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Queue<Trem> {

    private LinkedList<Trem> fila;

    public void enfileirar(Trem x){
        this.fila.add(x);
    }

    public boolean estaVazia() {
        return this.fila.isEmpty();
    }

    public int tamanho() {
        return this.fila.size();
    }

    public int desenfileirar(){
        return (int) this.fila.remove();
    }

}
