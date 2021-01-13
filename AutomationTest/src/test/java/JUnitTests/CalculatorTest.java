package JUnitTests;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void addOnetotwo_mustbethree() {

		Calculator calcul = new Calculator();

		int actualResult = calcul.add(1, 2);
		int expectedResult = 3;

		Assert.assertEquals(expectedResult, actualResult);

	}
}