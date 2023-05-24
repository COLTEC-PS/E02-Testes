package test;

import org.junit.Before;
import org.junit.Test;
import stack.Stack;

import static org.junit.Assert.*;

public class StackTest {

    Stack<String> stack;

    @Before
    public void init(){
        stack = new Stack<String>();
    }

    @Test
    public void testEstaVazia(){
        assertTrue(stack.estaVazia());
    }

    @Test
    public void testNotEmptyStack(){
        stack.empilhar("10");
        assertFalse(stack.estaVazia());
    }

    @Test
    public void testEmpilha() {
        stack.empilhar("Primeiro");
        stack.empilhar("Segundo");
        stack.empilhar("Terceiro");

        int tamanho = stack.tamanho();
        assertEquals(3, tamanho);
    }

    @Test
    public void testDesempilha(){
        stack.empilhar("Primeiro");
        stack.empilhar("Segundo");
        stack.empilhar("Terceiro");

        String desempilhado = stack.desempilhar();
        desempilhado = stack.desempilhar();

        assertEquals("Segundo", desempilhado);
    }

    @Test(expected = java.util.EmptyStackException.class)
    public void testDesempilha(){
        stack.empilhar("Primeiro");

        String desempilhado = stack.desempilhar();
        desempilhado = stack.desempilhar();
    }
}
