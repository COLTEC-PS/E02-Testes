package stack;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Stack<Trem> {

    private List<Trem> vetor;
    private int topo;

    public Stack() {
        // Inicializa o vetor como um ArrayList vazio
        this.vetor = new ArrayList<Trem>();
        // Define o topo como 0
        this.topo = 0;
    }

    public void empilhar(Trem x) {
        // Adiciona o elemento ao final do vetor
        this.vetor.add(x);
        // Incrementa o topo
        this.topo++;
    }

    public Trem desempilhar() throws EmptyStackException {
        if (this.estaVazia()) {
            // Se o vetor estiver vazio, lança uma exceção
            throw new EmptyStackException();
        } else {
            // Remove o elemento do topo do vetor
            Trem trem = vetor.remove(topo - 1);
            // Decrementa o topo
            topo--;
            // Retorna o elemento removido
            return trem;
        }
    }

    public boolean estaVazia() {
        // Verifica se o vetor está vazio
        return this.vetor.isEmpty();
    }

    public int tamanho() {
        // Retorna o tamanho do vetor
        return this.vetor.size();
    }
}
