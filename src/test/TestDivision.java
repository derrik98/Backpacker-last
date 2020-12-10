package test;

import logic.BasicCalculations;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestDivision {

	@Test
	public void testDivision() {
		
		BasicCalculations b = new BasicCalculations();
		double output = b.perfectDivision(22, 10);
		System.out.println(output);
		assertEquals((double) 2, output, 1);
	}
}
