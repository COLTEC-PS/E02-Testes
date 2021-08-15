package test;

import org.junit.Before;
import org.junit.Test;
import stack.Stack;

import static org.junit.Assert.*;

public class StackTest { //classe que contém todos os métodos de teste

    Stack<Integer> stack;

    @Before
    public void initStack(){
        //instancia a pilha
        stack = new Stack<Integer>(); // contexto do que deverá ser instanciado para testar
    }

    @Test
    public void testEmptyStack() { // método que testa o método estaVazia
        assertTrue(stack.estaVazia()); // verifica se o retorno de estáVazia é o esperado
    }

    @Test
    public void testNotEmptyStack(){ // método que testa o método empilhar
        stack.empilhar(10);
        assertFalse(stack.estaVazia()); // assert testa se a pilha não está vazia
    }

}
