package test;

import org.junit.Test;
import stack.Stack;

import static org.junit.Assert.*;

import java.beans.Transient;


public class StackTest {

    Stack<Integer> stack;

    @Before
    public void init(){
        stack = new Stack<Integer>();
    }

    @Test
    public void testEmptyStack(){
        assertTrue(stack.estaVazia());
    }

    @Test 
    public void testNotEmptyStack(){
        stack.empilhar(10);
        assertFalse(stack.estaVazia());
    }

    @Test
    public void testEnmpilha() {
        stack.empilhar(1);
        stack.empilhar(2);
        assertEquals(2, stack.tamanho());
    }

    @Test
    public void testDesempilha() {
        stack.empilhar(1);
        stack.empilhar(2);

        stack.desempilhar();
        assertEquals(0, stack.tamanho());
    }

    @Test(expected = java.lang.Exception.class)
    public void testDesempilharVazia() {
        stack.desempilhar();
    }
}
