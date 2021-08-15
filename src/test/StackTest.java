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
        stack.empilhar(10); // insere um valor na pilha
        stack.empilhar(20);
        stack.empilhar(20);
        assertFalse(stack.estaVazia()); // assert testa se a pilha não está vazia
    }

    @Test
    public void testSizeStack(){
        stack.empilhar(10); // insere um valor na pilha
        stack.empilhar(20);
        stack.empilhar(30);
        int size = stack.tamanho(); // executa o método que retorna o tamanho da pilha
        assertEquals(3, size); // compara se o retorno do método é igual ao tamanho esperado (3)
    }

    @Test
    public void testPushAndPop() throws Exception {
        stack.empilhar(10); // insere um valor na pilha
        stack.empilhar(20);
        stack.empilhar(30);
        int popResult = stack.desempilhar(); // retira valor da pilha
        popResult = stack.desempilhar();
        assertEquals(20, popResult); // testa se o único valor que sobrou na pilha é o 20
    }

    

}
