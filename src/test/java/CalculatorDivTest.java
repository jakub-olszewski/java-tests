import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class CalculatorDivTest {

    // zmienna/ pole dostepna w kazdej metodzie
    Calculator calc;

    @Before
    public void setUp() {
        calc = new CalculatorImpl();
    }

    @Test
    @FileParameters("src/test/resources/CalculatorParametersDivCSVFileTest.csv")
    public void divTest(double number1, double number2, String result) {
        calc.div(number1, number2);
        assertEquals(result, calc.display());
    }

    @Test
    public void exceptionDivideByZeroExistTest(){
        boolean isException = false;
        try {
            calc.div(1, 0);
        } catch (Exception e) {
            isException = true;
        }
        assertTrue("Exception not thow !",isException);
    }

    //testowanie ręczne
    @Test
    public void divideByZero2Test() {
        try {
            calc.div(1, 0);
        } catch (Exception e) {
            assertTrue(e instanceof IllegalArgumentException);
            assertTrue(e.getMessage().contains("Error divide by zero"));
        }
    }
}