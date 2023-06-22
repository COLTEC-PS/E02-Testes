package queue;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.List;

public class Queue<Trem> {

    private List<Trem> fila;

    public Queue(){
        this.fila = new LinkedList<Trem>();
    }

    public boolean empty(){

        return this.fila.isEmpty();
    }

    public void adicionar(Trem x){
        this.fila.add(x);

    }

    public Trem retirar() throws EmptyStackException {

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
