package lesson15.fibonacci;

import lesson15.fibonacci.Fibonacci;
import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {

    @Test
    public void calcNumFibonacciTest (){

        Fibonacci fibonacci = new Fibonacci();

        Assert.assertEquals(13, fibonacci.calcNumFibonacci(7));
    }
}
