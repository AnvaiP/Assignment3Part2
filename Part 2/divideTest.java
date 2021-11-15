package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class divideTest {

	@Test
	void test() {
		JunitTesting test = new JunitTesting();
		double output = test.divide(10,1);
		assertEquals(10, output);
	}
	
	@Test
	void test1() {
		JunitTesting test = new JunitTesting();
		double output = test.divide(10,10);
		assertEquals(10, output);
	}

}
