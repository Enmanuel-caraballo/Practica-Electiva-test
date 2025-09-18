package MyCalculator.test;
import org.example.Main;
import MyCalculator.Calculadora;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.*;


public class CalculatorTest {
    private final Calculadora clc = new Calculadora();

//    @Test
//    public void  VerificarEntradaValidaTest(){
//        String entradaSimulada = "abc\n5\n6\n";
//        InputStream input  = new ByteArrayInputStream(entradaSimulada.getBytes());
//        System.setIn(input);
//
//        try{
//          Main.main(new  String[]{});
//
//        } catch (Exception e) {
//            fail("El programa no deberia salir");
//        }
//    }
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