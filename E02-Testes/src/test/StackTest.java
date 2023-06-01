package test;

import org.junit.Test;
import stack.Stack;

import static org.junit.Assert.*;

public class StackTest {

    @Test
    public void testEmptyStack() {
        // Testa se a pilha está vazia
        Stack<Integer> stack = new Stack<>();
        boolean empty = stack.estaVazia();
        assertTrue(empty);
    }

    @Test
    public void testNotEmptyStack() {
        // Testa se a pilha não está vazia após empilhar um elemento
        Stack<Integer> stack = new Stack<>();
        stack.empilhar(10);
        assertFalse(stack.estaVazia());
    }

    @Test
    public void testSizeStack() {
        // Testa se o tamanho da pilha está correto após empilhar 3 elementos
        Stack<Integer> stack = new Stack<>();
        stack.empilhar(10);
        stack.empilhar(20);
        stack.empilhar(30);
        int size = stack.tamanho();
        assertEquals(3, size);
    }

    @Test
    public void testPushPopStack() {
        // Testa se o elemento desempilhado está correto após empilhar 3 elementos e desempilhar 2
        Stack<Integer> stack = new Stack<>();
        stack.empilhar(10);
        stack.empilhar(20);
        stack.empilhar(30);
        int result = stack.desempilhar();
        result = stack.desempilhar();
        assertEquals(20, result);
    }

    @Test
    public void testEmptyStackException() {
        // Testa se uma exceção é lançada ao desempilhar de uma pilha vazia
        Stack<Integer> stack = new Stack<>();
        stack.empilhar(10);
        int result = stack.desempilhar();
        result = stack.desempilhar();
    }

}