package test;

import org.junit.Before;
import org.junit.Test;
import stack.Stack;

import static org.junit.Assert.*;

public class StackTest {
    Stack<Integer> pilha;

    @Before
    public void init(){
        this.pilha = new Stack<Integer>();
    }

    @Test
    public void testPilhaVazia(){

        assertTrue(pilha.estaVazia());
    }

    @Test
    public void testPilhaNaoVazia(){

        pilha.empilhar(10);
        assertFalse(pilha.estaVazia());

    }

    @Test
    public void testEmpilha(){

        pilha.empilhar(20);
        pilha.empilhar(40);
        pilha.empilhar(60);

        assertEquals(3, pilha.tamanho());

    }

    @Test
    public void testDesempilha() {

        pilha.empilhar(10);
        pilha.empilhar(20);
        pilha.empilhar(30);

        int resultado = pilha.desempilhar();
        assertEquals(30, resultado);

    }

    @Test(expected = java.util.EmptyStackException.class)
    public void testDesempilharException(){

        pilha.empilhar(10);
        int resultado = pilha.desempilhar();
        resultado = pilha.desempilhar();

    }
}
