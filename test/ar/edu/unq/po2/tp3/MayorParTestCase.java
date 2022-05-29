package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class MayorParTestCase {
	private MayorPar mayor;
	private ArrayList<Integer> auxiliar = new ArrayList<Integer>();

	@BeforeEach
	void setUp() throws Exception {
		mayor= new MayorPar() ;
		
		mayor.addNumero(5394128);
	    mayor.addNumero(544900);
	    mayor.addNumero(125555);
	    mayor.addNumero(1222222);
	    auxiliar.add(1);
	    auxiliar.add(0);
	    auxiliar.add(0);
	    auxiliar.add(0);
	    auxiliar.add(0);
	    auxiliar.add(0);
	    auxiliar.add(0);
	    
	}
	
    

	@Test
	void testMayorDigitosPares() {
		int amount=mayor.mayorDigitosPares();		// 
		assertEquals(amount,1222222);
	}

	@Test
	void testDesarmoNumero() {
		int amount=mayor.desarmoNumero(1000000);		// 
		assertEquals(amount,6);
	}

	@Test
	void testContadorPares() {
		
		int amount=mayor.contadorPares(auxiliar);		// /
		assertEquals(amount,6);
	}

}