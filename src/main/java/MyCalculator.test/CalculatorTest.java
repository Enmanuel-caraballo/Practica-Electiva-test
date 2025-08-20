package MyCalculator.test;

import MyCalculator.Calculadora;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    private final Calculadora clc = new Calculadora();

    @Test
    public void testSumar(){
        assertEquals(clc.sumar(1,2),3);
    }

    @Test
    public void testRestar(){
        assertEquals(clc.restar(2,2),0);
    }

    @Test
    public void testMultiplicar(){
        assertEquals(clc.multiplicar(5,2),10);
    }

    @Test
    public void testDividir(){
        assertEquals(clc.dividir(5,2),2);
    }
}