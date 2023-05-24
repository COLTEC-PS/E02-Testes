package queue;


import java.util.ArrayList;
import java.util.List;

public class Queue<Trem> {

    private List<Integer> fila;
    private int inicio;

    public Queue(){
        this.fila = new ArrayList<Integer>();
        inicio = 0;
    }

    public boolean estaVazia(){
        return this.fila.isEmpty();
    }

    public void enfileirar(Integer numero){
        this.fila.add(numero);
    }

    public int tamanho(){
        return this.fila.size();
    }

    public Integer desenfileirar(){
        if( this.estaVazia()){
            return null;
        }

        return this.fila.get(this.inicio++);
    }
}
