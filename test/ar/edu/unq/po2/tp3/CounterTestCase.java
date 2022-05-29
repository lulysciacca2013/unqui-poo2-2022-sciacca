package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeEach;


public class CounterTestCase  {
	private Counter counter  ;
	
	@BeforeEach
	public void setUp() throws Exception {
		counter= new Counter();
		
		counter.addNumero(1);
		counter.addNumero(3);
		counter.addNumero(5);
		counter.addNumero(7);
		counter.addNumero(9);
		counter.addNumero(1);
		counter.addNumero(1);
		counter.addNumero(1);
		counter.addNumero(1);
		counter.addNumero(4);
	}
	  
	@Test
    public void testMultiplos() {
		
		int amount= counter.contadorMultiN(5);		// multiplos de 5////
		assertEquals(amount,1);
	}
	
	@Test
    public void testPares() {
		
		int amount= counter.contadorPares();	// cuenta pares	
		assertEquals(amount,1);
	}
	
	@Test
    public void testImpares() {
		
		int amount= counter.contadorImpares();		//cuenta impares
		assertEquals(amount,9);
	}

}