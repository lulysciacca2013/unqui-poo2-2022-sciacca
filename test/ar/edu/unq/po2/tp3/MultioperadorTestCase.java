package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultioperadorTestCase {
	private Multioperador multi;

	@BeforeEach
	void setUp() throws Exception {//
		multi = new Multioperador();
		
		multi.addNumero(1);
		multi.addNumero(9);
		multi.addNumero(8);
		multi.addNumero(7);
		multi.addNumero(6);
		multi.addNumero(5);
		multi.addNumero(4);
		multi.addNumero(3);
		
	}

	@Test
	void testSumaMulti() {
		int prueba = multi.sumaMulti();
		assertEquals(prueba,43);
	}

	@Test
	void testRestaMulti() {
		int prueba = multi.restaMulti();
		assertEquals(prueba,-43);
	}

	@Test
	void testProductoMulti() {
		int prueba = multi.productoMulti();
		assertEquals(prueba,181440);
	}

}