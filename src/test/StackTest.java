package test;

import org.junit.Before;
import org.junit.Test;
import stack.Stack;

import static org.junit.Assert.*;

public class StackTest {
    Stack<Integer> vetor;

    @Before
    public void init(){
        vetor = new Stack<Integer>();
    }

    @Test
    public void testPilhaVazia(){
        assertTrue(vetor.estaVazia());
    }

    @Test
    public void testPilhaIniciada(){
        vetor.empilhar(12);
        assertFalse(vetor.estaVazia());
    }

    @Test
    public void testEmpilharDesempilhar() throws Exception {
        vetor.empilhar(12);
        vetor.empilhar(13);
        vetor.empilhar(15);
        int resultado = vetor.desempilhar();
        assertEquals(13, resultado);
    }

    @Test
    public void testTamanho(){
        vetor.empilhar(12);
        vetor.empilhar(13);
        assertEquals(2,vetor.tamanho());
    }

    @Test  (expected = java.lang.Exception.class)
    public void testException() throws Exception {
        vetor.empilhar(12);
        int resultado = vetor.desempilhar();
        resultado = vetor.desempilhar();
    }



}
