package test;

import org.junit.Before;
import org.junit.Test;
import stack.Stack;

import static org.junit.Assert.*;

public class StackTest {

    Stack<Integer> stack = new Stack<Integer>();

    @Before
    public void init() {
        this.stack = new Stack<>();
    }

    @Test
    public void testEstaVazia() {
        assertTrue(stack.estaVazia());
    }

    @Test
    public void testPilhaNaoEstaVazia() {
        stack.empilhar(10);
        assertFalse(stack.estaVazia());
    }

    @Test
    public void testEmplihar() {
        stack.empilhar(5);
        stack.empilhar(5);
        stack.empilhar(5);
        stack.empilhar(5);
        stack.empilhar(5);
        stack.empilhar(5);

        assertEquals(6, stack.tamanho());
    }

    @Test
    public void testDesemplilhar() throws Exception{
        stack.empilhar(5);
        stack.empilhar(10);

        stack.desempilhar();

        int retorno = stack.desempilhar();

        assertEquals(5, retorno);

    }

    @Test(expected = java.util.EmptyStackException.class)
    public void testDesempilharPilhaVazia() {
        stack.desempilhar();
    }

}
