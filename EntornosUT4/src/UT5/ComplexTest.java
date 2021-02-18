package UT5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ComplexTest {

	@Test
	void testSumar() //Este método suma 2 números complejos:
	{
		//FÓRMULA: (a + c, b + d)
		
		//VARIABLES:
		Complex numero1 = new Complex(55, 100);
		Complex numero2 = new Complex(80, 20);
		
		/*N_obtenido es la variable que llama al método de la clase
	      y realiza la operacion.*/
		Complex n_obtenido = numero1.sumar(numero2);
		
		/*n_esperado es la variable en la que apuntamos los resultados
		  de la operación*/
		Complex n_esperado = new Complex (135, 120);
		
		/*Con assertEquals comprobamos que los resultados de la fórmula
		  del método como los que introducimos en la variable n_esperado
		  son iguales.*/
		assertEquals(n_obtenido, n_esperado); 
	}

	
	@Test
	void testRestar() //Este método resta 2 números complejos:
	{
		//FÓRMULA: (a - c, b - d)
		
		//VARIABLES:
		Complex numero1 = new Complex(55, 100);
		Complex numero2 = new Complex(80, 20);
		
		Complex n_obtenido = numero1.restar(numero2);
		Complex n_esperado = new Complex (-25, 80);
		assertEquals(n_obtenido, n_esperado);
	}
	
	
	@Test
	void testRestar2() //Restamos números complejos con 0.
	{	
		//VARIABLES:
		Complex numero1 = new Complex(0, 30);
		Complex numero2 = new Complex(7, 0);
		
		Complex n_obtenido = numero1.restar(numero2);
		Complex n_esperado = new Complex (-7, 30);
		assertEquals(n_obtenido, n_esperado);
	}
	
	
	@Test
	void testRestar3() //Restamos números complejos negativos.
	{
		//VARIABLES:
		Complex numero1 = new Complex(-23, -15);
		Complex numero2 = new Complex(-7, -650);
		
		Complex n_obtenido = numero1.restar(numero2);
		Complex n_esperado = new Complex (-16, 635);
		assertEquals(n_obtenido, n_esperado);
	}

	
	@Test
	void testMultiplicarComplex() //Este método multiplica 2 números complejos:
	{
		//FÓRMULA: (a*c – b*d, a*d + b*c)
		
		//VARIABLES:
		Complex numero1 = new Complex(5, 10);
		Complex numero2 = new Complex(8, 2);
		
		Complex n_obtenido = numero1.multiplicar(numero2);
		Complex n_esperado = new Complex (20, 90);
		assertEquals(n_obtenido, n_esperado);
	}

	
	@Test
	void testMultiplicarDouble() //Este método multiplica un número complejo
								 //con un número decimal que queramos. 
	{
		//FÓRMULA: (a * n, b * n) --> n es un número que escojamos.
		
		//VARIABLES:
		Complex numero1 = new Complex(5, 10);
		
		Complex n_obtenido = numero1.multiplicar(7.5);
		Complex n_esperado = new Complex (37.5, 75);
		assertEquals(n_obtenido, n_esperado);
	}

	
	@Test
	void testDividir1() //Este método divide dos números complejos.
	{
		//FÓRMULA: ((a*c + b*d) / (c^2 + d^2) , (b*c – a*d) / (c^2 + d^2))
		
		//VARIABLES:
		Complex numero1 = new Complex(8, 10);
		Complex numero2 = new Complex(2, 5);
		
		/*Definimos estas variables como las fórmulas que hay que aplicar porque
		  comprobar el método. Lo definimos como double.*/
		double primero = (double)(8*2 + 10*5)/(double)(2*2 + 5*5);
		double segundo = (double)(10*2 - 8*5)/(double)(2*2 + 5*5);
		
		Complex n_obtenido = numero1.dividir(numero2);
		Complex n_esperado = new Complex (primero, segundo);
		assertEquals(n_obtenido, n_esperado);
	}
	
	
	@Test
	void testDividir2() //En este caso dividimos usando 0.
	{
		//FÓRMULA: ((a*c + b*d) / (c^2 + d^2) , (b*c – a*d) / (c^2 + d^2))
		
		Complex numero1 = new Complex(98, 0); //8-10
		Complex numero2 = new Complex(0, 15); //2-5
		
		double primero = (double)(98*0 + 0*15)/(double)(0*0 + 15*15);
		double segundo = (double)(0*0 - 98*15)/(double)(0*0 + 15*15);
		
		Complex n_obtenido = numero1.dividir(numero2);
		Complex n_esperado = new Complex (primero, segundo);
		assertEquals(n_obtenido, n_esperado);
	}
	
	
	@Test
	void testDividir3() //Ahora dividimos usando números negativos.
	{
		//FÓRMULA: ((a*c + b*d) / (c^2 + d^2) , (b*c – a*d) / (c^2 + d^2))
		
		Complex numero1 = new Complex(34, -2); //8-10
		Complex numero2 = new Complex(-4, 30); //2-5
		
		double primero = (double)(34*-4 + -2*30)/(double)(-4*-4 + 30*30);
		double segundo = (double)(-2*-4 - 34*30)/(double)(-4*-4 + 30*30);
		
		Complex n_obtenido = numero1.dividir(numero2);
		Complex n_esperado = new Complex (primero, segundo);
		assertEquals(n_obtenido, n_esperado);
	}
	

	@Test
	void testEqualsObject() /*Comprovamos mediante assertTrue / assertFalse
							  si los números son iguales o diferentes. Ambos
							  casos nos los tiene que dar bien*/
	{
		Complex numero1 = new Complex(5, 8);
		Complex numero2 = new Complex(5, 8);
				
		assertTrue(numero1.equals(numero2));
	}
	
	
	@Test
	void testEqualsObject2()
	{
		Complex numero1 = new Complex(5, 8);
		Complex numero3 = new Complex(3.5, 6.7);
				
		assertFalse(numero1.equals(numero3));
	}
	
}
