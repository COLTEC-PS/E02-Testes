package test;

import org.junit.Test;
import stack.Stack;

import static org.junit.Assert.*;

public class StackTest {

    @Test
    public void testEmptyStack() {
        Stack<Integer> stack = new Stack();
        boolean empty = stack.estaVazia();
        assertTrue(empty);
    }

    @Test
    public void testNotEmptyStack() {
        Stack<Integer> stack = new Stack();
        stack.empilhar(10);
        assertFalse(stack.estaVazia());
    }

    @Test
    public void testSizeStack() {
        Stack<Integer> stack = new Stack();
        stack.empilhar(10);
        stack.empilhar(20);
        stack.empilhar(30);
        int size = stack.tamanho();
        assertEquals(3,size);
    }

    @Test
    public void testPushPopStack() {
        Stack<Integer> stack = new Stack();
        stack.empilhar(10);
        stack.empilhar(20);
        stack.empilhar(30);
        int result = stack.desempilhar();
        result = stack.desempilhar();
        assertEquals(20,result);
    }

    @Test(expected = java.util.EmptyStackException.class)
    public void testEmptyStackException() {
        Stack<Integer> stack = new Stack();
        stack.empilhar(10);
        int result = stack.desempilhar();
        result = stack.desempilhar();
    }

}
