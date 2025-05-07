import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalcTest {
	Calc calc;
	
	@BeforeEach
	void setup() {
		calc = new Calc();
	}
	@Test
	void testMultip() {
		assertEquals(20, calc.mul(4, 5), "Multiply does not work");
	}
	@Test 
	void testadd() {
		assertEquals(10, calc.add(5, 5), "Addition does not work");
	}
}
