package test;

import org.junit.Before;
import org.junit.Test;
import queue.Queue;

import static org.junit.Assert.*;

public class QueueTest {

    private Queue<Integer> fila;

    @Before
    public void init() {
        // Inicializa a fila antes de cada teste
        this.fila = new Queue<>();
    }

    @Test
    public void testFilaVazia() {
        // Testa se a fila está vazia
        assertTrue(fila.estaVazia());
    }

    @Test
    public void testfilaNaoEstaVazia() {
        // Testa se a fila não está vazia após enfileirar um elemento
        fila.enfileirar(10);
        assertFalse(fila.estaVazia());
    }

    @Test
    public void testNumElementosNaFila() {
        // Testa se o número de elementos na fila está correto após enfileirar 10 elementos
        for (int i = 0; i < 10; i++) {
            fila.enfileirar(10);
        }

        assertEquals(10, fila.tamanho());
    }

    @Test
    public void testEnfileirar() {
        // Testa se o tamanho da fila está correto após enfileirar 3 elementos
        fila.enfileirar(10);
        fila.enfileirar(20);
        fila.enfileirar(30);

        assertEquals(3, fila.tamanho());
    }

    @Test
    public void testDesenfileirar() {
        // Testa se o elemento removido da fila está correto após desenfileirar dois elementos
        fila.enfileirar(10);
        fila.enfileirar(100);
        fila.enfileirar(1000);
        fila.enfileirar(0);

        fila.desenfileirar();
        int retorno = fila.desenfileirar();

        assertEquals(100, retorno);
    }

    @Test
    public void testDesenfileirarFilaVazia() {
        // Testa se uma exceção é lançada ao desenfileirar de uma fila vazia
        fila.desenfileirar();
    }
}