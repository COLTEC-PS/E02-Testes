package test;

import org.junit.Before;
import org.junit.Test;
import stack.Stack;

import java.util.EmptyStackException;

import static org.junit.Assert.*;

public class StackTest {

    Stack <Integer> stack;

    @Before
    public void init(){
        stack = new Stack<Integer>();
    }

    @Test
    public void testEstaVazia(){
        assertTrue(stack.estaVazia());
    }

    @Test(expected = java.util.EmptyStackException.class)
    public void testDesempilharException() {
        int result = stack.desempilhar();
    }

    @Test
    public void testNaoEstaVazia(){
        stack.empilhar(100);
        assertFalse(stack.estaVazia());
    }

    @Test
    public void testEmpilharDesempilhar() {

        stack.empilhar(10);
        stack.empilhar(20);
        stack.empilhar(30);

        stack.desempilhar();
        int a = stack.desempilhar();
        assertEquals(20, a);
    }

    @Test
    public void testSize(){
        stack.empilhar(1);
        stack.empilhar(2);
        stack.empilhar(3);
        int size = stack.tamanho();
        assertEquals(3, size);
    }


}
