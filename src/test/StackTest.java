package test;

import org.junit.Test;
import org.junit.Before;
import stack.Stack;

import static org.junit.Assert.*;

public class StackTest {

    Stack<Integer> stack;

    @Before
    public void init(){
        stack = new Stack<Integer>();
    }

    @Test
    public void testPilhaVazia(){
        assertTrue(stack.estaVazia());
    }

    @Test
    public void testPilhaIniciada(){
        stack.empilhar(20);
        assertFalse(stack.estaVazia());
    }

    @Test
    public void testEmpilharDesempilhar() throws Exception {
        stack.empilhar(20);
        stack.empilhar(55);
        stack.empilhar(40);
        int resultado = stack.desempilhar();
        assertEquals(13, resultado);
    }

    @Test
    public void testTamanho(){
        stack.empilhar(77);
        stack.empilhar(63);
        stack.empilhar(99);

        int tamanho = stack.tamanho();
        assertEquals(3,tamanho);
    }

    @Test  (expected = java.lang.Exception.class)
    public void testException() throws Exception {
        int resultado;

        stack.empilhar(22);
        resultado = stack.desempilhar();
        resultado = stack.desempilhar();
    }

}
