package queue;

import java.util.ArrayList;
import java.util.List;

public class Queue<Trem> {
	private List<Trem> vetor;
    
    public Queue (){
        this.vetor = new ArrayList<Trem>();
    }
    
    public boolean estaVazia() {
        return this.vetor.isEmpty();
    }
    
    public void enfileirar(Trem x) {
        this.vetor.add(x);
    }

    public Trem desenfileirar() throws Exception {
        if(this.estaVazia()) {
            return null;
        }

        return vetor.get(0);
    }
    
    public int tamanho() {
        return this.vetor.size();
    }
}
