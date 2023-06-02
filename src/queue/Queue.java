package queue;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.List;

public class Queue<Trem> {

    private List<Trem> fila;

    public Queue(){
        this.fila = new LinkedList<Trem>();
    }

    public boolean estaVazia(){

        return this.fila.isEmpty();
    }

    public void enfileirar(Trem x){
        this.fila.add(x);

    }

    public Trem desenfileirar() throws EmptyStackException{

        if(this.fila.isEmpty()){
            throw new EmptyStackException();
        }

        Trem x = this.fila.remove(fila.size() - fila.size());

        return x;

    }

    public int tamanho(){

        return this.fila.size();
    }
}
