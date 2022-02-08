package Tarea7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class tarea6Test {


	@Test
	void testEj1() {
		assertEquals(4, tarea6.ej1(0, 1, 1 ));
		assertEquals(4, tarea6.ej1(2, 2, 0 ));
		assertEquals(4, tarea6.ej1(2, 6, 3 ));
		assertEquals(6, tarea6.ej1(2, 6, 1 ));
	}

	@Test
	void testEj2() {
		assertEquals(6, tarea6.ej2(2, 0, 0 ));
		assertEquals(6, tarea6.ej2(0, 6, 0 ));
		assertEquals(6, tarea6.ej2(0, 2, 1 ));
		assertEquals(4, tarea6.ej2(0, 2, 3 ));
	}

	@Test
	void testEj5() {
		assertEquals(1, tarea6.ej5(1, 1));
		assertEquals(1, tarea6.ej5(2, 1));
		assertEquals(1, tarea6.ej5(1, 2));
	}

	@Test
	void testEj6() {
		assertEquals(-1,tarea6.ej6(0, 6, 5 ));
		assertEquals(0, tarea6.ej6(5, 8, 10 ));
		assertEquals(0, tarea6.ej6(5, 1, 3 ));
		assertEquals(1, tarea6.ej6(5, 3, 8 ));
	}

	@Test
	void testEj8() {
		assertEquals(0, tarea6.ej8(1, -1));
		assertEquals(2, tarea6.ej8(3, 5));
		assertEquals(1, tarea6.ej8(3, 0));
	}

}
