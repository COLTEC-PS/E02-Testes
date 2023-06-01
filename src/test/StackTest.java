import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import stack.Stack;

public class StackTest {

    private Stack<Integer> stack;

    @Before
    public void setup() {
        stack = new Stack<>();
    }

    @Test
    public void testEstaVazia() {
        Assert.assertTrue(stack.estaVazia());
        stack.empilhar(1);
        Assert.assertFalse(stack.estaVazia());
    }

    @Test
    public void testEmpilhar() {
        stack.empilhar(1);
        stack.empilhar(2);
        stack.empilhar(3);

        Assert.assertEquals(3, stack.tamanho());
    }

    @Test
    public void testDesempilhar() throws Exception {
        stack.empilhar(1);
        stack.empilhar(2);
        stack.empilhar(3);

        Assert.assertEquals(3, stack.desempilhar().intValue());
        Assert.assertEquals(2, stack.desempilhar().intValue());
        Assert.assertEquals(1, stack.desempilhar().intValue());
        Assert.assertTrue(stack.estaVazia());
    }

    @Test(expected = Exception.class)
    public void testDesempilharPilhaVazia() throws Exception {
        stack.desempilhar();
    }
}
