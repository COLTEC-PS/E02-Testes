package stack;

import java.util.ArrayList;
import java.util.List;

public class Stack<String> {

    private List<String> vetor;
    private int topo;

    public Stack (){
        this.vetor = new ArrayList<String>();
        this.topo = 0;
    }

    public void empilhar(String x) {
        this.vetor.add(x);
        this.topo++;
    }

    public String desempilhar() throws Exception {
        if(this.estaVazia()) {
            return null;
        }

        return this.vetor.get(this.topo);
    }

    public boolean estaVazia() {
        return this.vetor.isEmpty();
    }

    public int tamanho() {
        return this.vetor.size();
    }
}

