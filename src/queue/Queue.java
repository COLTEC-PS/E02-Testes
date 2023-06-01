package queue;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Queue<Trem> {

    private List<Trem> lista;
    private int primeiro;

    public Queue() {
        // Inicializa a lista como um ArrayList vazio
        this.lista = new ArrayList<Trem>();
        // Define o índice do primeiro elemento como 0
        this.primeiro = lista.indexOf(0);
    }

    public boolean estaVazia() {
        // Verifica se a lista está vazia
        return this.lista.isEmpty();
    }

    public void enfileirar(Trem trem) {
        // Adiciona o elemento ao final da lista
        this.lista.add(trem);
        // Atualiza o índice do primeiro elemento
        primeiro = lista.indexOf(0);
    }

    public Trem desenfileirar() throws EmptyStackException {
        if (this.estaVazia()) {
            // Se a lista estiver vazia, lança uma exceção
            throw new EmptyStackException();
        } else {
            // Remove o elemento do início da lista
            Trem trem = lista.remove(primeiro - 1);
            // Atualiza o índice do primeiro elemento
            primeiro = lista.indexOf(0);
            // Retorna o elemento removido
            return trem;
        }
    }

    public int tamanho() {
        // Retorna o tamanho da lista
        return this.lista.size();
    }

    public List<Trem> getLista() {
        return lista;
    }

    public void setLista(List<Trem> lista) {
        this.lista = lista;
    }

    public int getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(int primeiro) {
        this.primeiro = primeiro;
    }
}