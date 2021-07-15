package test;

import stack.Stack;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

import org.junit.Before;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

public class StackTest {
	
	Stack<Integer> stack;
	
	@Before
	public void init() {
		stack = new Stack<Integer>();
	}
	
	@Test
	public void testEmptyStack()
	{
		boolean empty = stack.estaVazia();
		assertTrue(empty);
	}
	
	@Test
	public void testNotEmptyStack()
	{
		stack.empilhar(null);
		boolean empty = stack.estaVazia();
		assertFalse(empty);
	}
	
	@Test (expected = Exception.class)
	public void testEmptyStackExpection() throws Exception {
		stack.empilhar(null);
		Integer resultado = stack.desempilhar();
		resultado = stack.desempilhar();
	}
	
	@Test 
	public void testPushStack() throws Exception{
		Integer push = 1;
		stack.empilhar(push);
		assertEquals(push, stack.desempilhar());
	}
	
	@Test 
	public void testPopStack() throws Exception{
		Integer push = 1;
		stack.empilhar(push);
		assertEquals(push, stack.desempilhar());
	}
	
}


/*
Os elementos estão sendo desempilhados corretamente
Se é retornado uma exceção do tipo Exception durante uma tentativa de desempilhar uma pilha vazia
*/