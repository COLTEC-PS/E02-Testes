package stack;

import java.util.ArrayList;
import java.util.List;

public class Stack<Trem> {

    private List<Trem> vetor;
    private int topo;

    public Stack (){
        this.vetor = new ArrayList<Trem>();
        this.topo = -1;
    }

    public void empilhar(Trem x) {
        this.vetor.add(x);
        this.topo++;
    }

    public Trem desempilhar() throws Exception {
        if(this.estaVazia()) {
            throw new Exception("A pilha esta vazia. Não é possivel desempilhar");
        }
        Trem elementoDesempilhado = this.vetor.get(this.topo);
        this.vetor.remove(this.topo);
        this.topo--;

        return elementoDesempilhado;
    }

    public boolean estaVazia() {
        return this.topo == -1;
    }

    public int tamanho() {
        return this.topo +1;
    }
}

