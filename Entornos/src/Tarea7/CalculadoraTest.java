package Tarea7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
	Calculadora calculate = new Calculadora();
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	System.out.println("---Inicio de las pruebas---");
	}
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	System.out.println("---Final de las pruebas---");
	}
	@Test
	void testCalculadora() {
		System.out.println("Casos de prueba de todos los m�todos");
		assertEquals(8, calculate.suma(3, 5));
		assertEquals(-2, calculate.resta(3, 5));
		assertEquals(15, calculate.multiplica(3, 5));
		assertEquals(3, calculate.divide(15, 5));
	}

	@Test
	void testSuma() {
		System.out.println("Casos de prueba del m�todo suma");
		assertEquals(2,calculate.suma(1,1));
		assertNotEquals(3,calculate.suma(1,1));
	}
	@Test
	void testResta() {
		System.out.println("Casos de prueba del m�todo resta");
		int[] array = new int[10]; 
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random()* 10) ;
		}
		for (int i = 0; i < array.length; i++) {
			assertEquals(array[i]-array[i], calculate.resta(array[i],array[i]));
		}
	}
	
	@Test
	void testMultiplica() {
		System.out.println("Casos de prueba del m�todo multiplica");
		int[] array = new int[10]; 
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random()* 10) ;
		}
		for (int i = 0; i < array.length; i++) {
			assertEquals(array[i]*array[i], calculate.multiplica(array[i],array[i]));
		}
	}
	
	@Test
	void testDivide() {
		System.out.println("Casos de prueba del m�todo divisi�n");
		try {
		assertEquals(0, calculate.divide(15, 0));
		} catch ( Exception e) {
			System.out.println("Divisi�n por 0 producida");
			}
			}

	}



