package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultiploTestCase {
	private ArrayList<Integer> auxiliar = new ArrayList<Integer>();
	private Multiplo multi;
	private ArrayList<Integer> cualquiera = new ArrayList<Integer>();

	@BeforeEach
	void setUp() throws Exception {
		multi= new Multiplo(7,13) ;
		
		for (int i=1; i<1001; i++) {
			auxiliar.add(i);
		}
		
		cualquiera.add(23);
		cualquiera.add(4);
		cualquiera.add(123);
	}

	@Test
	void testMultiploIgual() {
		int amount=multi.multiploIgual(3,9);		// 
		assertEquals(amount,999);
		
	}

	@Test
	void testMaximoMultiplo() {
		int amount=multi.maximoMultiplo(13);		// 
		assertEquals(amount,988);
		int amount2=multi.maximoMultiplo(7);
		assertEquals(amount2,994);
		
	}

	@Test
	void testElMaximo() {
		int amount=multi.elMaximo(cualquiera);		// 
		assertEquals(amount,123);
	}

}