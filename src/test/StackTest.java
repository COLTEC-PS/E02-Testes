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
        stack.empilhar(1);
        assertFalse(stack.estaVazia());
    }

    @Test
    public void testEmpilharDesempilhat() throws Exception {
        stack.empilhar(2);
        stack.empilhar(3);
        stack.empilhar(4);
        stack.empilhar(5);
        int test = stack.desempilhar();
        assertEquals(4, test);
    }

    @Test
    public void testTamanho(){
        stack.empilhar(6);
        stack.empilhar(7);
        stack.empilhar(8);

        int tamanho = stack.tamanho();
        assertEquals(3,tamanho);
    }

    @Test  (expected = java.lang.Exception.class)
    public void testException() throws Exception {
        stack.empilhar(9);
        stack.desempilhar();
        stack.desempilhar();
    }

}
