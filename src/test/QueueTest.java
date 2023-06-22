package test;

import org.junit.Before;
import org.junit.Test;
import queue.Queue;

import static org.junit.Assert.*;

    public class QueueTest {

        private Queue<Integer> fila;

        @Before
        public void init() {
            this.fila = new Queue<>();
        }

        @Test
        public void testFilaVazia() {
            assertTrue(fila.empty());
        }

        @Test
        public void testfilaNaoEstaVazia() {
            this.fila.adicionar(10);
            assertFalse(fila.empty());
        }

        @Test
        public void testNumElementosNaFila() {
            fila.adicionar(10);
            fila.adicionar(10);
            fila.adicionar(10);
            fila.adicionar(10);
            fila.adicionar(10);
            fila.adicionar(10);
            fila.adicionar(10);
            fila.adicionar(10);
            fila.adicionar(10);
            fila.adicionar(10);

            assertEquals(10, fila.tamanho());
        }

        @Test
        public void testEnfileirar() {
            fila.adicionar(10);
            fila.adicionar(20);
            fila.adicionar(30);

            assertEquals(3, fila.tamanho());
        }

        @Test
        public void testDesenfileirar() {
            fila.adicionar(10);
            fila.adicionar(100);
            fila.adicionar(1000);
            fila.adicionar(0);

            fila.retirar();
            int retorno = fila.retirar();

            assertEquals(100, retorno);
        }

        @Test(expected = java.lang.Exception.class)
        public void testDesenfileirarFilaVazia() {
            fila.retirar();
        }
    }