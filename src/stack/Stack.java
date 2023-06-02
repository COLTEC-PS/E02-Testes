package stack;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Stack<Trem> {

    private List<Trem> vetor;
    private int topo;

    public Stack (){
        this.vetor = new ArrayList<Trem>();
        this.topo = 0;
    }

    public void empilhar(Trem x) {
        this.vetor.add(x);
        this.topo++;
    }

    public Trem desempilhar() throws EmptyStackException {
        if(this.estaVazia()) {
            throw new EmptyStackException();
        }

        Trem x = this.vetor.remove(vetor.size() - 1);
        topo = topo - 1;
        return x;
    }

    public boolean estaVazia() {
        return this.vetor.isEmpty();
    }

    public int tamanho() {
        return this.vetor.size();
    }
}

