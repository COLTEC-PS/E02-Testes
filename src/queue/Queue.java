package queue;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Queue<Trem> {

    private List<Trem> lista;

    public Queue(){
        lista = new ArrayList<>();
    }

    public boolean estaVazia(){
        return (lista.size() == 0);
    }

    public int tamanho(){
        return lista.size();
    }

    public void enfileirar(Trem x){
        this.lista.add(x);
    }

    public Trem desenfileirar() throws EmptyStackException {
        if (this.estaVazia()){
            new EmptyStackException();
        }
        return (this.lista.remove(0));
    }
}
