package queue;

public class Queue<Trem> {

    private List<Trem> fila;

    public Queue() {
        this.fila = new ArrayList<>();
    }

    public void enfileirar(T elemento) {
        fila.add(elemento);
    }

    public Trem desenfileirar() throws Exception {
        if (estaVazia()) {
            throw new Exception("A fila está vazia. Não é possível desenfileirar.");
        }

        return fila.remove(0);
    }

    public boolean estaVazia() {
        return fila.isEmpty();
    }

    public int tamanho() {
        return fila.size();
    }

}
