/**
 * 
 */
package UT5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
class testsOperaciones {

	@Test
	@DisplayName("Suma de 3+4 = 7.")
	void testSumar() {
		int suma = Operaciones.sumar(3, 4);
		assertEquals(suma, 7);
	}
	
	@Test
	@DisplayName("Suma de 50-10 = 40.")
	void testRestar() {
		int resta = Operaciones.restar(50, 10);
		assertEquals(resta, 40);
	}


	
}
