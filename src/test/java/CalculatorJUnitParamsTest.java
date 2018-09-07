import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class CalculatorJUnitParamsTest {

    @Test
    @Parameters({"1, 1, 2.0", "2, 2, 4.0"})
    public void addTest(int number1, int number2, String result) {
        System.out.println("Uruchamiam metode addTest()");
        System.out.println(String.format("a=%s b=%s result=%s",number1,number2,result));

        // given
        Calculator calc = new CalculatorImpl();

        // when
        calc.add(number1,number2);

        // then
        assertTrue(result.equals(calc.display()));
    }
}
