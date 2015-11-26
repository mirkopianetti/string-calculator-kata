package it.mirko.calculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

/**
 * 
 * @author Mirko Pianetti
 * 
 * Classe per il test della funzionalità add dell'interfaccia ICalculator
 *
 */

public class CalculatorTest {

	ICalculator calculator = new CalculatorImpl();

	@Test
	public void primoTest() {
		try {
			assertEquals(calculator.add("sdaf5s4d5sd4af4sd").longValue(), 22L);
		} catch (Exception e) {
			fail();
		}
	}
 
	@Test
	public void addNullNumTest() {
		try {
			assertEquals(calculator.add("").longValue(), 0L);

		} catch (Exception e) {
			fail();
		}

	}

	@Test
	public void addOneNumTest() {
		try {
			assertEquals(calculator.add("1").longValue(), 1L);
		} catch (Exception e) {
			fail();
		}

	}

	@Test
	public void add2Num() {
		try {
			assertEquals(calculator.add("1,2").longValue(), 3L);
		} catch (Exception e) {
			fail();
		}

	}

	@Test
	public void add2NumDecTest() {
		try {
			assertEquals(calculator.add("10,21").longValue(), 31L);
		} catch (Exception e) {
			fail();
		}

	}

	@Test
	public void addNumDecTest() {

		try {
			assertEquals(calculator.add("1,2,3,4,5,6,7,8,9").longValue(), 45L);
		} catch (Exception e) {
			fail();
		}

	}

	@Test
	public void addNumDelimitersTest() {
		try {
			assertEquals(calculator.add("//;\n1;2").longValue(), 3L);
		} catch (Exception e) {
			fail();
		}

	}

	@Test
	public void addNumDelimiters_2_Test() {
		try {
			assertEquals(calculator.add("//;\n\n\n\n\n;;;1;2").longValue(), 3L);
		} catch (Exception e) {
			fail();
		}

	}
	
	@Test
	public void addNumDNewLTest() {
		try {
			assertEquals(calculator.add("1\n2,3 ").longValue(), 6L);
		} catch (Exception e) {
			fail();
		}

	}

	@Test
	public void addNumNegativeTest() {
		try {
			calculator.add("1,4,-1");
			fail();
		} catch (Exception e) {

		}

	}

	@Test
	public void addNumIgnoreBigNumberTest() {
		try {
			assertEquals(calculator.add("2;1001").longValue(), 2L);
		} catch (Exception e) {
			fail();
		}

	}
	
	@Test
	public void addNumRandomTest() {
		try {
			assertEquals(calculator.add("2%&/%(/&%(/&$%&£&%$$£&£(3)").longValue(), 5L);
		} catch (Exception e) {
			fail();
		}

	}
	
	@Test
	public void addNumRandom_1_Test() {
		try {
			calculator.add("$/=ç°éç°5..7,-3");
			fail();
		} catch (Exception e) {
			
		}

	}
	

	

}
